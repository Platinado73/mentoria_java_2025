package Lista1Exerc2;
/**
 *
 * @author PLATINADO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SensorTemperatura sensor = new SensorTemperatura("SALA-01", "LABORATÓRIO DE REDES");
        
        double[] leituras = {22.5, 23, 21.8, 23.5 };
        
        for ( double lido: leituras){
            
            sensor.registarLeitura(lido);
        }
        
        System.out.println("\tDADOS OBTIDOS");
        System.out.println("\nTemperatura Mínima: " + sensor.getLeituraMinima());
        System.out.println("\nTemperatura Mínima: " + sensor.getLeituraMaxima());
        System.out.println("\n\tMEDIA APROXIMADA DAS LEITURAS: " + sensor.obterMedia());
        System.out.println("\nLOcal: " + sensor.getLocal());
        System.out.println("\nIDENTIFICADOR: " + sensor.getIdentificador());
        
        
        
    }
    
}






































