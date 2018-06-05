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
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    public static String uuid;

    //=================================================
    public static int Idnum, count;
    FirebaseFirestore db;
    //=================================================
    public static String deviceId;
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
    //
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = FirebaseFirestore.getInstance();

        //========================================== Check the Id
        if (TextUtils.isEmpty(uuid)) {
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
            //============================== Make a document in collection
            //Make a HashMap<>
            Map<String, Object> newUser = new HashMap<>();
            newUser.put("user_id", uuid);

            // Input data in firestore
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
        //============================== Make a document in collection
        //Make a HashMap<>
        Map<String, Object> newUser = new HashMap<>();
        newUser.put("user_id", uuid);

        // Input data in firestore
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

        TextView manualButton = (TextView)findViewById(R.id.manualButton);
        manualButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent manualIntent = new Intent(MainActivity.this,manualActivity.class);
                MainActivity.this.startActivity(manualIntent);
            }
        });
        TextView diagButton = (TextView)findViewById(R.id.diagButton);
        diagButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent diagIntent = new Intent(MainActivity.this,diagnosisActivity.class);
                MainActivity.this.startActivity(diagIntent);
            }
        });
    }
}
