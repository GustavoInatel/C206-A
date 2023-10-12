public class Twitter extends RedeSocial  implements Compartilhamento
{

    public Twitter(String senha, int numAmigos) 
    {
        super(senha, numAmigos);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void compartilhar() 
    {
        // TODO Auto-generated method stub
        System.out.println("Fez um compartilhamento no Twitter!");
    }

    @Override
    public void postarFoto() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou uma foto no Twitter!");
       
    }

    @Override
    public void postarVideo() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou um vídeo no Twitter!");
     
    }

    @Override
    public void postarComentario() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou um comentário no Twitter!");
   
    }
    
}
