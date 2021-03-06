package com.muddapeople.theone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by antoine on 20/06/2016.
 */
public class AddActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.add_view);

        Button myButton = (Button) findViewById(R.id.button6);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(AddActivity.this, CalendarActivity.class);
                startActivity(myIntent);
            }
        });

        Button myButton2 = (Button) findViewById(R.id.button3);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(AddActivity.this, NextActivity.class);
                startActivity(myIntent);
            }
        });

        Button myButton3 = (Button) findViewById(R.id.button5);
        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(AddActivity.this, SettingsActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
