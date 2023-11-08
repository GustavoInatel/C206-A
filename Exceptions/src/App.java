public class App {
    public static void main(String[] args) throws Exception {
    

        //instancia da conta
        Conta conta = new Conta(1000, 3000);

        //criando 3 objetos de cliente
        Cliente cliente1 = new Cliente("Gustavo", 12345679);
        Cliente cliente2 = new Cliente("Chris", 182323819);
        Cliente cliente3 = null;

        //adicionando cliente à conta
        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        //mostrando informações da conta
        conta.mostraInfo();

    }
}
