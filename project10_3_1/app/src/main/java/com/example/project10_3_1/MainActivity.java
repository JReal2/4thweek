package com.example.project10_3_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");

        RadioGroup rgroup = findViewById(R.id.rgroup);

        Button cal = (Button) findViewById(R.id.cal);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                switch(rgroup.getCheckedRadioButtonId()) {
                    case R.id.sum:
                        intent.putExtra("Calc", "+");
                        break;
                    case R.id.sub:
                        intent.putExtra("Calc", "-");
                        break;
                    case R.id.mul:
                        intent.putExtra("Calc", "*");
                        break;
                    case R.id.div:
                        intent.putExtra("Calc", "/");
                        break;
                    default:
                        intent.putExtra("Calc", "non");

                }
                intent.putExtra("Num1", Integer.parseInt(num1.getText().toString()));
                intent.putExtra("Num2", Integer.parseInt(num2.getText().toString()));
                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            int hap = data.getIntExtra("Hap", 0);
            Toast.makeText(getApplicationContext(), "결과 : " + hap, Toast.LENGTH_SHORT).show();
        }
    }
}