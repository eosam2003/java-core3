package atividade06;

import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Graus em Fahrenheit:");
	   float Fahrenhait = sc.nextFloat();
	   float converFahrenheit = (Fahrenhait - 32) * 5 / 9;
	System.out.println("A converção do Fahrenheit para Celsius é:" + converFahrenheit);
sc.close();
	}
}
