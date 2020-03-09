package com.example.gittestdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Create By JK_Liu on ${DATE}
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_jump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();

    }

    private void initData() {

    }

    private void initView() {
        btn_jump = findViewById(R.id.btn_jump);
        btn_jump.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_jump:
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                break;

        }
    }
}
