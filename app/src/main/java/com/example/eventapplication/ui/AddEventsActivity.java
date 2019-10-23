package com.example.eventapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.eventapplication.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddEventsActivity extends AppCompatActivity {
    private Button mSaveButton;
    private EditText mTitleText;
    private EditText mstartdate;
    private EditText menddate;
    private EditText mstarttime;
    private EditText mendtime;
    private EditText mdescritption;

    DatabaseReference databaseEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        databaseEvents = FirebaseDatabase.getInstance().getReference("Events");

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
               addEvents();
            }
        });
    }
    private void addEvents(){
      String title = mTitleText.getText().toString().trim();
      String startdate = mstartdate.getText().toString().trim();
      String enddate = menddate.getText().toString().trim();
      String starttime = mstarttime.getText().toString().trim();
      String endtime = mendtime.getText().toString().trim();
      String description = mdescritption.getText().toString().trim();

      String eventid = databaseEvents.push().getKey();

      Events events = new Events(eventid, title, startdate, enddate, starttime, endtime, description);

      databaseEvents.child(eventid).setValue(events);
    }
}

