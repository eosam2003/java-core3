package atividade01;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] Args) {
		   Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos anos completo voce possui:");
		   int ano = sc.nextInt();
		System.out.println("Digite a quantidade de meses completos vividos:");
		   int meses = sc.nextInt();
		System.out.println("Digite a quantidade de dias passados do seu ultimo mêsversario:");
		   int dias = sc.nextInt();
		   int diasVividos = ano * 365 + meses * 30 + dias;
		System.out.println("A quantidade de dias vividos corresponde a:" + diasVividos);

	sc.close();
		}
}
