import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       /*  Exercício 1
        Random random = new Random();

        List<Double> number = new ArrayList<>();

        for (int i = 0; i < 10; i++) 
        {
            double num = random.nextDouble(100);
            number.add(num);
        }

        Collections.sort(number);
        Collections.reverse(number); //ordena arraylist

        for (Double doble : number) 
        {
            System.out.println(doble);    
        } */

        List<Cachorro> dog = new ArrayList<>();

        Salsicha salsicha = new Salsicha("Gota", 2);
        Poodle poodle = new Poodle("Rex", 6);
        PastorAlemao pastorAlemao = new PastorAlemao("Vitor", 4);

        dog.add(salsicha);
        dog.add(poodle);
        dog.add(pastorAlemao);

        for (Cachorro ca : dog) 
        {
            System.out.println(ca.nome);    
        }

        Collections.sort(dog);

        for (Cachorro ca : dog) 
        {
            System.out.println(ca.nome);    
        }
        
    }
}
