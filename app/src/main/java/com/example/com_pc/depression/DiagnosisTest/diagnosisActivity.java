package com.example.com_pc.depression.DiagnosisTest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.com_pc.depression.MainActivity;
import com.example.com_pc.depression.R;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class diagnosisActivity extends AppCompatActivity {
    private  static final String PREFS_UID = "Userid";
    private final String Defaultuser_id = "";
    public static String user_id;

    public static int radioButtonID = 0;
    public static int selectedId = 0;
    public static String selected ="";
    RadioButton radioButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);
        //========================================== get the user id
        SharedPreferences settings = getSharedPreferences(PREFS_UID, Context.MODE_PRIVATE);
        //========================get the value
        user_id = settings.getString(PREFS_UID, Defaultuser_id);
        //========================== upload data


        TextView nextBtn = (TextView)findViewById(R.id.diagBtn);
        nextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    upload_data();
                    Toast.makeText(diagnosisActivity.this, "Id = " + user_id +" succsess", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(diagnosisActivity.this, "upload failed", Toast.LENGTH_SHORT).show();
                }

                //======================================

                Intent bdiStart = new Intent(diagnosisActivity.this, com.example.com_pc.depression.BDITest.bdiStart.class);
                diagnosisActivity.this.startActivity(bdiStart);
            }
        });
        //1
        final RadioGroup rg1 = (RadioGroup)findViewById(R.id.rg1);
        Button rg1y = (Button)findViewById(R.id.rg1_y);
        Button rg1n = (Button)findViewById(R.id.rg1_n);
        rg1y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg1.getCheckedRadioButtonId();
                RadioButton rg1yBtn = (RadioButton) findViewById(id);
            }
        });
        rg1n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg1.getCheckedRadioButtonId();
                RadioButton rg1nBtn = (RadioButton) findViewById(id);
            }
        });
        //2
        final RadioGroup rg2 = (RadioGroup)findViewById(R.id.rg2);
        Button rg2y = (Button)findViewById(R.id.rg2_y);
        Button rg2n = (Button)findViewById(R.id.rg2_n);
        rg2y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg2.getCheckedRadioButtonId();
                RadioButton rg2yBtn = (RadioButton) findViewById(id);
            }
        });
        rg2n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg2.getCheckedRadioButtonId();
                RadioButton rg2nBtn = (RadioButton) findViewById(id);
            }
        });
        //3
        final RadioGroup rg3 = (RadioGroup)findViewById(R.id.rg3);
        Button rg3y = (Button)findViewById(R.id.rg3_y);
        Button rg3n = (Button)findViewById(R.id.rg3_n);
        rg3y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg3.getCheckedRadioButtonId();
                RadioButton rg3yBtn = (RadioButton) findViewById(id);
            }
        });
        rg3n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg3.getCheckedRadioButtonId();
                RadioButton rg3nBtn = (RadioButton) findViewById(id);
            }
        });
        //4
        final RadioGroup rg4 = (RadioGroup)findViewById(R.id.rg4);
        Button rg4y = (Button)findViewById(R.id.rg4_y);
        Button rg4n = (Button)findViewById(R.id.rg4_n);
        rg4y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg4.getCheckedRadioButtonId();
                RadioButton rg4yBtn = (RadioButton) findViewById(id);
            }
        });
        rg4n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg4.getCheckedRadioButtonId();
                RadioButton rg4nBtn = (RadioButton) findViewById(id);
            }
        });
        //5
        final RadioGroup rg5 = (RadioGroup)findViewById(R.id.rg5);
        Button rg5y = (Button)findViewById(R.id.rg5_y);
        Button rg5n = (Button)findViewById(R.id.rg5_n);
        rg5y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg5.getCheckedRadioButtonId();
                RadioButton rg5yBtn = (RadioButton) findViewById(id);
            }
        });
        rg5n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg5.getCheckedRadioButtonId();
                RadioButton rg5nBtn = (RadioButton) findViewById(id);
            }
        });
        //6
        final RadioGroup rg6 = (RadioGroup)findViewById(R.id.rg6);
        Button rg6y = (Button)findViewById(R.id.rg6_y);
        Button rg6n = (Button)findViewById(R.id.rg6_n);
        rg6y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg6.getCheckedRadioButtonId();
                RadioButton rg6yBtn = (RadioButton) findViewById(id);
            }
        });
        rg6n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg6.getCheckedRadioButtonId();
                RadioButton rg6nBtn = (RadioButton) findViewById(id);
            }
        });
        //7
        final RadioGroup rg7 = (RadioGroup)findViewById(R.id.rg7);
        Button rg7y = (Button)findViewById(R.id.rg7_y);
        Button rg7n = (Button)findViewById(R.id.rg7_n);
        rg7y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg7.getCheckedRadioButtonId();
                RadioButton rg7yBtn = (RadioButton) findViewById(id);
            }
        });
        rg7n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg7.getCheckedRadioButtonId();
                RadioButton rg7nBtn = (RadioButton) findViewById(id);
            }
        });

        //8

        final RadioGroup rg8 = (RadioGroup)findViewById(R.id.rg8);
        Button rg8y = (Button)findViewById(R.id.rg8_y);
        Button rg8n = (Button)findViewById(R.id.rg8_n);
        rg8y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg8.getCheckedRadioButtonId();
                RadioButton rg8yBtn = (RadioButton) findViewById(id);
            }
        });
        rg8n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg8.getCheckedRadioButtonId();
                RadioButton rg8nBtn = (RadioButton) findViewById(id);
            }
        });

        //9
        final RadioGroup rg9 = (RadioGroup)findViewById(R.id.rg9);
        Button rg9y = (Button)findViewById(R.id.rg9_y);
        Button rg9n = (Button)findViewById(R.id.rg9_n);
        rg9y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg9.getCheckedRadioButtonId();
                RadioButton rg9yBtn = (RadioButton) findViewById(id);
            }
        });
        rg9n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg9.getCheckedRadioButtonId();
                RadioButton rg9nBtn = (RadioButton) findViewById(id);
            }
        });

        //10

        final RadioGroup rg10 = (RadioGroup)findViewById(R.id.rg10);
        Button rg10y = (Button)findViewById(R.id.rg10_y);
        Button rg10n = (Button)findViewById(R.id.rg10_n);
        rg10y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg10.getCheckedRadioButtonId();
                RadioButton rg10yBtn = (RadioButton) findViewById(id);
            }
        });
        rg10n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg10.getCheckedRadioButtonId();
                RadioButton rg10nBtn = (RadioButton) findViewById(id);
            }
        });

        //11
        final RadioGroup rg11 = (RadioGroup)findViewById(R.id.rg11);
        Button rg11y = (Button)findViewById(R.id.rg11_y);
        Button rg11n = (Button)findViewById(R.id.rg11_n);
        rg11y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg11.getCheckedRadioButtonId();
                RadioButton rg11yBtn = (RadioButton) findViewById(id);
            }
        });
        rg11n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg11.getCheckedRadioButtonId();
                RadioButton rg11nBtn = (RadioButton) findViewById(id);
            }
        });

        //12

        final RadioGroup rg12 = (RadioGroup)findViewById(R.id.rg12);
        Button rg12y = (Button)findViewById(R.id.rg12_y);
        Button rg12n = (Button)findViewById(R.id.rg12_n);
        rg12y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg12.getCheckedRadioButtonId();
                RadioButton rg11yBtn = (RadioButton) findViewById(id);
            }
        });
        rg12n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg12.getCheckedRadioButtonId();
                RadioButton rg12nBtn = (RadioButton) findViewById(id);
            }
        });

        //13

        final RadioGroup rg13 = (RadioGroup)findViewById(R.id.rg13);
        Button rg13y = (Button)findViewById(R.id.rg13_y);
        Button rg13n = (Button)findViewById(R.id.rg13_n);
        rg13y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg13.getCheckedRadioButtonId();
                RadioButton rg13yBtn = (RadioButton) findViewById(id);
            }
        });
        rg13n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg13.getCheckedRadioButtonId();
                RadioButton rg13nBtn = (RadioButton) findViewById(id);
            }
        });

        //14
        final RadioGroup rg14 = (RadioGroup)findViewById(R.id.rg14);
        Button rg14y = (Button)findViewById(R.id.rg14_y);
        Button rg14n = (Button)findViewById(R.id.rg14_n);
        rg14y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg14.getCheckedRadioButtonId();
                RadioButton rg11yBtn = (RadioButton) findViewById(id);
            }
        });
        rg14n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg14.getCheckedRadioButtonId();
                RadioButton rg14nBtn = (RadioButton) findViewById(id);
            }
        });
    }
