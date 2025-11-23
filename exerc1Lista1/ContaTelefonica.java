package exerc1Lista1;

public class ContaTelefonica {

	private String numero;
	private String plano;
	private int limiteDadosMB;
	private int dadosConsumidoMB;
	private double valorMensalBase;
	private double valorPorMbExcedente;

	public ContaTelefonica(String numero, String plano, int limiteDadosMB, int dadosConsumidoMB, double valorMensalBase,
			double valorPorMbExcedente) {

		this.numero = numero;
		this.plano = plano;

		if(limiteDadosMB >0) {
			this.limiteDadosMB = limiteDadosMB;

		}

		this.dadosConsumidoMB = dadosConsumidoMB;
		this.valorMensalBase = valorMensalBase;
		this.valorPorMbExcedente = valorPorMbExcedente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public int getLimiteDadosMB() {
		return limiteDadosMB;
	}

	public void setLimiteDadosMB(int limiteDadosMB) {
		this.limiteDadosMB = limiteDadosMB;
	}

	public int getDadosConsumidoMB() {
		return dadosConsumidoMB;
	}

	public void setDadosConsumidoMB(int dadosConsumidoMB) {
		this.dadosConsumidoMB = dadosConsumidoMB;
	}

	public double getValorMensalBase() {
		return valorMensalBase;
	}

	public void setValorMensalBase(double valorMensalBase) {
		this.valorMensalBase = valorMensalBase;
	}

	public double getValorPorMbExcedente() {
		return valorPorMbExcedente;
	}

	public void setValorPorMbExcedente(double valorPorMbExcedente) {
		this.valorPorMbExcedente = valorPorMbExcedente;
	}



	public void registarConsumoDados(int mb) {


		this.dadosConsumidoMB = dadosConsumidoMB + mb ;
	}

	public int calcularExcedenteMB() {

		int excedente = this.dadosConsumidoMB;

		if( excedente > this.limiteDadosMB) {

			return excedente;


		}

		else return 0;


	}

	public double calcularValorApagar() {

		double total = this.valorMensalBase + this.valorPorMbExcedente * this.calcularExcedenteMB();

		return total;


	}











}

