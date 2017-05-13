package com.sam_chordas.android.stockhawk.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.sam_chordas.android.stockhawk.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * A placeholder fragment containing a simple view.
 */
public class ChartActivityFragment extends Fragment {

    public ChartActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chart, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LineChart lineChart = (LineChart) view.findViewById(R.id.chart);
        setupLineChart(lineChart);
    }

    private void setupLineChart(@NonNull LineChart chart){
        List<Entry> entries = new ArrayList<Entry>();

        Random rand = new Random();
        int y = 0;
        for(int x=0; x<10; x++) {
            y = rand.nextInt(100);


            // turn your data into Entry objects
            entries.add(new Entry(x,y));
        }

        LineDataSet dataSet = new LineDataSet(entries, "Label"); // add entries to dataset
//        dataSet.setColor(...);
//        dataSet.setValueTextColor(...); // styling, ...

        LineData lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.invalidate(); // refresh
    }
}
