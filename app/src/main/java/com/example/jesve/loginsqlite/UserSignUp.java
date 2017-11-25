package com.example.jesve.loginsqlite;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserSignUp extends AppCompatActivity {

    private Button btnHelp, btnSave;
    private EditText etName, etSurname, etEmail, etPassword, etPhone, etNationality, etProfession, etLiking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);

        //-------------------- Links -------------------
        // Linking Buttons at the SignUp Activity
        btnHelp = findViewById(R.id.btn_help_signup);
        btnSave = findViewById(R.id.btn_save_signup);


        //Linking EditText to the SignUp Activity
        etName = findViewById(R.id.et_name);
        etSurname = findViewById(R.id.et_surname);
        etEmail = findViewById(R.id.et_email_signup);
        etPassword = findViewById(R.id.et_password_signup);
        etPhone = findViewById(R.id.et_phone_signup);
        etNationality = findViewById(R.id.et_nationality_signup);
        etProfession = findViewById(R.id.et_profession_signup);
        etLiking = findViewById(R.id.et_liking_signup);

        //Instancia
        final UserDBHelper helper = new UserDBHelper(this);

        //-------------------- EVENTS -------------------
        // Help
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ingresar la informacion de los Usuarios para la base de datos", Toast.LENGTH_SHORT).show();
            }
        });

        // Save
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Let's write information at the database
                SQLiteDatabase db = helper.getWritableDatabase();

                // Values's Map
                ContentValues values = new ContentValues();
                values.put(Userdb.inputUsers.EMAIL_COLUMNA1, etEmail.getText().toString());
                values.put(Userdb.inputUsers.PASSWORD_COLUMNA2, etPassword.getText().toString());
                values.put(Userdb.inputUsers.NOMBRE_COLUMNA3, etName.getText().toString());
                values.put(Userdb.inputUsers.APELLIDO_COLUMNA4, etSurname.getText().toString());
                values.put(Userdb.inputUsers.NACIONALIDAD_COLUMNA5, etNationality.getText().toString());
                values.put(Userdb.inputUsers.TELEFONO_COLUMNA6, etPhone.getText().toString());
                values.put(Userdb.inputUsers.PROFESION_COLUMNA7, etProfession.getText().toString());
                values.put(Userdb.inputUsers.GUSTOS_COLUMNA8, etLiking.getText().toString());

                //Insertar nueva fila
                long newRowId = db.insert(Userdb.inputUsers.TABLA_NOMBRE, null,values);

                //Toast
                Toast.makeText( UserSignUp.this, "Se guardo el registro con clave: " + newRowId, Toast.LENGTH_SHORT).show();
            }
        });


    }
}