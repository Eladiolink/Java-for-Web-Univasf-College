package com.poo;

public class MainEmpregado {
    public static void main(String args[]) {
        Departamento d1 = new Departamento();
        d1.setId(1);
        d1.setNomeDoDepartamento("TI");

        Cargo c1 = new Cargo();
        c1.setId(1);
        c1.setNome("Programador");
        c1.setDepartamento(d1);

        Empregado e1 = new Empregado();
        e1.setId(1);
        e1.setNome("Rodrigo");
        e1.setCargo(c1);

        System.out.println("Empregado is "+e1.getId()+
                e1.getNome()+e1.getCargo().getNome()+
                e1.getCargo().getDepartamento().getNomeDoDepartamento());

        System.out.println("Empregado: "+e1.toString());
    }
}
