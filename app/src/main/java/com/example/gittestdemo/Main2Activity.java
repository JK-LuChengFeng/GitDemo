package com.example.gittestdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Create By JK_Liu on 2020/03/09
 */
public class Main2Activity extends AppCompatActivity {

    private TextView tv_branchtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initData();
        initView();

    }

    private void initData() {
        
    }

    private void initView() {
        tv_branchtest = findViewById(R.id.tv_testBranch);
    }
}
