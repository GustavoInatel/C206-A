public class Kart{

    String nome;
    Piloto piloto; //associação
    Motor motor; //associação

    public Kart()
    {
        motor = new Motor(); //composição
    }

    public void pular()
    {
        System.out.println("O kart está pulando!");
    }

    public void soltarTurbo()
    {
        System.out.println("O kart está soltando turbo!");
    }

    public void fazerDrift()
    {
        System.out.println("O kart está fazendo drift!");
    }

}