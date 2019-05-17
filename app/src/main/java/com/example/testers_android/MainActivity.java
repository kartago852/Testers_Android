package com.example.testers_android;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridLayout mlayout;
    Button addcri;
    DynamicViews  dnv;
    Context context;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlayout = (GridLayout)findViewById(R.id.mylayout);
        addcri = (Button)findViewById(R.id.AgregarCri);


        addcri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dnv = new DynamicViews(context);

                mlayout.addView(dnv.IngresarCri(getApplicationContext()),4);
                mlayout.addView(dnv.ImportanciaCri(getApplicationContext()),5);


            }
        });

    }
}
