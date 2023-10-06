public class Lontra extends Mamifero implements Aquatico
{

    public Lontra(String nome, double vida) 
    {
        super(nome, vida);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("O(a) " + nome + " está emitindo som!");
    }

    @Override
    public void nadar() 
    {
        // TODO Auto-generated method stub
        System.out.println("A " + nome + " está nadando!");
    }
    
}
