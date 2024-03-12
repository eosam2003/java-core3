package atividade04;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Custo de Frabricação do Automovel:");
	   float custoAutomovel = sc.nextFloat();
	   float distribuidoraPorcentagem = (custoAutomovel / 100) * 28;
	   float impostoPorcentagem = (custoAutomovel / 100) * 45;
	   float valorFiinalConsumidor = (distribuidoraPorcentagem + impostoPorcentagem) + custoAutomovel;
	System.out.println("O custo Final ao Consumidor é :" + valorFiinalConsumidor);

sc.close();
	}
}
