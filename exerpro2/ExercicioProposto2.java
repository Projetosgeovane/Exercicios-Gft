package exerpro2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args){
        List<String> respostas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = teclado.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = teclado.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = teclado.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = teclado.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = teclado.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")){
                count ++;
            }
        }
        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<");
                break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 5:
                System.out.println(">> ASSASSINO <<");
                break;
            default:
                System.out.println(">> INOCENTE <<");
                break;
        }
    }
}
