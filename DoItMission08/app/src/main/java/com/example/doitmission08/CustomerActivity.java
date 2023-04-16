package com.example.doitmission08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class CustomerActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer);
        Toast.makeText(getApplicationContext(), "메뉴 -> 고객 관리", Toast.LENGTH_SHORT).show();

        Button CustomertoLogin = (Button) findViewById(R.id.CustomertoLogin);
        Button CustomertoMenu = (Button) findViewById(R.id.CustomertoMenu);

        CustomertoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                setResult(31, intent);
                finish();
            }
        });
        CustomertoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                setResult(32, intent);
                finish();
            }
        });

    }
}
