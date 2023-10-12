public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento
{

    public GooglePlus(String senha, int numAmigos) 
    {
        super(senha, numAmigos);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void compartilhar() 
    {
        // TODO Auto-generated method stub
        System.out.println("Fez um compartilhamento no Google Plus!");
        
    }

    @Override
    public void fazStreaming() 
    {
        // TODO Auto-generated method stub
        System.out.println("Fazendo streaming no Google Plus!");
      
    }

    @Override
    public void postarFoto() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou uma foto no Google Plus!");
    }

    @Override
    public void postarVideo() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou um vídeo no Google Plus!");
       
    }

    @Override
    public void postarComentario() 
    {
        // TODO Auto-generated method stub
        System.out.println("Postou um comentário no Google Plus!");
       
    }
    
}
