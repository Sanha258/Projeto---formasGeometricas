package formageometrica;

import java.text.DecimalFormat;

public class Losango extends FormasGeometricas{

	DecimalFormat formatador = new DecimalFormat("0.00");
	
	private double ladoA;
	private double ladoB;
	private double diagonalMaior;
	private double diagonalMenor;
	
	public Losango(String nome, double ladoA, double ladoB, double diagonalMaior, double diagonalMenor) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}

	public Losango() {
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

	public double getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	@Override
	public double calcularArea() {
		return (this.getDiagonalMaior() * this.getDiagonalMenor())/2;
	}

	@Override
	public double calcularPerimetro() {
		return (2 * this.getLadoA()) + (2 * this.getLadoB());
	}
	
	@Override
	public String toString() {
		return "Nome da Figura: Losango" 
				+ "\nDiagonal Maior: " + this.getDiagonalMaior()
				+ "\nDiagonal Menor: " + this.getDiagonalMenor()
				+ "\nLado A: " + this.getLadoA()
				+ "\nLado B: " + this.getLadoB()
				+ "\nPerimetro: " + formatador.format(this.calcularPerimetro())
				+ "\nArea: " + formatador.format(this.calcularArea());
	}

}
