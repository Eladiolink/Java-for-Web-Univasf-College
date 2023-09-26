package com.util;

import java.util.Scanner;

public class MainCanivete {
    public static void main (String args[]) {
        Canivete suico = new Canivete();
        System.out.println("Data valida = "+
                suico.validaData(0, 2, 2020));

//		int vet[] = {9, 7, 4, 3, 2, 0, 1};
//		suico.ordena(vet);

//		suico.mostrarVetor(vet);

//		int result = suico.soma2(3, 5);
//		System.out.println("Soma = "+result);

//		suico.imprimirPares(6);
//		suico.imprimirDe0a10();
//		Scanner entrada = new Scanner(System.in);
//		int x = entrada.nextInt();
//		suico.imprimirDe0aX(x);
    }

}