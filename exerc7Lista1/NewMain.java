package exerc7Lista1;

import java.util.*;

/**
 *
 * @author PLATINADO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro car = new Carro(4,5, "LD-10-20-AA", "TOYOTA", "COROLA");
        Camiao iveco = new Camiao(18.3, 3,"LD-30-40-BB", "MERCEDES", "ACTROS");
        
        ArrayList<Veiculo> List = new ArrayList<>(); 
        
        List.add(car);
        List.add(iveco);
        
        for(Veiculo v : List){
            
            v.descrever();
        }
        
    
    }
    
}
