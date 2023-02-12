package com.br;

import java.util.Scanner;

// Escreva um programa Java para imprimir a soma (adição), multiplicação, subtração, divisão e resto de dois números.
public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o primeiro numero: ");
		int primeiro = sc.nextInt();

		System.out.print("Insira o segundo numero: ");
		int segundo = sc.nextInt();
		System.out.println();

		int produto = primeiro + segundo;
		System.out.println(primeiro + " + " + segundo + " = " + produto);

		produto = primeiro - segundo;
		System.out.println(primeiro + " - " + segundo + " = " + produto);

		produto = primeiro * segundo;
		System.out.println(primeiro + " x " + segundo + " = " + produto);

		produto = primeiro / segundo;
		System.out.println(primeiro + " / " + segundo + " = " + produto);

		produto = primeiro % segundo;
		System.out.println(primeiro + " mod " + segundo + " = " + produto);

		sc.close();
	}

}