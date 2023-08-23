public class Main {
    public static void main(String[] args) throws Exception {
        
        Personagem personagem = new Personagem();
        Arma arma = new Arma();

        personagem.arma = arma; //tendo acesso à classe Arma

        personagem.nome = "Gustavo";
        personagem.pontos = 100;

        personagem.arma.nome = "Bazuca";
        personagem.arma.poder = 200;
        personagem.arma.resistencia = 70;
        personagem.arma.descricao = "Arma de fogo que dispara míssel";

        personagem.usarArma();
        personagem.tomarDano();
        personagem.arma.mostraInfoArma();

    }
}
