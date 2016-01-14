package com.test.example.lifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class Second extends AppCompatActivity {

    public final static String  FT_LT = "FT_App";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.d(FT_LT, "onCreate  -  2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(FT_LT, "onRestart  -  2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(FT_LT, "onStop  -  2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(FT_LT, "onDestroy  -  2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(FT_LT, "onPause  -  2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(FT_LT, "onResume  -  2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(FT_LT, "onStart  -  2");
    }

    public void onGetOut(View view) {
       this.finish();
    }
}
