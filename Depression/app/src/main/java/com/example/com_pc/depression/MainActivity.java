package com.example.com_pc.depression;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.action_setting:
               // Intent pwintent = new Intent(MainActivity.this,HomePage.class);
                //MainActivity.this.startActivity(pwintent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
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
