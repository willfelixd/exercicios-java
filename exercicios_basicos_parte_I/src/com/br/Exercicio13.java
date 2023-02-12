package com.br;

// Escreva um programa Java para imprimir a área e o perímetro de um retângulo.
public class Exercicio13 {

	public static void main(String[] args) {
		double largura = 5.5;
		double altura = 8.5;
		double area = largura * altura;
		double perimetro = 2.0 * (largura + altura);

		System.out.println("Area e 5,5 * 8,5 = " + area);
		System.out.println("Perimetro e 2 * (5,5 + 8,5) = " + perimetro);
	}

}