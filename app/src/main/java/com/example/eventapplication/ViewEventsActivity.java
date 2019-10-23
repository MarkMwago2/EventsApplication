package com.example.eventapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewEventsActivity extends AppCompatActivity {
    TextView events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_events);
        events = (TextView) findViewById(R.id.EventText);

        events.setText(getIntent().getStringExtra("Title"));
        events.setText(getIntent().getStringExtra("StartDate"));
        events.setText(getIntent().getStringExtra("EndDate"));
        events.setText(getIntent().getStringExtra("StartTime"));
        events.setText(getIntent().getStringExtra("EndTime"));
        events.setText(getIntent().getStringExtra("Description"));


    }
}
