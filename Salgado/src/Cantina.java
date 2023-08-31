public class Cantina {
    
    String nome;

    Salgado[] salgados = new Salgado[5]; //associação com cantina

    public void addSalgado(Salgado novosalgado)
    {
        for(int i = 0; i < salgados.length; i++)
        {
            if(salgados[i] == null)
            {
                System.out.println("Salgado sendo adicionado!");
                salgados[i] = novosalgado;
                break; //tem que dar o break, porque vou adicionar apenas um salgado na posição. Se eu quisesse inserir mais um salgado, teria que usar outra posição
            }
        }
    }

    public void mostraInfo()
    {
        for(Salgado snacks : salgados)
        {
            if(snacks != null)
            {
                System.out.println("O salgado " + snacks.nome + " foi adicionado!");
            }
        }
    }

}
