package br.inatel.cdg.Arkanoid.Jogador;
import br.inatel.cdg.Arkanoid.Bloco.Bloco;
import br.inatel.cdg.Arkanoid.Conversor.Conversor;

public class Jogador 
{
    private String nome;
    private Bloco bloco;
    private static int pontos = 0;
    private Conversor conversor;

    public void jogadorDestruir()
    {
        Bloco.DestroiBloco();
        pontos += 5;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getPontos()
    {
        return pontos;
    }

}
