public class Bloco {

    private int numBloco = 0; //dessa forma, toda vez que eu chamar o atributo, ele sempre mostrará o mesmo valor, porque nesse caso, o atributo vai ser do objeto, não da classe
    private static int numBloco2 = 0;

    public Bloco()
    {
        numBloco++;
        numBloco2++;
    }

    public int getNumBloco()
    {
        return this.numBloco;
    }

    public static int getNumBloco2()
    {
        return numBloco2;
    }
}
