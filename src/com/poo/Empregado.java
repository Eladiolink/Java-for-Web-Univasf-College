package com.poo;

public class Empregado {
    private Integer id;
    private String nomeDoEmpregado;
    private Cargo cargo;

    public Empregado() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nomeDoEmpregado;
    }

    public void setNome(String nome) {
        this.nomeDoEmpregado = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empregado [id=" + id + ", nome=" + nomeDoEmpregado + ", cargo=" + cargo + "]";
    }

}
