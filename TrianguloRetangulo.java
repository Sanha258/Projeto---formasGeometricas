package formageometrica;

import java.text.DecimalFormat;

public class TrianguloRetangulo extends Triangulo{

	DecimalFormat formatador = new DecimalFormat("0.00");
	
	private double base;
	private double altura;
	
	public TrianguloRetangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}
	
	public TrianguloRetangulo() {
		super();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.getBase() * this.getAltura()) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return this.getBase() + this.getAltura() + Math.hypot(getBase(), getAltura());
	}
	
	@Override
	public String toString() {
		return "Nome da Figura: Triangulo Retangulo" 
				+ "\nBase: " + this.getBase()
				+ "\nAltura: " + this.getAltura()
				+ "\nPerimetro: " + formatador.format(this.calcularPerimetro())
				+ "\nArea: " + formatador.format(this.calcularArea());
	}

}
