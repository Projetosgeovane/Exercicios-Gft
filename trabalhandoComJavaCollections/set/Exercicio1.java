package trabalhandoComJavaCollections.set;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args){
        System.out.println("Crie um conjunto contendo as cores do arco-íris: ");
        Set<String> arcoiris = new HashSet<>();
        arcoiris.add("violeta");
        arcoiris.add("anil");
        arcoiris.add("azul");
        arcoiris.add("verde");
        arcoiris.add("amarelo");
        arcoiris.add("laranja");
        arcoiris.add("vermelho");
        System.out.println(arcoiris + "\n" );

        System.out.println("Exiba todas as cores do arco-íris uma abaixa da outra: ");
        for (String cor : arcoiris) {
            System.out.println(cor);
        }

        System.out.println("\nExiba as cores do arco-íris em ordem alfabética: ");
        Set<String> arcoiris1 = new TreeSet<>(arcoiris);
        System.out.println(arcoiris1);

        System.out.println("\nExiba as cores do arco-íris na ordem inversa: ");
        Set<String> arcoiris2 = new LinkedHashSet<>(Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(arcoiris2);
        List<String> arcoirisList = new ArrayList<>(arcoiris2);
        Collections.reverse(arcoirisList);
        System.out.println(arcoirisList);

        System.out.println("\nExiba todas as cores do arco-íris que contenha a letra 'v': ");
        for (String cor : arcoiris){
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("\nRemova todas as cores do arco-íris que não começam com a letra 'v': ");
        Iterator<String> iterator2 = arcoiris.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(arcoiris);

        System.out.println("\nLimpe o conjunto: ");
        arcoiris.clear();

        System.out.println("\nConfira se o conjunto está vazio: " + arcoiris.isEmpty());
    }
}
