package formageometrica;

import java.util.Random;

public class ProgramaFormasGeometricas {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		FormasGeometricas[] formas = new FormasGeometricas[7];
		
		for(int i = 0; i < formas.length; i++) {
			int tipo = gerador.nextInt(7);
			switch(tipo) {
				case 0: {
					FormasGeometricas quadrado = new Quadrado("Quadrado", (gerador.nextInt(9)+1));
					formas[i] = quadrado;
					break;
				}
				case 1: {
					FormasGeometricas circulo = new Circulo("Circulo", (gerador.nextInt(9)+1));
					formas[i] = circulo;
					break;
				}
				case 2: {
					FormasGeometricas retangulo = new Retangulo("Retangulo", (gerador.nextInt(9)+1), (gerador.nextInt(9)+1));
					formas[i] = retangulo;
					break;
				}
				case 3: {
					FormasGeometricas losango = new Losango("Losango", (gerador.nextInt(9)+1), 
							(gerador.nextInt(9)+1), (gerador.nextInt(9)+1), (gerador.nextInt(9)+1));
					formas[i] = losango;
					break;
				}
				case 4: {
					FormasGeometricas trianguloRetangulo = new TrianguloRetangulo("Triangulo Retangulo", 
							(gerador.nextInt(9)+1), (gerador.nextInt(9)+1));
					formas[i] = trianguloRetangulo;
					break;
				}
				case 5: {
					FormasGeometricas trianguloEquilatero = 
							new TrianguloEquilatero("Triangulo Equilatero", (gerador.nextInt(9)+1));
					formas[i] = trianguloEquilatero;
					break;
				}
				case 6: {
					FormasGeometricas trianguloIsosceles = new TrianguloIsosceles("Triangulo Isosceles", 
							(gerador.nextInt(9)+1), (gerador.nextInt(9)+1));
					formas[i] = trianguloIsosceles;
					break;
				}
				default: {
					System.out.println("Problemas na criação do Objeto!");
				}
			}
		}
		
		for(int i = 0; i < formas.length; i++) {
			System.out.println(formas[i]);
			System.out.println("------------------------");
		}

	}

}
