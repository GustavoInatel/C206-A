public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Chris");
        cliente1.setCpf(12312324);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Jaum");
        cliente2.setCpf(976567898);

        Cliente[] clientes = new Cliente[3]; //esse clientes não tem nada a ver com o array da classe conta
        clientes[0] = cliente1;
        clientes[1] = cliente2;

        //agora, cada posição do array aponta para a classe cliente. Com isso, para eu interligar o array da main com o array da conta, é só eu  apontar cada posição a um objeto
        //como as posições tem  endereços apontando para a classe cliente, é só eu usar o set do array
        Conta conta = new Conta();
        conta.setClientes(clientes);//isso é como se fosse conta.clientes[0] = cliente1;
        //aqui eu to setando meu array na conta, tanto que o metódo setClientes recebe um array do tipo Cliente

        System.out.println("Saldo atual: " + conta.getSaldo());
        conta.depositar(1000);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}

