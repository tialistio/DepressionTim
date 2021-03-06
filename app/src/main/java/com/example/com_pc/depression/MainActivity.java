package com.example.com_pc.depression;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.com_pc.depression.DiagnosisTest.diagnosisActivity;
import com.example.com_pc.depression.Password.HomePage;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.xml.transform.Source;

public class MainActivity extends AppCompatActivity {
    public static String uuid = "";

    //================================================
    private static final String PREFS_UID = "Userid";
    private final String Defaultuser_id = "";
    public static String user_id;

    //=================================================
    public static int Idnum, count;
    public int intcounter;
    public String counter;
    FirebaseFirestore db;
    //=================================================
    public static String deviceId;
<<<<<<< HEAD
    //안드로이드 UUID 고유번호 가져오기
    //deviceid, serialnumber,androidid를 추출하여 string을 hash값으로 변경한 int형 변수
    //3개를 UUID 클래스의 UUID 생성자를 이용해서 생선한 문자열을 고유키를 생성.
    private String GetDevicesUUID(Context mContext) {
        final TelephonyManager tm = (TelephonyManager) mContext
                .getSystemService(Context.TELEPHONY_SERVICE);
        final String tmDevice, tmSerial, androidId;
        try {
            tmDevice = "" + tm.getDeviceId();
            tmSerial =  "" + tm.getSimSerialNumber();
            androidId = "" + android.provider.Settings.Secure.getString(getContentResolver(),
                    android.provider.Settings.Secure.ANDROID_ID);
            UUID deviceUuid = new UUID(androidId.hashCode(),
                    ((long) tmDevice.hashCode() << 32) | tmSerial.hashCode());
            deviceId = deviceUuid.toString();
            return deviceId;
        } catch (SecurityException e) {
            e.printStackTrace();
        }
       return "";
    }
=======

>>>>>>> database_part
    //
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = FirebaseFirestore.getInstance();

        //===========================================
        SharedPreferences settings = getSharedPreferences(PREFS_UID, Context.MODE_PRIVATE);
        //========================get the value
        user_id = settings.getString(PREFS_UID, Defaultuser_id);
        Toast.makeText(MainActivity.this, "Id = " + user_id, Toast.LENGTH_SHORT).show();
        //========================================== Check the Id
        if (TextUtils.isEmpty(user_id)) {
            Toast.makeText(MainActivity.this, "Id empty", Toast.LENGTH_SHORT).show();
            //================================ Get the number of user
            /*db.collection("users")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (DocumentSnapshot document : task.getResult()) {
                                    count++;
                                }
                                Idnum = count + 1;
                                Toast.makeText(MainActivity.this, "get the user count = " + Idnum, Toast.LENGTH_SHORT).show();
                            } else {
                                System.out.println("Data fetched failed");
                                Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });*/

            //================================ Add the number and the uuid

            for (int i = 0; i < 10; i++) {
                uuid = UUID.randomUUID().toString();
            }
            //================

            //============================== Make a document in collection
            //Make a HashMap<>
            Map<String, Object> newUser = new HashMap<>();
            newUser.put("user_id", uuid);
            newUser.put("counter", 0);
            //=======================put it into preferences
            settings = getSharedPreferences(PREFS_UID, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = settings.edit();

            editor.putString(PREFS_UID, uuid);
            editor.commit();

            //======================Input id in firestore
            db.collection("users").document(uuid)
                    .set(newUser)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(MainActivity.this, "Added new user", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.d("Error", e.getMessage());
                        }
                    });
            //==================================================================

        }
        //==================================================================
        //============================== if uuid not null
        Toast.makeText(MainActivity.this, "Id not null", Toast.LENGTH_SHORT).show();
        //==================================================================
        //결과 확인 Intent 이동
        TextView resultButton = (TextView)findViewById(R.id.resultButton);
        resultButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent resultIntent = new Intent(MainActivity.this,ResultListActivity.class);
                MainActivity.this.startActivity(resultIntent);
            }
        });
        //사용 설명서 Intent 이동
        TextView manualButton = (TextView) findViewById(R.id.manualButton);
        manualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manualIntent = new Intent(MainActivity.this, manualActivity.class);
                MainActivity.this.startActivity(manualIntent);
            }
        });
        //진단 시작버튼 //06.12 수정
        TextView diagButton = (TextView) findViewById(R.id.diagButton);
        diagButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diagIntent = new Intent(MainActivity.this, diagnosisActivity.class);
                MainActivity.this.startActivity(diagIntent);
            }
        });

    }

    public int get_counter() {
        DocumentReference userRef = db.collection("users").document(user_id);

        // check wether the data exist or not
        userRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    //Document found in the offline cache
                    DocumentSnapshot document = task.getResult();
                    if(document.exists()){
                        //Toast.makeText(MainActivity.this, "DocumentSnapshot data : " + document.getData(), Toast.LENGTH_SHORT).show();
                        counter = document.getString("counter");

                        //Toast.makeText(MainActivity.this, "counter : " + counter, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Document not found", Toast.LENGTH_SHORT).show();
                    }


                }
                else{
                    Toast.makeText(MainActivity.this, "get failde with" + task.getException(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        //========================= second way to get data
        /*db.collection("users").document(user_id).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                String counter = task.getResult().getString("counter");
                Toast.makeText(MainActivity.this, "counter : " + counter, Toast.LENGTH_SHORT).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity.this, "get failde with" + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });*/
        intcounter = Integer.parseInt(counter);
        return intcounter;
    }
}
