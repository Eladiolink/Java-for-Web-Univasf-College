package com.app;

public class Basico2 {
    public static void main(String args[]) {
        int i[] = {10, 12, 14, 16, 18};

        for (int j = 0; j < 4; j++) {
            System.out.println("i["+j+"]="+i[j]);
        }

        System.out.println("Tamanho do vetor is "+i.length);

        int a = 6;
        Integer b = 7;
        System.out.println("int is "+b.intValue());
    }
}
