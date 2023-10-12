public class Instagram extends RedeSocial
{

    public Instagram(String senha, int numAmigos) 
    {
        super(senha, numAmigos);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void postarFoto() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou uma foto no Instagram!");
     
    }

    @Override
    public void postarVideo() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou um vídeo no Instagram!");
     
    }

    @Override
    public void postarComentario() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou um comentário no Instagram!");
       
    }

    @Override
    public void curtirPublicacao()
    {
        System.out.println("Curtiu uma publicação no Instagram!");
    }
    
}
