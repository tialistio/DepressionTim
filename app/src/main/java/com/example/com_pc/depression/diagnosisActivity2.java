package com.example.com_pc.depression;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class diagnosisActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis2);
        TextView diagfBtn = (TextView)findViewById(R.id.btbefore_fg2);
        diagfBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent bdiStartIntent1 = new Intent(diagnosisActivity2.this,bdiStart.class);
                diagnosisActivity2.this.startActivity(bdiStartIntent1);
            }
        });
    }
}
