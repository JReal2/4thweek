package com.example.project10_3_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Intent intent = getIntent();
        String calc = intent.getStringExtra("Calc");
        int calValue;

        if(calc.equals("+")) {
            calValue = intent.getIntExtra("Num1", 0) + intent.getIntExtra("Num2", 0);
        }
        else if(calc.equals("-")) {
            calValue = intent.getIntExtra("Num1", 0) - intent.getIntExtra("Num2", 0);
        }
        else if(calc.equals("*")) {
            calValue = intent.getIntExtra("Num1", 0) * intent.getIntExtra("Num2", 0);
        }
        else if(calc.equals("/")) {
            calValue = intent.getIntExtra("Num1", 0) / intent.getIntExtra("Num2", 0);
        }
        else {
            calValue = 0;
        }

        final int retValue = calValue;
        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(), MainActivity.class);
                outIntent.putExtra("Hap", retValue);
                setResult(RESULT_OK, outIntent);
                finish();
            }
        });
    }
}
