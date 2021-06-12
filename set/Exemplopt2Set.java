package set;

import java.util.*;

public class Exemplopt2Set {
    public static void main(String[] args){
        Set<Double> notas = new LinkedHashSet<>();
        notas.add(7d);
        notas.add(8.0);
        notas.add(6d);
        notas.add(8.5);
        notas.add(9d);
        notas.add(8.2);
        notas.add(4d);
        notas.add(8.8);
        notas.add(7.3);
        notas.add(2.5);
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
    }
}
