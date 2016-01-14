package com.test.example.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public final static String  FT_LT = "FT_App";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(FT_LT, "onCreate  -  1");
    }

    public void go22(View view) {
        Intent i = new Intent(this, Second.class);
        startActivity(i);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(FT_LT,"onRestart  -  1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(FT_LT, "onStop  -  1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(FT_LT, "onDestroy  -  1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(FT_LT, "onPause  -  1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(FT_LT, "onResume  -  1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(FT_LT, "onStart  -  1");
    }

    public void goX(View view) {

    }
}
