package com.example.metch.vegans.models;

import com.google.firebase.database.Exclude;

public class User {

    String id, email,senha;
    String nomeUser, idade, interresesUser, tempoVeg;

    public User(){

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Exclude
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getInterresesUser() {
        return interresesUser;
    }

    public void setInterresesUser(String interresesUser) {
        this.interresesUser = interresesUser;
    }

    public String getTempoVeg() {
        return tempoVeg;
    }

    public void setTempoVeg(String tempoVeg) {
        this.tempoVeg = tempoVeg;
    }
}
