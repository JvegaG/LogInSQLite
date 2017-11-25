package com.example.jesve.loginsqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserLogIn extends AppCompatActivity {

    private Button btnSignUp, btnLogIn, btnhelp;
    private EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_log_in);

        //Linking buttons at the Log In
        btnSignUp = findViewById(R.id.btn_signup_login);
        btnLogIn = findViewById(R.id.btn_login_login);
        btnhelp = findViewById(R.id.btn_help_login);

        //Linking EditText at the Log In
        etEmail = findViewById(R.id.et_email_login);
        etPassword =  findViewById(R.id.et_password_login);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verEmail = etEmail.getText().toString();
                String verPassword = etPassword.getText().toString();

                if (verEmail.isEmpty()) {
                    etEmail.setError("Please enter your e-mail");
                }
                else if(verPassword.isEmpty()){
                    etPassword.setError("Please enter your password");
                }
                else{
                    Intent intent = new Intent(UserLogIn.this, ViewUser.class);
                    startActivity(intent);
                }
            }
        });


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserLogIn.this, UserSignUp.class);
                startActivity(intent);
            }
        });

        btnhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Created by JvegaG",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
