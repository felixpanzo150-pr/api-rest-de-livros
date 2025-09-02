package com.api.livros.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    private String nome;
    private String autor;
    private int ano;
    private double preco;

    public Livros(Long id, String autor, String nome, int ano, double preco) {
        Id = id;
        this.autor = autor;
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Livros(){

    }

    @Override
    public String toString() {
        return "Livros{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }
}
