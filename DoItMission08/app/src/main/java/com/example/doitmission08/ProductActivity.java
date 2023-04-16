package com.example.doitmission08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ProductActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);
        Toast.makeText(getApplicationContext(), "메뉴 -> 상품 관리", Toast.LENGTH_SHORT).show();

        Button ProducttoLogin = (Button) findViewById(R.id.ProducttoLogin);
        Button ProducttoMenu = (Button) findViewById(R.id.ProducttoMenu);

        ProducttoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                setResult(51, intent);
                finish();
            }
        });
        ProducttoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                setResult(52, intent);
                finish();
            }
        });
    }
}
