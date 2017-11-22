package com.example.jesve.loginsqlite;

/* Created by Jesus Vega on 22/11/2017. */

public class Userdb {
    private String name, surname, email, password, phone, nationality, profession, liking;

    public Userdb(String name,
                  String surname, String email, String password,
                  String phone, String nationality, String profession,
                  String liking){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.nationality = nationality;
        this.profession = profession;
        this.liking = liking;
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
}
