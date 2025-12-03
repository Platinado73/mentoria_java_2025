package exerTryCatchFixacao;

import java.util.*;

/**
 *
 * @author PLATINADO
 */
public class NewMain {

    private static Object sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    try{
        
     
        
        
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
        } 
    catch (ArrayIndexOutOfBoundsException e){
        
        System.out.println("posicao invalida");
    }
    
    catch (InputMismatchException e){
        
        System.out.println("input error");
    }
    
        System.out.println("fim do programa");
       
        sc.close();
      
        
    }
    
}
