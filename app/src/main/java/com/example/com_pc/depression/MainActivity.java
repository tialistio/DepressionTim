package com.example.com_pc.depression;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.com_pc.depression.DiagnosisTest.diagnosisActivity;
import com.example.com_pc.depression.Password.HomePage;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
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
            e.printStackTrace();s
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
