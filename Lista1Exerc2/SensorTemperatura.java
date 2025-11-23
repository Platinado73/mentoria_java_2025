package Lista1Exerc2;

/**
 *
 * @author PLATINADO
 */
public class SensorTemperatura {
    
    private String identificador;
    private String local;
    private double leituraMinima;
    private double leituraMaxima;
    private double somaLeitura;
    private int quantidadeLeitura;

    public SensorTemperatura(String identificador, String local) {
        this.identificador = identificador;
        this.local = local;
        this.leituraMinima = Double.MIN_VALUE;
        this.leituraMaxima = Double.MAX_VALUE;
        this.somaLeitura = 0;
        this.quantidadeLeitura = 0;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getLocal() {
        return local;
    }

    public double getLeituraMinima() {
        return leituraMinima;
    }

    public double getLeituraMaxima() {
        return leituraMaxima;
    }

    public double getSomaLeitura() {
        return somaLeitura;
    }

    public int getQuantidadeLeitura() {
        return quantidadeLeitura;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public void registarLeitura(double valor ){
    
    if( valor> this.leituraMaxima ){
        
        this.leituraMaxima = valor;
    }
     if( valor < this.leituraMinima ){
        
        this.leituraMinima = valor;
    }
     
    this.somaLeitura= somaLeitura + valor;
    this.quantidadeLeitura++;
        
        
    }
    
    public double obterIntervalo(){
        
        if(quantidadeLeitura == 0){
            
            return 0;
        }
        return this.leituraMaxima - this.leituraMinima;
    }
    
    public double obterMedia(){
        
        if(quantidadeLeitura == 0){
            
            return 0;
        }
        return somaLeitura / quantidadeLeitura;
    }
    
    
    
    
    
    
    
    
}
