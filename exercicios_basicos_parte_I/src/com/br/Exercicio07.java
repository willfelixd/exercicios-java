package com.br;

import java.util.Scanner;

// Escreva um programa Java que receba um número como entrada e imprima sua tabela de multiplicação até 10.
public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um numero: ");
		int numero = sc.nextInt();

		for (int w = 1; w <= 10; w++) {
			int produto = numero * w;
			System.out.println(numero + " x " + w + " = " + produto);
		}

		sc.close();
	}

}