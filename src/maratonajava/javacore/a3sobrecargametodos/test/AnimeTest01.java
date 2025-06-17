package maratonajava.javacore.a3sobrecargametodos.test;

import maratonajava.javacore.a3sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12,"Ação");
        anime.imprime();
    }
}
