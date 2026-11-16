package main;

import utils.Input;

public class Series {
    private String nome;
    private String plataforma;
    private double nota;

    //construtores
    public Series(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
    }

    public Series(String nome) {
        this.nome = nome;
        this.plataforma = "plataforma indefinida";
    }

    //to string
    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    //getnota

    public double getNota() {
        return nota;
    }
    //setnota

    public boolean setNota(double novaNota) {
        if (novaNota < 0 || novaNota > 10) {
            return false;
        }
        this.nota = novaNota;
        return true;

    }
}