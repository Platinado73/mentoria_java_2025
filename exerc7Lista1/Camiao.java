package exerc7Lista1;

/**
 *
 * @author PLATINADO
 */
public class Camiao extends Veiculo {

    private double capacidadeCargaTonelada;
    private int numeroEixo;

    public Camiao(double capacidadeCargaTonelada, int numeroEixo, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.capacidadeCargaTonelada = capacidadeCargaTonelada;
        this.numeroEixo = numeroEixo;
    }

    public double getCapacidadeCargaTonelada() {
        return capacidadeCargaTonelada;
    }

    public void setCapacidadeCargaTonelada(double capacidadeCargaTonelada) {
        this.capacidadeCargaTonelada = capacidadeCargaTonelada;
    }

    public int getNumeroEixo() {
        return numeroEixo;
    }

    public void setNumeroEixo(int numeroEixo) {
        this.numeroEixo = numeroEixo;
    }

    @Override
    public void descrever() {

        System.out.println(" DESCRICAO DO CARRO\n MARCA: " + super.getMarca() + " MATRICULA: " + super.getMatricula() + " MODELO: " + super.getModelo() + " Capacidade de Carga Por Toneladas: " + this.capacidadeCargaTonelada + " NUMERO DE EIXOS: " + this.numeroEixo);
    }
}
