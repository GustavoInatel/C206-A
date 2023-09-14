public class Conta {
    
    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] clientes;

    public Conta()
    {
        clientes = new Cliente[3];
    }

    public void sacar(float quantia)
    {
        if(this.saldo > quantia)
        {
            this.saldo -= quantia;
            System.out.println("Você sacou uma quantia de R$" + quantia);
        }

        else
        {
            System.out.println("Você não possui saldo suficiente para sacar");
        }
    }

    public void depositar(float quantia)
    {
        this.saldo += quantia;
        System.out.println("Foi depositado umaa quantia de R$" + quantia + " na sua conta");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

   
    
}
