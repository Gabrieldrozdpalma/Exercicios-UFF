package com.ExerciciosIcUff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercicioMap {
	
	public static void main(String[] args) {
		
		//Faça um programa que leia uma frase e informe o número de ocorrências de cada palavra da frase
		
		String mensagem = "Um elefante ,  dois elefantes , tres elefantes e tres tigres";
		List<String> palavras = Arrays.asList(mensagem.split("\s+"));
		
		Map<String,Integer> contagemPalavras = new HashMap<>();
		
		for(String palavra : palavras) {
			if(contagemPalavras.containsKey(palavra))
				contagemPalavras.put(palavra, (contagemPalavras.get(palavra)+1));
			else {
				contagemPalavras.put(palavra, 1);
			}
		}
		
		System.out.println(contagemPalavras);
		
	}

}
