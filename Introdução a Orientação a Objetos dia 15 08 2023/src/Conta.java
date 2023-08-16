public class Conta {
    
    int numero;
    String nomeTitular;
    float saldo;
    float limite;

    void depositar(float quantia)
    {
        saldo -= quantia;

    }

    void sacar(float quantia)
    {
        saldo += quantia;
    }



}
