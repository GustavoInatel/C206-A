package br.inatel.cdg.SpaceShooter.Jogador;
import br.inatel.cdg.SpaceShooter.Inimigo.Asteroid;

public class Nave {
    private String nome;
    private double vida;
    private String tipotiro;

    public Nave(String nome, double vida, String tipotiro) 
    {
        this.nome = nome;
        this.vida = vida;
        this.tipotiro = tipotiro;
    }

    public void atirar(Asteroid ast)
    {
        System.out.println("A nave " + nome + " está atirando no " + ast.getNome());
    }

    
}
