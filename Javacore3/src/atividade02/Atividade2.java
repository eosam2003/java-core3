package atividade02;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite o numero total de Eleitores:");
	   float totalEleitores = sc.nextFloat();
	System.out.println("Digite o numero total de votos Brancos:");
	   float totalBrancos = sc.nextFloat();
	System.out.println("Digite o numero total de votos Nulos:");
	   float totalNulos = sc.nextFloat();
	System.out.println("Digite o numero total de votos Validos:");
	   float totalValidos = sc.nextFloat();
	   float porVotBrancos = totalBrancos / totalEleitores * 100;
	   float porVotNulos = totalNulos / totalEleitores * 100;
	   float porVotValidos = totalValidos / totalEleitores * 100;
	System.out.println("O valor da porcentagem de votos Brancos corresponde a:" + porVotBrancos+"%");
	System.out.println("O valor da porcentagem de votos Nulos corresponde a:" + porVotNulos+"%");
	System.out.println("O valor da porcentagem de votos Validos corresponde a:" + porVotValidos+"%");

sc.close();
	}
}
