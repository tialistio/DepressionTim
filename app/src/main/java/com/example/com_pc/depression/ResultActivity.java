package com.example.com_pc.depression;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;
import android.graphics.Color;
public class ResultActivity extends AppCompatActivity {

    int[] pieChartValues = {10, 10, 20, 20, 40};  //각 계열(Series)의 값
    public static final String TYPE = "type";
    //각 계열(Series)의 색상
    Paint p = new Paint();
    private static int[] COLORS ;
    //각 계열의 타이틀
    String[] mSeriesTitle = new String[] {"PIE1", "PIE2", "PIE3", "PIE4", "PIE5" };

    private CategorySeries mSeries = new CategorySeries("계열");
    private DefaultRenderer mRenderer = new DefaultRenderer();
    private GraphicalView mChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        COLORS = new int[]{Color.GRAY,Color.GREEN, Color.BLUE, Color.MAGENTA, Color.CYAN};

        Intent intent = getIntent();

        TextView tt1 = (TextView)findViewById(R.id.tt1);
        TextView tt2 = (TextView)findViewById(R.id.tt2);

        tt1.setText(intent.getStringExtra("title"));
        tt2.setText(intent.getStringExtra("date"));

        mRenderer.setApplyBackgroundColor(true);
        mRenderer.setChartTitleTextSize(20);
        mRenderer.setLabelsTextSize(30);
        mRenderer.setLegendTextSize(30);
        mRenderer.setMargins(new int[]{0, 0, 0, 0});
        mRenderer.setStartAngle(90);

        if (mChartView == null) {
            LinearLayout layout = (LinearLayout) findViewById(R.id.chart_pie);
            mChartView = ChartFactory.getPieChartView(this, mSeries, mRenderer);
            mRenderer.setClickEnabled(true);
            mRenderer.setSelectableBuffer(10);
            layout.addView(mChartView, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,
                    LinearLayout.LayoutParams.FILL_PARENT));
        } else {
            mChartView.repaint();
        }
        fillPieChart();
    }

    public void fillPieChart() {
        for (int i = 0; i < pieChartValues.length; i++) {
            mSeries.add(mSeriesTitle[i] + " : " + (String.valueOf(pieChartValues[i]))+"   ", pieChartValues[i]);

            //Chart에서 사용할 값, 색깔, 텍스트등을 DefaultRenderer객체에 설정
            SimpleSeriesRenderer renderer = new SimpleSeriesRenderer();
            renderer.setColor(COLORS[(mSeries.getItemCount() - 1) % COLORS.length]);

            mRenderer.addSeriesRenderer(renderer);

            if (mChartView != null)
                mChartView.repaint();
        }
    }
}
