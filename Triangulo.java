package formageometrica;

public abstract class Triangulo extends FormasGeometricas{
	
	public Triangulo(String nome) {
		super(nome);
	}

	public Triangulo() {
		super();
	}

	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();

}
