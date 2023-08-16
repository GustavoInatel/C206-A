public class Zumbi {
    
    String nome;
    int vida;
    int forca;
    int velocidade;
    boolean transferencia;
    
    void atacar(Zumbi zumbi)
    {
        System.out.println("O zumbi está atacando outro zumbi! A vida atual dele é de " + vida + " e a do outro zumbi é de " + zumbi.vida);
        vida += 20;
        zumbi.vida -= 20;

        System.out.println("O zumbi alvo perdeu vida, ele está com " + zumbi.vida + " e o zumbi que atacou está com " + vida + " de vida!");
    }

    void matarZumbi(Zumbi zumbi)
    {
        System.out.println("O zumbi " + zumbi.nome + " morreu!");
    }

    public Zumbi(String nome, int vida, int forca, int velocidade) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.velocidade = velocidade;
    }

    public double mostraVida()
    {
        return vida;
    }

    
    public void transfereVida(Zumbi zumbialvo, double quantia)

    {
        vida -= quantia;
        zumbialvo.vida += quantia;
    }

    public void transfereVidacomVerificacao(Zumbi zumbialvo, double quantia)

    {
        verificaTransferencia();
        if(verificaTransferencia() == true)
        {
            vida -= quantia;
            zumbialvo.vida += quantia;
        }
        else
        {
            System.out.println("O zumbi não pode fazer uma transferência de vida, porque ele não possui mais vida.");
        }
    }
     

      public boolean verificaTransferencia()

    {
        if(vida > 0)
        {
            return true;
        }

        else
        {
            return false;
        }
        
    }
}
