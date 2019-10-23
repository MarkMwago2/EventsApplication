package com.example.eventapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddEventsActivity extends AppCompatActivity {
    private Button mSaveButton;
    private EditText mTitleText;
    private EditText mstartdate;
    private EditText menddate;
    private EditText mstarttime;
    private EditText mendtime;
    private EditText mdescritption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        mSaveButton = (Button) findViewById(R.id.Savebutton);
        mTitleText = (EditText) findViewById(R.id.Titletext);
        mstartdate = (EditText) findViewById(R.id.startdate);
        menddate = (EditText) findViewById(R.id.enddate);
        mstarttime = (EditText) findViewById(R.id.starttime);
        mendtime = (EditText) findViewById(R.id.endtime);
        mdescritption = (EditText) findViewById(R.id.Descriptionbox);

        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AddEventsActivity.this, ViewEventsActivity.class);
                startActivity(intent1);
                intent1.putExtra("Title", mTitleText.getText().toString());
                startActivity(intent1);
                intent1.putExtra("StartDate", mstartdate.getText().toString());
                startActivity(intent1);
                intent1.putExtra("EndDate", menddate.getText().toString());
                startActivity(intent1);
                intent1.putExtra("StartTime", mstarttime.getText().toString());
                startActivity(intent1);
                intent1.putExtra("EndTime", mendtime.getText().toString());
                startActivity(intent1);
                intent1.putExtra("Description", mdescritption.getText().toString());
                startActivity(intent1);
            }
        });
    }
}

