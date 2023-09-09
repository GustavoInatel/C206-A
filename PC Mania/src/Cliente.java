public class Cliente {
    String nome;
    long cpf;
    Computador[] computador = new Computador[5];

    public float calculaTotalCompra() {
        float precodopc = 0;
        for (Computador computador2 : computador) {
            if (computador2 != null) {
                precodopc += computador2.preco;
            }
        }

        return precodopc;
    }
}
