package com.example.myapplication.tuan1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


import com.example.myapplication.R;

public class Tuan11MainActivity extends AppCompatActivity {
    // khai báo các control
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan11_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
            });
        txt1 = findViewById(R.id.demo11txt1);
        txt2 = findViewById(R.id.demo11txt2);
        btn1 = findViewById(R.id.demo11btn1);
        tv1 = findViewById(R.id.demo11Tv1);
        // Xử lý sự kiện
        btn1.setOnClickListener(v->{
            // gọi hàm tính tổng
            tinhTong();
        });
    }
    // dinh nghia ham nhap vao
    private void tinhTong() {
        // lấy dữ liệu nhập vào từ edit text 1
        String str1 = txt1.getText().toString();
        float so1 = Float.parseFloat(str1); // chuyển dữ liệu sang số
        // Lấy dữ liệu nhập vào từ edit text 2
        String str2 = txt2.getText().toString();
        float so2 = Float.parseFloat(str2);
        // tính tổng
        float tong = so1 + so2;
        // in kết quả ra màn hình
        tv1.setText(String.valueOf(tong));
    }
}