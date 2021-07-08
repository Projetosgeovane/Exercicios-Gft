package desafiosMatematicosEmJava;

import java.io.IOException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        double positivo, x;

        int i = 0;
        positivo = 0;

        while(i <= 5){
            x = teclado.nextDouble();

            if(x > 0){
                positivo++;
            }
            i++;
        }

        System.out.println("" + positivo + " valores positivos");
    }
}