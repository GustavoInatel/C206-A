import java.util.HashSet;
import java.util.Set;

public class Conta {
    private double saldo;
    private double limite;
    private Set<Cliente> clientes = new HashSet<>();

    // construtor
    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    // adicionando cliente por meio do hashset(não precisa mais usar o for para
    // preencher o array)
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void sacar(double quantia) throws SaldoInsuficienteException {
        if (this.saldo >= quantia) {
            this.saldo -= quantia;
        }

        else {
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
    }

    // mostra as informações da conta
    public void mostraInfo() {
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Limite da conta: " + limite);

        for (Cliente cliente : clientes) {

            try {
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("CPF do cliente: " + cliente.getCpf());
            }

            catch (NullPointerException e) {
                System.out.println("Existe um valor nulo no array na posição ");
            }

        }
    }

    public double getSaldo() {
        return saldo;
    }

}
