package com.example.doitmission08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button customer = (Button) findViewById(R.id.customer);
        Button sales = (Button) findViewById(R.id.sales);
        Button product = (Button) findViewById(R.id.product);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CustomerActivity.class);
                startActivityForResult(intent, 23);
            }
        });
        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalesActivity.class);
                startActivityForResult(intent, 24);
            }
        });
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProductActivity.class);
                startActivityForResult(intent, 25);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 32) {
            Toast.makeText(getApplicationContext(), "고객 관리 -> 메뉴", Toast.LENGTH_SHORT).show();
        }
        else if (resultCode == 31) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            setResult(31, intent);
            finish();
        }
        else if(resultCode == 42) {
            Toast.makeText(getApplicationContext(), "매출 관리 -> 메뉴", Toast.LENGTH_SHORT).show();
        }
        else if (resultCode == 41) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            setResult(41, intent);
            finish();
        }
        else if(resultCode == 52) {
            Toast.makeText(getApplicationContext(), "상품 관리 -> 메뉴", Toast.LENGTH_SHORT).show();
        }
        else if (resultCode == 51) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            setResult(51, intent);
            finish();
        }
    }
}
