package atividade07;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a Temperatura em graus Celsius:");
		   float grausCelsius=sc.nextFloat();
		   float grausFahrenheit=(9*grausCelsius+160)/5;
		System.out.println("O valor da temperatura convertida é:"+grausFahrenheit+ "F");
	sc.close();
	}
}
