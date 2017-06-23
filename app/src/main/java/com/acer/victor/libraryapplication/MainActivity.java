package com.acer.victor.libraryapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.acer.victor.loglibrary.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.i("tag","abc");
        LogUtil.LEVEL = LogUtil.NOTHING;
        LogUtil.i("tag","def");
    }
}
