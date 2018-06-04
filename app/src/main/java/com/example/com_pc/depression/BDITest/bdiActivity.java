package com.example.com_pc.depression.BDITest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.com_pc.depression.R;

public class bdiActivity extends AppCompatActivity {
    public static int bdiSum = 0;
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
        //1
        final RadioGroup gr1 = (RadioGroup)findViewById(R.id.gr1);
        Button bdibtn1_1 = (Button)findViewById(R.id.bdiBtn1_1);
        Button bdibtn1_2 = (Button)findViewById(R.id.bdiBtn1_2);
        Button bdibtn1_3 = (Button)findViewById(R.id.bdiBtn1_3);
        Button bdibtn1_4 = (Button)findViewById(R.id.bdiBtn1_4);
        bdibtn1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr1.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr1.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr1.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr1.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //2
        final RadioGroup gr2 = (RadioGroup)findViewById(R.id.gr2);
        Button bdibtn2_1 = (Button)findViewById(R.id.bdiBtn2_1);
        Button bdibtn2_2 = (Button)findViewById(R.id.bdiBtn2_2);
        Button bdibtn2_3 = (Button)findViewById(R.id.bdiBtn2_3);
        Button bdibtn2_4 = (Button)findViewById(R.id.bdiBtn2_4);
        bdibtn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr2.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr2.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr2.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr2.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //3
        final RadioGroup gr3 = (RadioGroup)findViewById(R.id.gr3);
        Button bdibtn3_1 = (Button)findViewById(R.id.bdiBtn3_1);
        Button bdibtn3_2 = (Button)findViewById(R.id.bdiBtn3_2);
        Button bdibtn3_3 = (Button)findViewById(R.id.bdiBtn3_3);
        Button bdibtn3_4 = (Button)findViewById(R.id.bdiBtn3_4);
        bdibtn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr3.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr3.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;

            }
        });
        bdibtn3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr3.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr3.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //4
        final RadioGroup gr4 = (RadioGroup)findViewById(R.id.gr4);
        Button bdibtn4_1 = (Button)findViewById(R.id.bdiBtn4_1);
        Button bdibtn4_2 = (Button)findViewById(R.id.bdiBtn4_2);
        Button bdibtn4_3 = (Button)findViewById(R.id.bdiBtn4_3);
        Button bdibtn4_4 = (Button)findViewById(R.id.bdiBtn4_4);
        bdibtn4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr4.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr4.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr4.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr4.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //5
        final RadioGroup gr5 = (RadioGroup)findViewById(R.id.gr5);
        Button bdibtn5_1 = (Button)findViewById(R.id.bdiBtn5_1);
        Button bdibtn5_2 = (Button)findViewById(R.id.bdiBtn5_2);
        Button bdibtn5_3 = (Button)findViewById(R.id.bdiBtn5_3);
        Button bdibtn5_4 = (Button)findViewById(R.id.bdiBtn5_4);
        bdibtn5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr5.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr5.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr5.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr5.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //6
        final RadioGroup gr6 = (RadioGroup)findViewById(R.id.gr6);
        Button bdibtn6_1 = (Button)findViewById(R.id.bdiBtn6_1);
        Button bdibtn6_2 = (Button)findViewById(R.id.bdiBtn6_2);
        Button bdibtn6_3 = (Button)findViewById(R.id.bdiBtn6_3);
        Button bdibtn6_4 = (Button)findViewById(R.id.bdiBtn6_4);
        bdibtn6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr6.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr6.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn6_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr6.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn6_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr6.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //7
        final RadioGroup gr7 = (RadioGroup)findViewById(R.id.gr7);
        Button bdibtn7_1 = (Button)findViewById(R.id.bdiBtn7_1);
        Button bdibtn7_2 = (Button)findViewById(R.id.bdiBtn7_2);
        Button bdibtn7_3 = (Button)findViewById(R.id.bdiBtn7_3);
        Button bdibtn7_4 = (Button)findViewById(R.id.bdiBtn7_4);
        bdibtn7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr7.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr7.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn7_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr7.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn7_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr7.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //8
        final RadioGroup gr8 = (RadioGroup)findViewById(R.id.gr8);
        Button bdibtn8_1 = (Button)findViewById(R.id.bdiBtn8_1);
        Button bdibtn8_2 = (Button)findViewById(R.id.bdiBtn8_2);
        Button bdibtn8_3 = (Button)findViewById(R.id.bdiBtn8_3);
        Button bdibtn8_4 = (Button)findViewById(R.id.bdiBtn8_4);
        bdibtn8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr8.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr8.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn8_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr8.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn8_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr8.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //9
        final RadioGroup gr9 = (RadioGroup)findViewById(R.id.gr9);
        Button bdibtn9_1 = (Button)findViewById(R.id.bdiBtn9_1);
        Button bdibtn9_2 = (Button)findViewById(R.id.bdiBtn9_2);
        Button bdibtn9_3 = (Button)findViewById(R.id.bdiBtn9_3);
        Button bdibtn9_4 = (Button)findViewById(R.id.bdiBtn9_4);
        bdibtn9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr9.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr9.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn9_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr9.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn9_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr9.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //10
        final RadioGroup gr10 = (RadioGroup)findViewById(R.id.gr10);
        Button bdibtn10_1 = (Button)findViewById(R.id.bdiBtn10_1);
        Button bdibtn10_2 = (Button)findViewById(R.id.bdiBtn10_2);
        Button bdibtn10_3 = (Button)findViewById(R.id.bdiBtn10_3);
        Button bdibtn10_4 = (Button)findViewById(R.id.bdiBtn10_4);
        bdibtn10_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr10.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn10_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr10.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn10_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr10.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn10_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr10.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //11
        final RadioGroup gr11 = (RadioGroup)findViewById(R.id.gr11);
        Button bdibtn11_1 = (Button)findViewById(R.id.bdiBtn11_1);
        Button bdibtn11_2 = (Button)findViewById(R.id.bdiBtn11_2);
        Button bdibtn11_3 = (Button)findViewById(R.id.bdiBtn11_3);
        Button bdibtn11_4 = (Button)findViewById(R.id.bdiBtn11_4);
        bdibtn11_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr11.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn11_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr11.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn11_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr11.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn11_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr11.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //12
        final RadioGroup gr12 = (RadioGroup)findViewById(R.id.gr12);
        Button bdibtn12_1 = (Button)findViewById(R.id.bdiBtn12_1);
        Button bdibtn12_2 = (Button)findViewById(R.id.bdiBtn12_2);
        Button bdibtn12_3 = (Button)findViewById(R.id.bdiBtn12_3);
        Button bdibtn12_4 = (Button)findViewById(R.id.bdiBtn12_4);
        bdibtn12_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr12.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn12_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr12.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn12_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr12.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn12_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr12.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //13
        final RadioGroup gr13 = (RadioGroup)findViewById(R.id.gr13);
        Button bdibtn13_1 = (Button)findViewById(R.id.bdiBtn13_1);
        Button bdibtn13_2 = (Button)findViewById(R.id.bdiBtn13_2);
        Button bdibtn13_3 = (Button)findViewById(R.id.bdiBtn13_3);
        Button bdibtn13_4 = (Button)findViewById(R.id.bdiBtn13_4);
        bdibtn13_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr13.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn13_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr13.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn13_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr13.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn13_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr13.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //14
        final RadioGroup gr14 = (RadioGroup)findViewById(R.id.gr14);
        Button bdibtn14_1 = (Button)findViewById(R.id.bdiBtn14_1);
        Button bdibtn14_2 = (Button)findViewById(R.id.bdiBtn14_2);
        Button bdibtn14_3 = (Button)findViewById(R.id.bdiBtn14_3);
        Button bdibtn14_4 = (Button)findViewById(R.id.bdiBtn14_4);
        bdibtn14_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr14.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn14_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr14.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn14_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr14.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn14_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr14.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //15
        final RadioGroup gr15 = (RadioGroup)findViewById(R.id.gr15);
        Button bdibtn15_1 = (Button)findViewById(R.id.bdiBtn15_1);
        Button bdibtn15_2 = (Button)findViewById(R.id.bdiBtn15_2);
        Button bdibtn15_3 = (Button)findViewById(R.id.bdiBtn15_3);
        Button bdibtn15_4 = (Button)findViewById(R.id.bdiBtn15_4);
        bdibtn15_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr15.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn15_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr15.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn15_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr15.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn15_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr15.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //16
        final RadioGroup gr16 = (RadioGroup)findViewById(R.id.gr16);
        Button bdibtn16_1 = (Button)findViewById(R.id.bdiBtn16_1);
        Button bdibtn16_2 = (Button)findViewById(R.id.bdiBtn16_2);
        Button bdibtn16_3 = (Button)findViewById(R.id.bdiBtn16_3);
        Button bdibtn16_4 = (Button)findViewById(R.id.bdiBtn16_4);
        bdibtn16_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr16.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn16_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr16.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn16_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr16.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn16_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr16.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //17
        final RadioGroup gr17 = (RadioGroup)findViewById(R.id.gr17);
        Button bdibtn17_1 = (Button)findViewById(R.id.bdiBtn17_1);
        Button bdibtn17_2 = (Button)findViewById(R.id.bdiBtn17_2);
        Button bdibtn17_3 = (Button)findViewById(R.id.bdiBtn17_3);
        Button bdibtn17_4 = (Button)findViewById(R.id.bdiBtn17_4);
        bdibtn17_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr17.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn17_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr17.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn17_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr17.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn17_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr17.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //18
        final RadioGroup gr18 = (RadioGroup)findViewById(R.id.gr18);
        Button bdibtn18_1 = (Button)findViewById(R.id.bdiBtn18_1);
        Button bdibtn18_2 = (Button)findViewById(R.id.bdiBtn18_2);
        Button bdibtn18_3 = (Button)findViewById(R.id.bdiBtn18_3);
        Button bdibtn18_4 = (Button)findViewById(R.id.bdiBtn18_4);
        bdibtn18_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr18.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn18_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr18.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn18_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr18.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn18_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr18.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //19
        final RadioGroup gr19 = (RadioGroup)findViewById(R.id.gr19);
        Button bdibtn19_1 = (Button)findViewById(R.id.bdiBtn19_1);
        Button bdibtn19_2 = (Button)findViewById(R.id.bdiBtn19_2);
        Button bdibtn19_3 = (Button)findViewById(R.id.bdiBtn19_3);
        Button bdibtn19_4 = (Button)findViewById(R.id.bdiBtn19_4);
        bdibtn19_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr19.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn19_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr19.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn19_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr19.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn19_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr19.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //20
        final RadioGroup gr20 = (RadioGroup)findViewById(R.id.gr20);
        Button bdibtn20_1 = (Button)findViewById(R.id.bdiBtn20_1);
        Button bdibtn20_2 = (Button)findViewById(R.id.bdiBtn20_2);
        Button bdibtn20_3 = (Button)findViewById(R.id.bdiBtn20_3);
        Button bdibtn20_4 = (Button)findViewById(R.id.bdiBtn20_4);
        bdibtn20_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr20.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn20_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr20.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn20_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr20.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn20_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr20.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });

        //21
        final RadioGroup gr21 = (RadioGroup)findViewById(R.id.gr21);
        Button bdibtn21_1 = (Button)findViewById(R.id.bdiBtn21_1);
        Button bdibtn21_2 = (Button)findViewById(R.id.bdiBtn21_2);
        Button bdibtn21_3 = (Button)findViewById(R.id.bdiBtn21_3);
        Button bdibtn21_4 = (Button)findViewById(R.id.bdiBtn21_4);
        bdibtn20_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr21.getCheckedRadioButtonId();
                RadioButton btnbdi1 = (RadioButton) findViewById(id);
            }
        });
        bdibtn21_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr21.getCheckedRadioButtonId();
                RadioButton btnbdi2 = (RadioButton) findViewById(id);
                bdiSum++;
            }
        });
        bdibtn21_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr21.getCheckedRadioButtonId();
                RadioButton btnbdi3 = (RadioButton) findViewById(id);
                bdiSum+=2;
            }
        });
        bdibtn21_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gr21.getCheckedRadioButtonId();
                RadioButton btnbdi4 = (RadioButton) findViewById(id);
                bdiSum+=3;
            }
        });
    }
}
