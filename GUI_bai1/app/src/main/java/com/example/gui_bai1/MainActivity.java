package com.example.gui_bai1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnTong, btnHieu, btnTich, btnThuong, btnUCLN, btnThoat;
    TextView txtViewKQ;
    EditText editTextA, editTextB;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnTong = findViewById(R.id.btnTong);
        btnHieu = findViewById(R.id.btnHieu);
        btnTich = findViewById(R.id.btnTich);
        btnThuong = findViewById(R.id.btnThuong);
        btnUCLN = findViewById(R.id.btnUCLN);
        btnThoat = findViewById(R.id.btnThoat);
        txtViewKQ = findViewById(R.id.txtViewKQ);
        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(editTextA.getText().toString());
                float b = Float.parseFloat(editTextB.getText().toString());
                float kq =  a + b;
                txtViewKQ.setText(String.valueOf(kq));
            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(editTextA.getText().toString());
                float b = Float.parseFloat(editTextB.getText().toString());
                float kq =  a - b;
                txtViewKQ.setText(String.valueOf(kq));
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(editTextA.getText().toString());
                float b = Float.parseFloat(editTextB.getText().toString());
                float kq =  a * b;
                txtViewKQ.setText(String.valueOf(kq));
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(editTextA.getText().toString());
                float b = Float.parseFloat(editTextB.getText().toString());
                float kq =  a / b;
                txtViewKQ.setText(String.valueOf(kq));
            }
        });
        btnUCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editTextA.getText().toString());
                int b = Integer.parseInt(editTextB.getText().toString());
                while(b != 0){
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                txtViewKQ.setText(String.valueOf(a));
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}