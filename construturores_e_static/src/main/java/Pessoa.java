public class Pessoa {
    private String nome;
    private int idade;

    //construtor
    public Pessoa(String nome, int idade)
    {
        System.out.println("Criando uma instância!"); //a palavra new incova o construtor

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getIdade()
    {
        return this.idade;
    }
  
    public Pessoa()
    {
        //isso aqui é uma sobrecarga de métodos. Perceba que tem outro metodo com o mesmo nome, então para não dar erro, você precisa botar parâmetros diferentes
    }
}
