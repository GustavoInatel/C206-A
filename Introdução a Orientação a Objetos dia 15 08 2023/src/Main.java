public class Main {
    public static void main(String[] args) throws Exception {
        /*
        Conta conta = new Conta();

        conta.limite = 10;
        conta.saldo = 100;
        conta.numero = 1234;
        conta.nomeTitular = "Gustavo"; */

        //exercício 2
        Zumbi zumbi1 = new Zumbi("Zumbi Malvado", 2000, 230, 100);
        Zumbi zumbi2 = new Zumbi("Zumbi doidão", 850, 100, 400);
        Zumbi zumbi3 = new Zumbi("Zumbi fortão", 1200, 600, 50);

        zumbi1.atacar(zumbi3);

        System.out.println("A vida do zumbi é de " + zumbi1.mostraVida());

        zumbi1.transfereVida(zumbi3, 200);

        System.out.println("A vida do zumbi1 agora é de " + zumbi1.mostraVida());
        System.out.println("A vida do zumbi3 agora é de " + zumbi3.mostraVida());
    

        //exercício 3
        Zumbi z1 = new Zumbi("Rogério", 250, 100, 50);
        Zumbi z2 = new Zumbi("Jeferson", 340, 234, 70);

        z1.vida = 239;
        z2.vida = 102;

        System.out.println("A vida de z1 é de " + z1.vida);
        System.out.println("A vida de z2 é de " + z2.vida);

        z1 = z2;

        System.out.println("A vida de z1 após igualar os objetos é de " + z1.vida);
        System.out.println("A vida de z2 após igualar os objetos é de " + z2.vida);

        z1.vida = 130;
        z2.vida = 230;

        System.out.println("A vida de z1 depois da alteração é de " + z1.vida); //vai sempre mostrar o mesmo valor, independente se eu só alterar z1 ou z2, já que estão apontando para o mesmo endereço
        System.out.println("A vida de z2 depois da alteração é de " + z2.vida);

        //exercício 4
        zumbi1.vida = 0;
        zumbi1.transfereVidacomVerificacao(zumbi3, 100);
        
    }
}
