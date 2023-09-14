package br.inatel.cdg.SpaceShooter.Inimigo;

public class Asteroid {
    private String nome;
    private String tipoAsteroid;

    public Asteroid(String nome, String tipoAsteroid) 
    {
        this.nome = nome;
        this.tipoAsteroid = tipoAsteroid;
    }

    public void destruir()
    {
        System.out.println(" O asteroid " + nome + " está sofrendo dano!");
        System.out.println("BOOOOOOOOOOOM! ELE FOI DESTRUÍDO");
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAsteroid() {
        return tipoAsteroid;
    }
    
}
