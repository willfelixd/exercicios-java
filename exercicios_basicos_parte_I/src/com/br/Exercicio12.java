package com.br;

import java.util.Scanner;

// Escreva um programa Java que receba três números como entrada para calcular e imprimir a média dos números.
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int primeiro = sc.nextInt();
		int segundo = sc.nextInt();
		int terceiro = sc.nextInt();

		double media = ((double) primeiro + segundo + terceiro) / 3.0;

		System.out.println(String.format("%.1f", media));

		sc.close();
	}

}