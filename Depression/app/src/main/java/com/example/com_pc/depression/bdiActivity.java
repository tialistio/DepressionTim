package com.example.com_pc.depression;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class bdiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdi);
        TextView bdiBtn = (TextView)findViewById(R.id.btnext_bdiBtn1);
        bdiBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent bdiIntent2 = new Intent(bdiActivity.this,bdiFinish.class);
                bdiActivity.this.startActivity(bdiIntent2);
            }
        });
    }
}
