package com.ExerciciosIcUff;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
	public static void main(String[] args) {

		// Fazer um programa que escreve uma frase invertida utilizando listas
		
		// #1 Invertendo palavras inteiras:

		String mensagem = "O que deu errado no codigo?";
		List<String> palavras = Arrays.asList(mensagem.split("\s+"));
		Collections.reverse(palavras);
		StringBuilder builder = new StringBuilder(mensagem.length());
		for (String palavra : palavras) {
			builder.append(palavra);
			builder.append(" ");
		}
		System.out.println(builder.toString());
		
		// #2 Invertendo todas as letras:
		
		String mensagem2 = "O que deu errado no codigo?";
		List<String> palavras2 = Arrays.asList(mensagem2.split(""));
		Collections.reverse(palavras2);
		StringBuilder builder2 = new StringBuilder(mensagem2.length());
		for (String palavra2 : palavras2) {
			builder2.append(palavra2);
		}
		
		System.out.println(builder2.toString());
		
		

	}

}
