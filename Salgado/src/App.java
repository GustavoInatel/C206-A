public class App {
    public static void main(String[] args) throws Exception {
        
        Cantina cantina = new Cantina();
        cantina.nome =  "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        //criando os salgados
        salgado1.nome = "Coxinha de frango";
        salgado2.nome = "Pastel de pizza";
        salgado3.nome = "Enroladinho";

        //adicionando os salgados na cantina
        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        //mostrando o nome dos salgados contidos na cantina
        cantina.mostraInfo();

    }
}
