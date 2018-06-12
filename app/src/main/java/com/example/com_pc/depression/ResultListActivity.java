package com.example.com_pc.depression;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ResultListActivity extends AppCompatActivity {

    private ListView listView;
    private ResultListAdapter adapter;
    private List<Result> resultList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_list);
        Intent intent = getIntent();

        listView =(ListView)findViewById(R.id.listView);
        resultList = new ArrayList<Result>();

        resultList.add(new Result("위험인자 결과","2018-06-06"));
        resultList.add(new Result("BDI 첫 번째 결과","2018-06-06"));
        resultList.add(new Result("BDI 두 번째 결과","2018-06-13"));

        adapter = new ResultListAdapter(getApplicationContext(),resultList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent1 = new Intent(getApplicationContext(),ResultActivity.class);
                intent1.putExtra("title",resultList.get(position).getTt1());
                intent1.putExtra("date",resultList.get(position).getTt2());
                startActivity(intent1);
            }
        });
    }
}
