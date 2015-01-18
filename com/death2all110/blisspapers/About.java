package com.death2all110.blisspapers;

import android.app.Activity;
import android.os.Bundle;
import android.os.Build;
import android.widget.TextView;



public class About extends Activity {

    TextView manufacturerName;
    TextView deviceModel;
    TextView boardName;
    TextView romVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    manufacturerName = (TextView)findViewById(R.id.manufacturer);
        manufacturerName.setText("Manufacturer: " + Build.MANUFACTURER);

    deviceModel = (TextView)findViewById(R.id.model);
        deviceModel.setText("Model: " + Build.MODEL);

    boardName = (TextView)findViewById(R.id.board);
        boardName.setText("Board Name: " + Build.BOARD);

    }

}
