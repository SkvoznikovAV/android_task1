package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChange = findViewById(R.id.btnChange);
        btnChange.setOnClickListener((v)-> {
            setContentView(R.layout.activity_main2);

            findViewById(R.id.btnSubmit).setOnClickListener((v1)-> {
                TextView lblErr = findViewById(R.id.lblErr);

                EditText editFio=findViewById(R.id.editFio);
                EditText editPhone=findViewById(R.id.editPhone);
                EditText editEmail=findViewById(R.id.editEmail);
                EditText editPass=findViewById(R.id.editPass);

                if (TextUtils.isEmpty(editFio.getText())){
                    lblErr.setText("Введите ФИО");
                    return;
                }
                if (TextUtils.isEmpty(editPhone.getText())){
                    lblErr.setText("Введите телефон");
                    return;
                }
                if (TextUtils.isEmpty(editEmail.getText())){
                    lblErr.setText("Введите e-mail");
                    return;
                }
                if (TextUtils.isEmpty(editPass.getText())){
                    lblErr.setText("Введите пароль");
                    return;
                }

                lblErr.setText("Данные отправлены");

            });

        });

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener((v)-> {
            EditText edit1 = findViewById(R.id.edit1);
            edit1.setText(edit1.getText()+"Нажата кнопка ");
        });
    }
}