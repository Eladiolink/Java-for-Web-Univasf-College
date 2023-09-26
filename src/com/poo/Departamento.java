package com.poo;

public class Departamento {
    private Integer id;
    private String nomeDoDepartamento;
    public Departamento() {

    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNomeDoDepartamento() {
        return nomeDoDepartamento;
    }
    public void setNomeDoDepartamento(String nomeDoDepartamento) {
        this.nomeDoDepartamento = nomeDoDepartamento;
    }
    @Override
    public String toString() {
        return "Departamento [id=" + id + ", nomeDoDepartamento=" + nomeDoDepartamento + "]";
    }


}
