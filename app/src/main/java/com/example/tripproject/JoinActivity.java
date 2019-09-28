package com.example.tripproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class JoinActivity extends AppCompatActivity {

    private EditText etId;
    private EditText etPassword;
    private EditText etCheckPassword;
    private EditText etNickname;
    private Button btnMalebutton;
    private Button btnFemalebutton;
    private Button btnDone;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        etId = (EditText) findViewById(R.id.etId);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etCheckPassword = (EditText) findViewById(R.id.etCheckPassword);
        etNickname = (EditText) findViewById(R.id.etNickname);
        btnFemalebutton = (Button) findViewById(R.id.btnFemale);
        btnMalebutton = (Button) findViewById(R.id.btnMale);
        btnDone = (Button) findViewById(R.id.btn_join_complete);

        Button.OnClickListener onClickListener  = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnFemale:
                        break;
                    case R.id.btnMale:
                        break;
                    case R.id.btn_join_complete:
                        if(etId.getText().toString().length() == 0) {
                            Toast.makeText(JoinActivity.this, "아이디를 입력하세요.", Toast.LENGTH_SHORT).show();
                            etId.requestFocus();
                            return;
                        }
                        if(etPassword.getText().toString().length() == 0) {
                            Toast.makeText(JoinActivity.this, "비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                            etPassword.requestFocus();
                            return;
                        }
                        if(!etPassword.getText().toString().equals(etCheckPassword.getText().toString())) {
                            Toast.makeText(JoinActivity.this, "비밀번호가 일치하지 않습니다!", Toast.LENGTH_SHORT).show();
                            etPassword.requestFocus();
                            return;
                        }
                        if(etNickname.getText().toString().length() == 0) {
                            Toast.makeText(JoinActivity.this, "닉네임을 입력하세요.", Toast.LENGTH_SHORT).show();
                            etNickname.requestFocus();
                            return;
                        }
                        Intent result = new Intent();
                        result.putExtra("Id", etId.getText().toString());
                        setResult(RESULT_OK, result);
                        finish();
                }
            }
        };

        btnMalebutton.setOnClickListener(onClickListener);
        btnFemalebutton.setOnClickListener(onClickListener);
        btnDone.setOnClickListener(onClickListener);

        etCheckPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String password = etPassword.getText().toString();
                String check = etCheckPassword.getText().toString();

                if(password.equals(check)) {
                    etPassword.setBackgroundColor(Color.GREEN);
                    etCheckPassword.setBackgroundColor(Color.GREEN);
                } else {
                    etPassword.setBackgroundColor(Color.RED);
                    etCheckPassword.setBackgroundColor(Color.RED);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }
}
