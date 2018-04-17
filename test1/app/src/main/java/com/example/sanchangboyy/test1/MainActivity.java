package com.example.sanchangboyy.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  public EditText ed_text;
  public Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText EditText1 =(EditText) findViewById(R.id.ed_text);
        Button button1     =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                intent1.putExtra("input",EditText1.getText().toString());
                startActivity(intent1);
            }
        });
    }
}
