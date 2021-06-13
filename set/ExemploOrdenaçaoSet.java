package set;

import java.util.*;

public class ExemploOrdenaçaoSet {
    public static void main (String[] args){

        System.out.println("--\tOrdem aleatória\t--\n");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Lucifer", "Terror", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show'", "Comedia", 25));
        }};
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - "  + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem de inserção\t--");;
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Lucifer", "Terror", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show'", "Comedia", 25));
        }};
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - "  + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - "  + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - "  + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}

