public class App {
    public static void main(String[] args) throws Exception {

        Conta conta = new Conta(1000, 2000);

        Cliente cliente = new Cliente("Gustavo", 213129321);

        System.out.println("Saldo do cliente antes do saque: " + conta.getSaldo());

        try {
            conta.sacar(200);
        }

        catch (SaldoInsuficienteException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo depois do saque: " + conta.getSaldo());

        System.out.println("Vou tentar sacar 2000 reais, vai que dá '_' ");

        try {
            conta.sacar(2000);
        }

        catch (SaldoInsuficienteException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
