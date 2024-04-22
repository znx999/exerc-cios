package exercise;

import java.util.Scanner;

public class whilee {
	public static void main(String [] args) {
	
	Scanner scanner = new Scanner(System.in);
		
	int soma = 0;
	
	int cont = 1;
	
	while (cont <= 5) {
		
		System.out.print("Media da " + cont + "º: ");
		float x = scanner.nextFloat();
		
		soma = (int) (soma + x);
		cont += 1;
		
	}
		
	float media = (soma / 5);
		
	System.out.print("Media final: " + media);	
		 
	
	scanner.close();
	
	}

}
