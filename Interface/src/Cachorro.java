public class Cachorro extends Mamifero 
{

    public Cachorro(String nome, double vida) 
    {
        super(nome, vida);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void emitirSom() 
    {
        // TODO Auto-generated method stub
        System.out.println("O " + nome + " está emitindo som!");
    }
        
}
