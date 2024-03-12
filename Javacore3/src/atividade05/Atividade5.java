package atividade05;

import java.util.Scanner;

public class Atividade5 {
		public static void main(String[] Args) {
			Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Fahrenheit:");
		   float celsius = sc.nextFloat();
		   float fahrenheit = (9 * celsius + 160) / 5;
		System.out.println("A temperatura em Celsius convertida em Fahrenheit é:" + fahrenheit);
	sc.close();
		}
}
