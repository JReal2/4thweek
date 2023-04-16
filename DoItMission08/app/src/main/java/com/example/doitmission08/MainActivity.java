package com.example.doitmission08;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ID = (EditText) findViewById(R.id.ID);
        EditText Password = (EditText) findViewById(R.id.Password);

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((ID.getText().length() != 0) && (Password.getText().length() != 0)){
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivityForResult(intent, 12);
                    Toast.makeText(getApplicationContext(), "로그인 -> 메뉴", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 입력하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == 31) {
            Toast.makeText(getApplicationContext(), "고객 관리 -> 로그인", Toast.LENGTH_SHORT).show();
        }
        else if(resultCode == 41) {
            Toast.makeText(getApplicationContext(), "매출 관리 -> 로그인", Toast.LENGTH_SHORT).show();
        }
        else if (resultCode == 51) {
            Toast.makeText(getApplicationContext(), "상품 관리 -> 로그인", Toast.LENGTH_SHORT).show();
        }
    }
}