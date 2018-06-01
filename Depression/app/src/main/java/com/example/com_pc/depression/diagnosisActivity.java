package com.example.com_pc.depression;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class diagnosisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);
        TextView diagfBtn = (TextView)findViewById(R.id.btbefore_fg2);
        diagfBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent bdiStartIntent1 = new Intent(diagnosisActivity.this,bdiStart.class);
                diagnosisActivity.this.startActivity(bdiStartIntent1);
            }
        });

        final RadioGroup rg = (RadioGroup)findViewById(R.id.rg);
        Button b = (Button)findViewById(R.id.rb1_2yes);
        Button b1 = (Button)findViewById(R.id.rb1_2no);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int id = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(id);
            } // end onClick()
        });  // end Listener



    }
}

