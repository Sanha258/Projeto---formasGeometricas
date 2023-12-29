package formageometrica;

import java.text.DecimalFormat;

public class Retangulo extends FormasGeometricas{

	DecimalFormat formatador = new DecimalFormat("0.00");
	
	private double ladoA;
	private double ladoB;
	
	public Retangulo(String nome, double ladoA, double ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public Retangulo() {
		super();
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	@Override
	public double calcularArea() {
		return this.getLadoA() * this.getLadoB();
	}

	@Override
	public double calcularPerimetro() {
		return (2 * this.getLadoA()) + (2 * this.getLadoB());
	}
	
	@Override
	public String toString() {
		return "Nome da Figura: Retangulo" 
				+ "\nLado A: " + this.getLadoA()
				+ "\nLado B: " + this.getLadoB()
				+ "\nPerimetro: " + formatador.format(this.calcularPerimetro())
				+ "\nArea: " + formatador.format(this.calcularArea());
	}

}
