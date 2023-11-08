import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> arraylist = new ArrayList<Integer>();
        Set<Integer> hashset = new HashSet<Integer>();
        Map<Integer, Integer> hashmap = new HashMap<>();

        int valor = 100000;
        long tempoinicial;
        long tempofinal;

        tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < valor; i++) 
        {
            arraylist.add(i);    
        }
        tempofinal = System.currentTimeMillis();

        System.out.println("Tempo total gasto para inserir no Array list: " + (tempofinal - tempoinicial));

        tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < valor; i++) 
        {
            hashset.add(i);   
        }
        tempofinal = System.currentTimeMillis();

        System.out.println("Tempo total gasto para inserir no HashSet: " + (tempofinal - tempoinicial));

        tempoinicial = System.currentTimeMillis();
        for (int j = 0; j < valor; j++) 
        {
            hashmap.put(j, j);
        }
        tempofinal = System.currentTimeMillis();

        System.out.println("Tempo total gasto para inserir no HashMap: " + (tempofinal - tempoinicial));




        tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < valor; i++) 
        {
            arraylist.contains(i);    
        }
        tempofinal = System.currentTimeMillis();

        System.out.println("Tempo total gasto para buscar no Array list: " + (tempofinal - tempoinicial));

        tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < valor; i++) 
        {
            hashset.contains(i);   
        }
        tempofinal = System.currentTimeMillis();

        System.out.println("Tempo total gasto para buscar no HashSet: " + (tempofinal - tempoinicial));

        tempoinicial = System.currentTimeMillis();
        for (int j = 0; j < valor; j++) 
        {
            hashmap.containsKey(j);
        }
        tempofinal = System.currentTimeMillis();

        System.out.println("Tempo total gasto para buscar no HashMap: " + (tempofinal - tempoinicial));
    }
}
