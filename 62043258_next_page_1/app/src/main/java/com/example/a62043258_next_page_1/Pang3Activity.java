package com.example.a62043258_next_page_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pang3Activity extends AppCompatActivity {

    private Button btnback;
    private TextView m_txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pang3);

        btnback = (Button)findViewById(R.id.btnbackPage3);
        m_txtView = (TextView) findViewById(R.id.textView4);
        m_txtView.setText(StaticDataTest.m_userName);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackToMainPage();
            }
        });
    }

    private  void BackToMainPage()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}