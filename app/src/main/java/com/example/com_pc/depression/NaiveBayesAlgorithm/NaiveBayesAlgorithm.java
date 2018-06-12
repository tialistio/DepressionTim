package com.example.com_pc.depression.NaiveBayesAlgorithm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.com_pc.depression.NaiveBayesAlgorithm.DataObject.ArmeniaData;
import com.example.com_pc.depression.NaiveBayesAlgorithm.DataObject.DepressionData;
import com.example.com_pc.depression.NaiveBayesAlgorithm.DataObject.TestUser;
import com.example.com_pc.depression.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.SetOptions;

import java.util.Map;

public class NaiveBayesAlgorithm extends AppCompatActivity {
    public static final String TAG = "user";

    FirebaseFirestore mFirestore;
    Button buttonAdd;
    Button buttonGet;
    double depressed;
    double depressedMale;
    double allMale;
    double probability;
    double total;
    double score;
    DepressionData depressionData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naivebayesalgorithm);
        buttonAdd = findViewById(R.id.buttonAdd) ;
        buttonGet = findViewById(R.id.buttonGet);

        mFirestore = FirebaseFirestore.getInstance();
        depressionData = new DepressionData();

        // Upload data to the database
        buttonAdd.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                // Create the Armenia data
                ArmeniaData armeniaData = new ArmeniaData();

                // Add Armenia data
                mFirestore.collection("Userdata").document("data")
                        .set(armeniaData)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid ) {
                                Log.d(TAG, "DocumentSnapshot successfully written");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error adding document", e);
                            }
                        });

                // Add TestUser data
                TestUser testUser = new TestUser();

                // Add a new document with an ID
                mFirestore.collection("Users").document("1")
                        .set(testUser)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid ) {
                                Log.d(TAG, "DocumentSnapshot successfully written");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error adding document", e);
                            }
                        });
                return false;
            }
        });
        // Get user data
        buttonGet.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                final DocumentReference docDepressionData =mFirestore.collection("Userdata").document("data");

                final DocumentReference docUserData = mFirestore.collection("Users").document("1");

                final CollectionReference colBDI3 = mFirestore.collection("Users").document("1").collection("BDI3");

                final Query queryBDI3 = colBDI3.orderBy("date", Query.Direction.DESCENDING).limit(1);
//
                // Fetch BDI3 result
                queryBDI3.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                {
                                    score = document.getDouble("score");
                                }
                            }
                        }
                    }
                });

                docUserData.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        depressionData = documentSnapshot.toObject(DepressionData.class);
                        Log.d(TAG, "DocumentSnapshot successfully written");
                    }

                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "DocumentSnapshot failes");
                    }
                });

                docDepressionData.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        depressionData = documentSnapshot.toObject(DepressionData.class);
                        Log.d(TAG, "DocumentSnapshot successfully written");
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "DocumentSnapshot failed");
                    }
                });

                depressionData.setScore(score);

                Map<String, Object> updatedData = depressionData.dataUpdate();

                docDepressionData.set(updatedData, SetOptions.merge()).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "DocumentSnapshot successfully written");
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "DocumentSnapshot failes");
                    }
                });

                return false;
            }
        });
    }
}

