package maratonajava.javacore.a6blocosinicializacao.test;

import maratonajava.javacore.a6blocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }
    }
}
