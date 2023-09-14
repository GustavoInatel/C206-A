/* import br.inatel.cdg.SpaceShooter.Inimigo.Asteroid;
import br.inatel.cdg.SpaceShooter.Jogador.Nave; */
import br.inatel.cdg.Arkanoid.Bloco.Bloco;
import br.inatel.cdg.Arkanoid.Conversor.Conversor;
import br.inatel.cdg.Arkanoid.Jogador.Jogador;

public final class App 
{
    public static void main(String[] args) 
    {
        /* Pessoa pessoa = new Pessoa("Gustavo", 20);
        System.out.println("Nome da pessoa:  " + pessoa.getNome());
        System.out.println("Idade da pessoa: " + pessoa.getIdade()); */
        /* Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();
        
        System.out.println(bloco1.getNumBloco());
        System.out.println(bloco2.getNumBloco());
        System.out.println(bloco3.getNumBloco());
        System.out.println(bloco4.getNumBloco()); */
        
        /*
            a saída será assim

            1
            1
            1
            1

            perceba que os valores não foram encremetados, mas por quê? Porque os objetos acessaram lugares diferetes na memória. Quando eles entram na classe, eles veem o valor zero e incrementam, logo após isso, eles saem. E fica assim, porque o atributo não é da classe, e sim do objeto, entao cada objeto pega um numBlocos diferente
         */

         /* System.out.println(Bloco.getNumBloco2()); */ //perceba que aqui incrimentou, mas usando o objeto, não incrementa, justamente porque é preciso compartilhar o atributo entre os objetos, como se salvasse o valor na classe
         
         //métodos com static não dependem de nenhuma instância

         /* Nave nave = new Nave("Nave Espacial", 2000, "Canhão");

         Asteroid asteroid1 = new Asteroid("Asteroid Grande", "Grande");
         Asteroid asteroid2 = new Asteroid("Asteroid Pequeno", "Pequeno");

         nave.atirar(asteroid2);
         asteroid1.destruir(); */

         
         //ARKANOID

        Jogador jogador = new Jogador();
        jogador.setNome("Gustavo");
        
        System.out.println("Número de blocos criados: " + Bloco.getNumBlocos());

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();
        Bloco bloco5 = new Bloco();

        System.out.println("Número de blocos criados: " + Bloco.getNumBlocos());

        jogador.jogadorDestruir(); //assim sempre vai dar o mesmo valor
        System.out.println("Número de pontos do jogardor: " + Jogador.getPontos());
        //é só fazer dessa forma
        jogador.jogadorDestruir();
        System.out.println("Número de pontos do jogardor: " + Jogador.getPontos());
      
      
        /* Jogador.jogadorDestruir();
        System.out.println("Número de pontos do jogardor: " + jogador.getPontos());
        Jogador.jogadorDestruir();
        System.out.println("Número de pontos do jogardor: " + jogador.getPontos());
        Jogador.jogadorDestruir();
        System.out.println("Número de pontos do jogardor: " + jogador.getPontos());
        Jogador.jogadorDestruir();
        System.out.println("Número de pontos do jogardor: " + jogador.getPontos()); */
      
        Conversor.converte(); //método que converte os pontos para moedas
    }
}
