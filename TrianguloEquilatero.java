package formageometrica;

import java.text.DecimalFormat;

public class TrianguloEquilatero extends Triangulo{

	DecimalFormat formatador = new DecimalFormat("0.00");
	
	private double lado;
	
	public TrianguloEquilatero(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}
	
	public TrianguloEquilatero() {
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
		return (Math.pow(this.getLado(), 2) / 4) * Math.sqrt(3);
	}

	@Override
	public double calcularPerimetro() {
		return 3 * this.getLado();
	}
	
	@Override
	public String toString() {
		return "Nome da Figura: Triangulo Equilatero" 
				+ "\nLado: " + this.getLado()
				+ "\nPerimetro: " + formatador.format(this.calcularPerimetro())
				+ "\nArea: " + formatador.format(this.calcularArea());
	}

}
