package trabalhandoComJavaCollections.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main (String[] args){
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "5", "7", "9", "6");

        System.out.println("Imprima todos os elementos dessa lista de String: ");

        numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set: ");
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());


        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nMostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\nRemova os valores ímpares.");
        collectList.removeIf(integer -> integer % 2 != 0);
        System.out.println(collectList);

    }
}
