package com.example.project10_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton btnSecond, btnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSecond = (RadioButton) findViewById(R.id.btnSecond);
        btnThird = (RadioButton) findViewById(R.id.btnThird);
        Button btnNew = (Button) findViewById(R.id.btnNew);
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if(btnSecond.isChecked()) {
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                }
                else if (btnThird.isChecked()) {
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "라디오버튼을 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}