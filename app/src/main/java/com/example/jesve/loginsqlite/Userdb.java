package com.example.jesve.loginsqlite;

/* Created by Jesus Vega on 22/11/2017. */

import android.provider.BaseColumns;

import java.util.UUID;

public class Userdb {
    private String id, name, surname, email, password, phone, nationality, profession, liking;

    public Userdb(String name,
                  String surname, String email, String password,
                  String phone, String nationality, String profession,
                  String liking){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.nationality = nationality;
        this.profession = profession;
        this.liking = liking;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getPhone(){
        return phone;
    }

    public String getNationality(){
        return nationality;
    }

    public String getProfession(){
        return profession;
    }

    public String getLiking(){
        return liking;
    }

    //clase interna
    public static class inputUsers implements BaseColumns{
        public static final String TABLA_NOMBRE = "Usuarios";

        public static final String EMAIL_COLUMNA1 = "Email";
        public static final String PASSWORD_COLUMNA2 = "Password";
        public static final String NOMBRE_COLUMNA3 = "Nombre";
        public static final String APELLIDO_COLUMNA4 = "Apellido";
        public static final String NACIONALIDAD_COLUMNA5 = "Nacionalidad";
        public static final String TELEFONO_COLUMNA6 = "Telefono";
        public static final String PROFESION_COLUMNA7 = "Profesión";
        public static final String GUSTOS_COLUMNA8 = "Gustos";
    }

    //Tipo de texto
    private static final String TIPO_TEXTO = " TEXT";

    //Separador de Campos
    private static final String SEPARADOR = ",";

    //Crear Tabla
    public static final String SQL_CREAR_ENTRADAS =
            "CREATE TABLE "+ inputUsers.TABLA_NOMBRE + " (" +
                    inputUsers._ID + " INTEGER PRIMARY KEY," +
                    inputUsers.EMAIL_COLUMNA1 + TIPO_TEXTO + SEPARADOR +
                    inputUsers.PASSWORD_COLUMNA2 + TIPO_TEXTO + SEPARADOR +
                    inputUsers.NOMBRE_COLUMNA3 + TIPO_TEXTO + SEPARADOR +
                    inputUsers.APELLIDO_COLUMNA4 + TIPO_TEXTO + SEPARADOR +
                    inputUsers.NACIONALIDAD_COLUMNA5 + TIPO_TEXTO + SEPARADOR +
                    inputUsers.TELEFONO_COLUMNA6 + TIPO_TEXTO + SEPARADOR +
                    inputUsers.PROFESION_COLUMNA7 + TIPO_TEXTO + SEPARADOR +
                    inputUsers.GUSTOS_COLUMNA8+ TIPO_TEXTO + " )";

    //Eliminar o actualizar Tabla
    public static final String SQL_ELIMINAR_ENTRADAS =
            "DROP TABLE IF EXIST" + inputUsers.TABLA_NOMBRE;
}