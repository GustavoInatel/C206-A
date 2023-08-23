public class App {
    public static void main(String[] args) throws Exception {
        
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.piloto = piloto1; //agregação
        kart2.piloto = piloto2; //agregação

        Motor motor1 = new Motor();
        Motor motor2 = new Motor(); 

        kart1.piloto.nome = "Francisco";
        kart1.piloto.vilao = false;

        kart2.piloto.nome = "Roberto";
        kart2.piloto.vilao = true;

        kart1.motor.cilindradas = "50";
        kart1.motor.velocidademaxima = 100;

        kart2.motor.cilindradas = "100";
        kart2.motor.velocidademaxima = 150;

        kart1.piloto.soltaSuperPoder();
        kart2.piloto.soltaSuperPoder();

        kart1.pular();
        kart1.soltarTurbo();
        kart1.fazerDrift();
        kart2.pular();
        kart2.soltarTurbo();
        kart2.fazerDrift();

        System.out.println("Mostrando informações do motor do kart 1: ");
        kart1.motor.mostraInfo();
        System.out.println("Mostrando informações do motor do kart 2: ");
        kart2.motor.mostraInfo();


        
    }
}
