package com.util;

public class Canivete {

    public boolean validaData(int dia, int mes, int ano) {
        boolean valido = true;
        if ((mes > 0 && mes <= 12) && (dia > 0 && dia <= 31)) {
            valido = true;
        } else {
            valido = false;
        }
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) &&
                (dia > 30)) {
            valido = false;
        }
        if (mes == 2) {
            if (dia > 29) {
                valido = false;
            }
            if (dia == 29) {
                if (ano % 4 == 0) {
                    valido = true;
                } else {
                    valido = false;
                }
            }
        }
        return valido;
    }

    public void ordena(int vet[]) {
        int aux = 0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        mostrarVetor(vet);
    }

    public void mostrarVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vetor[" + i + "]=" + vet[i]);
        }
    }

    public int soma2(int a, int b) {
        return soma(a, b);
    }

    private int soma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public void imprimirPares(int x) {
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero=" + i);
            }
        }
    }

    public void imprimirDe0aX(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println("Numero=" + i);
        }
    }

    public void imprimirDe0a10() {
        for (int i = 0; i < 11; i++) {
            System.out.println("Numero=" + i);
        }
    }
}
