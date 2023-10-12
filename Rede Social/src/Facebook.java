public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento
{

    public Facebook(String senha, int numAmigos) 
    {
        super(senha, numAmigos);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void compartilhar()
    {
        // TODO Auto-generated method stub
        System.out.println("Fez um compartilhamento no Facebook!");
       
    }

    @Override
    public void fazStreaming() 
    {
        // TODO Auto-generated method stub
        System.out.println("Fazendo streaming no Facebook!");
       
    }

    @Override
    public void postarFoto() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou uma foto no Facebook!");
       
    }

    @Override
    public void postarVideo() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou um vídeo no Facebook!");
        
    }

    @Override
    public void postarComentario() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou um comentário no Facebook!");
        
    }

    @Override
    public void curtirPublicacao()
    {
        System.out.println("Curtiu uma publicação no Facebook!");
    }

}