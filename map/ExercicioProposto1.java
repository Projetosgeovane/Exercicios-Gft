package map;

import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args){
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        estados.put("RN", 3534165);
        System.out.println(estados);

        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
                "PB - 4.039.277: " + estados.containsKey("PB"));
        estados.put("PB", 4039277);
        System.out.println(estados);

        System.out.println("\nExiba a população do estado PE: " + estados.get("PE"));

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados1);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> estados2 = new TreeMap<>(estados);
        System.out.println(estados2);

        Collection<Integer> populacao = estados.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estados.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("\nExiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("\nExiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = estados.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população desses estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma / estados.size()));
        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = estados.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(estados);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        estados.clear();
        System.out.println(estados);

        System.out.println("\nConfira se a lista está vazia: " + estados.isEmpty());

    }
}
