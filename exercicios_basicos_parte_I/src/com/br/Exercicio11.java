package com.br;

// Escreva um programa Java para imprimir a área e o perímetro de um círculo.
public class Exercicio11 {

	public static void main(String[] args) {
		double raio = 7.5;
		double perimetro = 2.0 * 3.14159265358979323846 * raio;
		double area = 3.14159265358979323846 * Math.pow(raio, 2.0);

		System.out.println("O perimetro é = " + perimetro);
		System.out.println("A area é = " + area);
	}

}