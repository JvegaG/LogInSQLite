package com.example.jesve.loginsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewUser extends AppCompatActivity {

    private Button btnHelp;
    private TextView txtName, txtSurname, txtNationality, txtPhone, txtProfession, txtLiking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user);

        // Linking  Button at The ViewUser
        btnHelp = findViewById(R.id.btn_help_view);

        // Linking Textview at The ViewUser
        txtName = findViewById(R.id.txt_name);
        txtSurname = findViewById(R.id.txt_surname);
        txtNationality = findViewById(R.id.txt_nationality);
        txtPhone = findViewById(R.id.txt_phone);
        txtProfession= findViewById(R.id.txt_profession);
        txtLiking= findViewById(R.id.txt_liking);

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewUser.this, "Created by JvegaG", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
