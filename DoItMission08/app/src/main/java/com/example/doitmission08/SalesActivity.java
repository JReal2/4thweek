package com.example.doitmission08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SalesActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sales);
        Toast.makeText(getApplicationContext(), "메뉴 -> 매출 관리", Toast.LENGTH_SHORT).show();

        Button SalestoLogin = (Button) findViewById(R.id.SalestoLogin);
        Button SalestoMenu = (Button) findViewById(R.id.SalestoMenu);

        SalestoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                setResult(41, intent);
                finish();
            }
        });
        SalestoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                setResult(42, intent);
                finish();
            }
        });
    }
}
