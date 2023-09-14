package br.inatel.cdg.Arkanoid.Bloco;

public class Bloco {
    private static int numBlocos = 0;

    public Bloco()
    {
        numBlocos++;
        System.out.println("Bloco criado!");
    }
    public static int getNumBlocos()
    {
        return numBlocos;
    }

    public static void DestroiBloco()
    {
        numBlocos--;
    }

}
