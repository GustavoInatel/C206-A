public class Banda
{

    private String nome;
    private String genero;
    Empresario empresario; //associação
    Membro[] membros = new Membro[5]; //associação
    Musica[] musicas = new Musica[5]; //associação

    public void mostraInfo()
    {
        System.out.println("Nome da banda: " + nome);
        System.out.println("Gênero da banda: " + genero);

        System.out.println("Nome dos membros: ");
        for(Membro mostramembro : membros)
        {
            if(mostramembro != null)
            {
                System.out.println(mostramembro.getNome());
            }
            else
            {
                System.out.println("Nenhum membro foi adicionado!");
            }
        }

        System.out.println();
        System.out.println("Nome das músicas da banda: ");
        for(Musica mostramusicas : musicas)
        {
            if(mostramusicas != null)
            {
                System.out.println(mostramusicas.getNome());
            }
            else
            {
                System.out.println("Nenhuma música foi adicionada!");
            }
        }
    }
    
    public void addMusica(Musica musica)
    {
        for(int i = 0; i < musicas.length; i++)
        {
            if(musicas[i] == null)
            {
                System.out.println("Adicionando música...");
                this.musicas[i] = musica;
                break; //vou adicionar apenas uma música
            }
        }
    }

    public void addnovoMembro(Membro membro)
    {
        for(int i = 0; i < membros.length; i++)
        {
            if(membros[i] == null)
            {
                System.out.println("Adicionando novo membro...");
               this.membros[i] = membro;
                break; //adicionando apenas um membro na posição
            }
        }
    }

    public Banda(String nome, String genero) //construtor
    {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}