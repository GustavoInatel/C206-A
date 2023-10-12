public class Usuário 
{
    private String nome;
    private String email;
    private RedeSocial[] redeSocial;

    public void Usuario(RedeSocial[] redesSociais)
    {
        System.out.println("Nome do usuário: " + nome);
        System.out.println("Email: " + email);
        for (int i = 0; i < redeSocial.length; i++) 
        {
            if(redeSocial[i] == null)
            {
                redeSocial[i] = redesSociais[i];
            }
        }

        for (int i = 0; i < redesSociais.length; i++) 
        {
            if(redeSocial[i] != null)
            {
                if(redeSocial[i] instanceof Facebook)
                {
                    Facebook f = (Facebook) redeSocial[i];
                    f.compartilhar();
                    f.curtirPublicacao();
                    f.postarComentario();
                    f.postarFoto();
                    f.postarVideo();
                }

                else if(redeSocial[i] instanceof GooglePlus)
                {
                    GooglePlus g = (GooglePlus) redeSocial[i];
                    g.curtirPublicacao();
                    g.postarComentario();
                    g.postarFoto();
                    g.postarVideo();
                }

                else if(redeSocial[i] instanceof Twitter)
                {
                    Twitter t = (Twitter) redeSocial[i];
                    t.compartilhar();
                    t.postarComentario();
                    t.postarFoto();
                    t.postarVideo();
                }

                else if(redeSocial[i] instanceof Instagram)
                {
                    Instagram in = (Instagram) redeSocial[i];
                    in.curtirPublicacao();
                    in.postarComentario();
                    in.postarFoto();
                    in.postarVideo();
                }
            }
        }
    }

    public Usuário(String nome, String email) 
    {
        this.nome = nome;
        this.email = email;

        redeSocial = new RedeSocial[10];
    }
}