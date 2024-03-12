package atividade08;

import java.util.Scanner;

public class Atividade8 {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Tempo gasto percorrido pelo o carro:");
	   float tempoPercorrrido = sc.nextFloat();
	System.out.println();
	   float quilometros = tempoPercorrrido * 12;
	System.out.println("O automovel fez:" + quilometros + "Km");
	System.out.println();
	System.out.println("Em:"+tempoPercorrrido+"Horas");
	System.out.println();
	   float quantidadeDeLitrosGasto = quilometros / 12;
	System.out.println("A quantidade de Litros de combustivel gasto na viagem foi de:" + quantidadeDeLitrosGasto + "Litros");

sc.close();
	}
}
