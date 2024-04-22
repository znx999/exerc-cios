package exercise;

import java.util.Scanner;

public class triangulo {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor 1: ");
		int t1 = scanner.nextInt();
		
		
		System.out.print("Digite o valor 2: ");
		int t2 = scanner.nextInt();
		
		
		System.out.print("Digite o valor 3: ");
		int t3 = scanner.nextInt();
		
		if (t1 > 0 && t2 > 0 && t3 > 0 && (t1 + t2 > t3 && t1 + t3 > t2 && t2 + t3 > t1) ) {
			if (t1 != t2 && t1 != t3 && t2 != t3) {
			System.out.print("É um triangulo escaleno! ");
			} else if (t1 == t2 && t1 == t3 && t2 == t3) {
				System.out.print("É um triangulo equilatero! ");
			} else {
				System.out.print("É um triangulo isosceles");
			}
		} else {
			System.out.print("Ao menos um dos valores indicados não servem para formar um triangulo!");
		}
		
		scanner.close();
	}

}
