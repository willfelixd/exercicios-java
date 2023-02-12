package com.br;

import java.util.Scanner;

// Escreva um programa Java que receba dois números como entrada e exiba o produto de dois números.
public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o primeiro numero");
		int primeiro = sc.nextInt();
		System.out.println("Insira o segundo numero");
		int segundo = sc.nextInt();

		int produto = primeiro * segundo;

		System.out.println(primeiro + " x " + segundo + " = " + produto);

		sc.close();
	}

}