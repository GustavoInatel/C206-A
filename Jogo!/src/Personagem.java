public class Personagem {

    String nome;
    int pontos;
    Arma arma; //associação

    public void usarArma()
    {
        System.out.println("O personagem usou a arma!");
        arma.resistencia -= 2;
        System.out.println("A arma perdou 2 pontos de resistência, agora ela possui " + arma.resistencia);
    }

    public void tomarDano()
    {
        System.out.println("O persogem está tomando dano e está perdendo vida!");
        pontos -= 5;
        System.out.println("Agora o personagem possui " + pontos + " pontos de vida!");
    }
    
}
