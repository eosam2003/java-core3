package atividade07;

import java.util.Scanner;

public class Atividade7 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o raio da lata de óleo (em centímetros): ");
	        double raio = sc.nextDouble();

	        System.out.print("Digite a altura da lata de óleo (em centímetros): ");
	        double altura = sc.nextDouble();

	        double volume = Math.PI * Math.pow(raio, 2) * altura;

	        System.out.println("O volume da lata de óleo é: " + volume + " centímetros cúbicos.");

	        sc.close();
	    }
}
