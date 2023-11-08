public class Salsicha extends Cachorro
{

    public Salsicha(String nome, int idade) 
    {
        super(nome, idade);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int compareTo(Cachorro o) 
    {
        // TODO Auto-generated method stub
        if(this.idade > o.idade)
        {
            return 1;
        }
        if(this.idade < o.idade)
        {
            return -1;
        }

        return 0;
    }
    
}
