package com.example.a62043258_scrollview_h_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button m_btn1;
    private Button m_btn2;
    private Button m_btn3;
    private Button m_btn4;
    private Button m_btn5;
    private Button m_btn6;
    private TextView m_txtV1;
    private TextView m_txtV2;
    private TextView m_txtV3;
    private TextView m_txtV4;
    private TextView m_txtV5;
    private TextView m_txtV6;
    private  TextView m_txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_btn1 = (Button) findViewById(R.id.btnn1);
        m_btn2 = (Button) findViewById(R.id.btn2);
        m_btn3 = (Button) findViewById(R.id.btn3);
        m_btn4 = (Button) findViewById(R.id.btn4);
        m_btn5 = (Button) findViewById(R.id.btn5);
        m_btn6 = (Button) findViewById(R.id.btn6);

        m_txtV1 = (TextView) findViewById(R.id.txt1);
        m_txtV2 = (TextView) findViewById(R.id.txt2);
        m_txtV3 = (TextView) findViewById(R.id.txt3);
        m_txtV4 = (TextView) findViewById(R.id.txt4);
        m_txtV5 = (TextView) findViewById(R.id.txt5);
        m_txtV6 = (TextView) findViewById(R.id.txt6);
        m_txtShow = (TextView) findViewById(R.id.textView6);

        m_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_txtShow.setText(m_txtV1.getText().toString());
            }
        });
        m_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_txtShow.setText(m_txtV2.getText().toString());
            }
        });
        m_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_txtShow.setText(m_txtV3.getText().toString());
            }
        });
        m_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_txtShow.setText(m_txtV4.getText().toString());
            }
        });
        m_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_txtShow.setText(m_txtV5.getText().toString());
            }
        });
        m_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_txtShow.setText(m_txtV6.getText().toString());
            }
        });
    }
    private void Show_txt1(String text)
    {

    }

}