package com.br;

import java.util.Scanner;

// Escreva um programa Java para dividir dois números e imprima na tela.
public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int primeiroNumero = sc.nextInt();
		int segundoNumero = sc.nextInt();
		int produto = primeiroNumero / segundoNumero;

		System.out.println(produto);
		
		sc.close();
	}
}