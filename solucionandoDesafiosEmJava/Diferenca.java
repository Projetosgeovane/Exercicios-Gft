package solucionandoDesafiosEmJava;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Integer A, B, C, D, DIFERENCA;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
        teclado.close();
    }
}
