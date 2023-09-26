package com.poo;

public class Cargo {
    private Integer id;
    private String nomeDoCargo;
    private Departamento departamento;

    public Cargo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nomeDoCargo;
    }

    public void setNome(String nome) {
        this.nomeDoCargo = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Cargo [id=" + id + ", nome=" + nomeDoCargo + ", departamento=" + departamento + "]";
    }

}