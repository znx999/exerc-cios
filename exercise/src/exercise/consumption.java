package exercise;

import java.util.Scanner;

public class consumption {
	public static void main(String [] args) {
		
		// Recebe o tipo de Instalção
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual tipo de instalação? (R), (I) ou (T): ");
		String insta = scanner.nextLine();		
		
		// Verificar a quantidade de kWh
		System.out.print("Quantos kWh: ");
		int kwh = scanner.nextInt();
		
		double preco;
		
		// Verificar qual instação o usuário solicitou e retorna com o valor a ser pago
		if (insta.equals("R")) {
            if (kwh >= 500) {
                preco = 0.65;
            } else {
                preco = 0.4;
            }
            
            System.out.println("O valor: " + (kwh * preco));				
            
		} else if (insta.equals("I")) {
			if (kwh >= 1000) {
				preco = 0.55;
			} else {
				preco = 0.6;
			}
			
			System.out.println("O valor: " + (kwh * preco));
			
		} else if (insta.equals("T")) {
			if (kwh >= 5000) {
				preco = 0.55;
			} else {
				preco = 0.6;
			}
			
			System.out.println("O valor: " + (kwh * preco));			
		} else {
			System.out.println("Tipo de instalação inválida. ");
		}
		
		scanner.close();
		
	}

}
