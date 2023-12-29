package formageometrica;

import java.text.DecimalFormat;

public class Circulo extends FormasGeometricas{
	
	DecimalFormat formatador = new DecimalFormat("0.00");
	
	private double raio;
	
	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.getRaio(), 2);
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.getRaio();
	}
	
	@Override
	public String toString() {
		return "Nome da Figura: Circulo" 
				+ "\nRaio: " + this.getRaio()
				+ "\nPerimetro: " + formatador.format(this.calcularPerimetro())
				+ "\nArea: " + formatador.format(this.calcularArea());
	}
	
}
