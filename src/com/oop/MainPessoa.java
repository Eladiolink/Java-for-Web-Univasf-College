package com.oop;

public class MainPessoa {
    public static void main (String args[]) {
        Pessoa p1 = new Pessoa();
        p1.setId(1);
        p1.setNome("Ze");

        System.out.println("Pessoa 1 is "+p1.getId() +"-"+p1.getNome());

        Pessoa p2 = new Pessoa();
        p2.setId(2);
        p2.setNome("Jao");
        System.out.println("Pessoa 2 is "+p2.getNome());

        Pessoa p3 = new Pessoa(3, "Maria");
        System.out.println("Pessoa 3 is "+p3.getNome());

        Pessoa p4 = new Pessoa(4);
        p4.setNome("Ana");
        System.out.println("Pessoa 4 is "+p4.toString());
    }

}
