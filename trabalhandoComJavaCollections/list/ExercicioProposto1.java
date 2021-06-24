package trabalhandoComJavaCollections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        List<Double> temperaturasemestral = new ArrayList<>();

        double soma = 0.0;
        for(int i=1; i<= 6; i++){
            System.out.println("Qual a temperatura do mês " + i + ": ");
            double temp = teclado.nextDouble();
            temperaturasemestral.add(temp);
            soma += temp;
        }

        double temperaturamediasemestral = soma/temperaturasemestral.size();

        System.out.println("Temperatura Semestral: " + temperaturamediasemestral);
        System.out.println("Média temperatura Semestral: " + temperaturamediasemestral);
        System.out.println("-----------" );
        System.out.println("Temperaturas maiores que a média:");

        for(Double temp : temperaturasemestral){
            if(temp > temperaturamediasemestral){
                int index = temperaturasemestral.indexOf(temp);
                switch (index){
                    case 0:
                        System.out.println((index + 1) + " - Janeiro: " + temp + " oC");
                        break;

                    case 1:
                        System.out.println((index + 1) + " - Fevereiro" + temp + " oC");
                        break;

                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
