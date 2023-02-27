package com.ExerciciosIcUff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {

		// Faça um programa que leia uma frase e informe o número de palavras não
		// repetidas da frase. Utilize Set para fazer a verificação
		
		
		String mensagem = "Vamos verificar se há palavras não repetidas ? Vamos verificar se há palavras o que ?";
		List<String> palavras = Arrays.asList(mensagem.split("\s+"));
		
		Set<String> palavras2 = new HashSet<>();
		int contador = 0;
		for(String varAuxiliar : palavras) {
			boolean encontrou = palavras2.add(varAuxiliar);
			if(!encontrou) {
				contador++;
				
			}
		}
	
		System.out.println("Lista inicial: " + palavras);
		System.out.println("Lista utilizando Set : " + palavras2);
		System.out.println("Quantidade de palavras não repetidas: " + (palavras.size() - contador*2));
	}

}
