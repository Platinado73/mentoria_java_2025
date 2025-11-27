package exerc7Lista1;

/**
 *
 * @author PLATINADO
 */
public class Carro extends Veiculo {

    private int numeroPortas;
    private int capacidadePassageiros;

    public Carro(int numeroPortas, int capacidadePassageiros, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPortas = numeroPortas;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public void descrever() {

        System.out.println(" DESCRICAO DO CARRO\n MARCA: " + super.getMarca() + " MATRICULA: " + super.getMatricula() + " MODELO: " + super.getModelo() + " Numeros portas: " + this.numeroPortas + " CAPACIDADE DE PASSAGEIROS: " + this.capacidadePassageiros);
    }

}
