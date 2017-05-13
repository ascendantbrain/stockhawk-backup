
package com.sam_chordas.android.stockhawk.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sam_chordas.android.stockhawk.R;



public class ChartActivity extends AppCompatActivity {

    private static final String KEY_STOCK_SYMBOL = "stock_symbol";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public static Intent getIntent(Context context, String stock_symbol){
        Intent intent = new Intent(context,ChartActivity.class);
        intent.putExtra(KEY_STOCK_SYMBOL,stock_symbol);
        return intent;
    }

}
