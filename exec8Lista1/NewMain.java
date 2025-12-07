package exec8Lista1;

import java.util.ArrayList;

/**
 *
 * @author PLATINADO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Professor prof = new Professor("Engenharia Informática",12,"Carlos Alberto","BI1234567", 300000.0);
        CoordenadorCurso corde = new CoordenadorCurso("Engenharia Informática",50000.0,"Helena Sousa" ,"BI7654321",350000.0 );
        
        ArrayList<Funcionario> List = new ArrayList<>();
        
        List.add(corde);
        List.add(prof);
        
        for(Funcionario l : List){
            
            System.out.println(l);
            System.out.print(" seu salario é :");
            System.out.println(l.calcularSalarioMensal() + "KZS");            
            System.out.println();
            
        }
        
        
        
    }
    
}
