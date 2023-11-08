public abstract class Cachorro implements Comparable<Cachorro>
{
    protected String nome;
    protected int idade;

    public Cachorro(String nome, int idade) 
    {
        this.nome = nome;
        this.idade = idade;
    }

    
}