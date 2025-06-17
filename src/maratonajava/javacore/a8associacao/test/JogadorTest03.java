package maratonajava.javacore.a8associacao.test;

import maratonajava.javacore.a8associacao.dominio.Jogador;
import maratonajava.javacore.a8associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time = new Time("Brasil");
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
