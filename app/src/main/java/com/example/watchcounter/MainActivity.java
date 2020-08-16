package com.example.watchcounter;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends WearableActivity {

    int count = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.countText);

        // Enables Always-on
        setAmbientEnabled();
    }

    public void reset(View view) {
        count = 0;
        Button reset = findViewById(R.id.reset);
        textView.setText("" + count);
    }

    public void increment(View view) {
        count++;
        Button reset = findViewById(R.id.reset);
        textView.setText("" + count);
    }

}
