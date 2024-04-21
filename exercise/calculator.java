package exercise;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Qual operação deseja realizar?: ");
        System.out.println("1 - ADIÇÃO");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        System.out.println("Para sair digite qualquer numero");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite: ");
        int numero = scanner.nextInt();

        System.out.print("Digite um valor: ");
        int var1 = scanner.nextInt();
        System.out.print("Digite outro valor: ");
        int var2 = scanner.nextInt();

        scanner.close();

        if (numero == 1) {
            int res = var1 + var2;
            System.out.print("A soma dos numeros " + var1 + " + " + var2 + " = " + res);
        } else if (numero == 2) {
            int res = var1 - var2;
            System.out.print("A subtração dos numeros " + var1 + " - " + var2 + " = " + res);
        } else if (numero == 3) {
            int res = var1 * var2;
            System.out.print("A multiplicação dos numeros " + var1 + " * " + var2 + " = " + res);
        } else if (numero == 4) {
            int res = var1 / var2;
            System.out.print("A divisão dos numeros " + var1 + " / " + var2 + " = " + res);
        } else {
            System.out.print("Fim");
        }
    }
}