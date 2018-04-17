package com.example.sanchangboyy.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView TextView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String a = intent.getStringExtra("input");
       TextView1= findViewById(R.id.te_view);
       TextView1.setText("你的學號:"+a);
    }
}
