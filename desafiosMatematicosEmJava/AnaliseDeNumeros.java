package desafiosMatematicosEmJava;

import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);

        int Positivo, Negativo, Par, Impar, x;

        Positivo = Negativo = Par = Impar = 0;


        for (int i = 0; i < 5; i++) {
            x = leitor.nextInt();

            if (x % 2 == 0) {
                Par++;
            } else {
                Impar++;
            }

            if (x > 0) Positivo++;
            if (x < 0) Negativo++;
        }

        System.out.println("" + Par +" valor(es) par(es)");
        System.out.println("" + Impar + " valor(es) impar(es)");
        System.out.println("" + Positivo + " valor(es) positivo(s)");
        System.out.println("" + Negativo + " valor(es) negativo(s)");
    }
}
