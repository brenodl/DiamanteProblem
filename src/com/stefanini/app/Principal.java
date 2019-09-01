package com.stefanini.app;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String a[] = new String[5];
		
		List<String> alfabeto = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "z");
	
		
		String letra = in.next();
		for(int i =0; i<alfabeto.size(); i++) {
			if(alfabeto.get(i).equals(letra)) {
				
				
				a[0] = alfabeto.get(i-2);
				a[4] = alfabeto.get(i-2);
				a[1] = alfabeto.get(i-1);
				a[3] = alfabeto.get(i-1);
				a[2] = alfabeto.get(i);
				
			}
		}
		for(int y = 0; y<a.length;y++) {
			
			System.out.print(a[y] +" ");
			
		}		
		
		
	}
}
