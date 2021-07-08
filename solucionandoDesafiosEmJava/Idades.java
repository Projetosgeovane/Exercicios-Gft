package solucionandoDesafiosEmJava;

import java.util.Scanner;

public class Idades {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double soma = 0.0;
        int n = 0;

        while (n >= 0) {
            n = leitor.nextInt();
            if (n >= 0) {
                cont++;
                soma+=n;
            }
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));

        leitor.close();
    }
    }