//======================================= save data in database function
    public void save_data(String questionnum, String answer){

        FirebaseFirestore db;
        db = FirebaseFirestore.getInstance();

        Map<String, Object> newvalue = new HashMap<>();
        newvalue.put(questionnum, answer);

        db.collection("users").document(user_id).collection("user_data").document("user_information").update(newvalue);
    }
    //=============================== save boolean
    public void save_data(String questionnum, Boolean answer){

        FirebaseFirestore db;
        db = FirebaseFirestore.getInstance();

        Map<String, Object> newvalue = new HashMap<>();
        newvalue.put(questionnum, answer);

        db.collection("users").document(user_id).collection("user_data").document("user_information").update(newvalue);
    }

    //==================================== set database
    public void set_data(String questionnum, int answer){

        FirebaseFirestore db;
        db = FirebaseFirestore.getInstance();

        Map<String, Object> newvalue = new HashMap<>();
        newvalue.put(questionnum, answer);

        db.collection("users").document(user_id).collection("user_data").document("user_information").set(newvalue);
    }
//======================================= upload data to database
    public void upload_data(){
        EditText agein = (EditText)findViewById(R.id.edinputage);
        String ages = agein.getText().toString();
        int age = Integer.parseInt(ages);

        //======================= upload data
        set_data("age", age);

        // get the radio button value question 1
        RadioGroup rg1 = (RadioGroup)findViewById(R.id.rg1);
        radioButtonID = rg1.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(radioButtonID);

       String value = radioButton.getText().toString();
       if(value.equals("남")){
           value = "male";
       }
       else {
           value = "female";
       }
       save_data("gender", value);

        //===================yes no question save
        //Question 3
        RadioGroup rg2 = (RadioGroup)findViewById(R.id.rg2);
        radioButtonID = rg2.getCheckedRadioButtonId();
        cek_value("smoking", radioButtonID);

        //Question 4
        RadioGroup rg3 = (RadioGroup)findViewById(R.id.rg3);
        radioButtonID = rg3.getCheckedRadioButtonId();
        cek_value("alcohol", radioButtonID);

        //Question 5
        RadioGroup rg4 = (RadioGroup)findViewById(R.id.rg4);
        radioButtonID = rg4.getCheckedRadioButtonId();
        cek_value("troubleWithClassmates", radioButtonID);

        //Question 6
        RadioGroup rg5 = (RadioGroup)findViewById(R.id.rg5);
        radioButtonID = rg5.getCheckedRadioButtonId();
        cek_value("loosingFriend", radioButtonID);

        // Question 7
        RadioGroup rg6 = (RadioGroup)findViewById(R.id.rg6);
        radioButtonID = rg6.getCheckedRadioButtonId();
        cek_value("troubleWithTeacher", radioButtonID);

        //Question 8
        RadioGroup rg7 = (RadioGroup)findViewById(R.id.rg7);
        radioButtonID = rg7.getCheckedRadioButtonId();
        cek_value("troubleWithSiblings", radioButtonID);

        //Question 9
        RadioGroup rg8 = (RadioGroup)findViewById(R.id.rg8);
        radioButtonID = rg8.getCheckedRadioButtonId();
        cek_value("arguingWithParents", radioButtonID);

        //Question 10
        RadioGroup rg9 = (RadioGroup)findViewById(R.id.rg9);
        radioButtonID = rg9.getCheckedRadioButtonId();
        cek_value("livingStandard", radioButtonID);

        //Question 11


        //Question 12
        RadioGroup rg11 = (RadioGroup)findViewById(R.id.rg11);
        radioButtonID = rg11.getCheckedRadioButtonId();
        cek_value("seriouslyIll", radioButtonID);

        //Question 13
        RadioGroup rg12 = (RadioGroup)findViewById(R.id.rg12);
        radioButtonID = rg12.getCheckedRadioButtonId();
        cek_value("familyMemberIll", radioButtonID);

        //Question 14
        RadioGroup rg13 = (RadioGroup)findViewById(R.id.rg13);
        radioButtonID = rg13.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(radioButtonID);

        value = radioButton.getText().toString();
        if(value.equalsIgnoreCase("yes")){
            value = "divorced";
        }
        else{
            value = "married";
        }
        save_data("parentsMartialStatus", value);



    }

    public void cek_value(String question, int radioId){
        radioButton = (RadioButton)findViewById(radioButtonID);
        Boolean answr;

        String value = radioButton.getText().toString();
        if(value.equalsIgnoreCase("yes")){
            answr = true;
        }
        else {
            answr = false;
        }

        save_data(question, answr);
    }
}

