package com.pop.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //private TextView titleTextView;

    private Button popMovButton, sHawkButton, bibButton, maMatButton, goUButton, capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeButtons();
    }

    private void initializeButtons() {
        popMovButton = (Button)findViewById(R.id.popMovButton);
        popMovButton.setOnClickListener(this);

        sHawkButton = (Button)findViewById(R.id.sHawkButton);
        sHawkButton.setOnClickListener(this);

        bibButton = (Button)findViewById(R.id.bibButton);
        bibButton.setOnClickListener(this);

        maMatButton = (Button)findViewById(R.id.maMatButton);
        maMatButton.setOnClickListener(this);

        goUButton = (Button)findViewById(R.id.goUButton);
        goUButton.setOnClickListener(this);

        capstoneButton = (Button)findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == popMovButton) {
            Toast.makeText(this, "This Button will launch my \"Popular Movies\" App",Toast.LENGTH_LONG).show();
        }
        else if(v == sHawkButton) {
            Toast.makeText(this, "This Button will launch my \"Stock Hawk\" App",Toast.LENGTH_LONG).show();
        }
        else if(v == bibButton) {
            Toast.makeText(this, "This Button will launch my \"Build it Bigger\" App",Toast.LENGTH_LONG).show();
        }
        else if(v == maMatButton) {
            Toast.makeText(this, "This Button will launch my \"Make your App Material\" App",Toast.LENGTH_LONG).show();
        }
        else if(v == goUButton) {
            Toast.makeText(this, "This Button will launch my \"Go Ubiquitous\" App",Toast.LENGTH_LONG).show();
        }
        else if(v == capstoneButton) {
            Toast.makeText(this, "This Button will launch my \"Capstone\" App",Toast.LENGTH_LONG).show();
        }

    }
}
