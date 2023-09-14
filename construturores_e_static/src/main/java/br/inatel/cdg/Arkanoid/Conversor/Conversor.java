package br.inatel.cdg.Arkanoid.Conversor;
import br.inatel.cdg.Arkanoid.Jogador.Jogador;

public class Conversor {

    private static int moedas;

    public static void converte()
    {
        moedas = Jogador.getPontos() * 100;
        System.out.println("O jogador tem " + moedas + " moedas!");
    }
}
