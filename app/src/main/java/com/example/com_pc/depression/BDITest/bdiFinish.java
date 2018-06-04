package com.example.com_pc.depression.BDITest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.com_pc.depression.R;
import static com.example.com_pc.depression.BDITest.bdiActivity.bdiSum;
import static com.example.com_pc.depression.MainActivity.deviceId;
public class bdiFinish extends AppCompatActivity {
//bdiBtn
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdifinish);

        TextView textview = (TextView)findViewById(R.id.textView);
        textview.setText(String.valueOf(bdiSum));
        TextView textview2 = (TextView)findViewById(R.id.textView2);
        textview2.setText(String.valueOf(deviceId));

    }
}
