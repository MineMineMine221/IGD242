package com.example.a62043258_next_page_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fn_Page1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fn_Page2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fn_Page3();
            }
        });

    }
    private  void Fn_Page1()
    {
        Intent intent = new Intent(this,Page1Activity.class);
        StaticDataTest.m_userName = "AAAA1";
        startActivity(intent);
    }
    private  void Fn_Page2()
    {
        Intent intent = new Intent(this,Page2Activity.class);
        StaticDataTest.m_userName = "AAAA2";
        startActivity(intent);
    }
    private  void Fn_Page3()
    {
        Intent intent = new Intent(this,Pang3Activity.class);
        StaticDataTest.m_userName = "AAAA3";
        startActivity(intent);
    }
}