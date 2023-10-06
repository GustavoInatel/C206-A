public class Brownie
{
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) 
    {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhodeCompras(Brownie browniegostoso)
    {
        System.out.println("Adicionando " + nome + " ao carrinho de compras");
    }

    public void calculaValorTotal()
    {
        System.out.println("Calculando valor total da compra de um: "+ nome +": " + preco);
    }

    public void mostraInfo()
    {
        System.out.println("Nome do brownie: " + nome);
        System.out.println("Preço do brownie: " + preco);
        System.out.println("Sabor do brownie: " + sabor);
    }


}