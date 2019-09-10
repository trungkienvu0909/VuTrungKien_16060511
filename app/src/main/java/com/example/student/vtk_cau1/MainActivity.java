package com.example.student.vtk_cau1;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {
    Button btnNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNhap = findViewById(R.id.bottom);
        //btnThoat = (Button)findViewById(R.id.button2);

        final CheckBox checkBox = findViewById(R.id.checkBox);
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());


                if (checkBox.isSelected()) {
                    builder.setMessage("“Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu”");
                    AlertDialog dialog = builder.create();
                    dialog.show();

                } else {
                    builder.setMessage("“Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu” ");
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }


            }
        });

    }
}
