package com.bobo.min.fucusCam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aryan.dhankar.customcamera.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }
    }
}
