package trabalhandoComJavaCollections.map;

import java.util.*;

public class ExercicioProposto3 {
    public static void main (String[] args){
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Geovane", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for(Map.Entry<Integer, Contato> entry: agenda.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem de Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Geovane", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda1);
        for(Map.Entry<Integer, Contato> entry: agenda1.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem por Id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for(Map.Entry<Integer, Contato> entry: agenda2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem número telefone--\t");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem nome contato--\t");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}
