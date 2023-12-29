package formageometrica;

import java.text.DecimalFormat;

public class Quadrado extends FormasGeometricas{
	
	DecimalFormat formatador = new DecimalFormat("0.00");
	
	private double lado;
	
	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}

	public Quadrado() {
		super();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return Math.pow(this.getLado(), 2);
	}
	
	@Override
	public double calcularPerimetro() {
		return this.getLado() * 4;
	}

	@Override
	public String toString() {
		return "Nome da Figura: Quadrado" 
				+ "\nLado: " + this.getLado()
				+ "\nPerimetro: " + formatador.format(this.calcularPerimetro())
				+ "\nArea: " + formatador.format(this.calcularArea());
	}

}
