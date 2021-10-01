package Familia36;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("****************************************************");
		System.out.println("*******CÁLCULO DOS ANOS, MESES E DIAS DE VIDA*******");
		System.out.println("****************************************************");
		
		int ano, meses, dias;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();

		ano = dias / 365;
		meses = (dias % 365) / 30;
		dias = (dias % 365) / 30;

		System.out.println("Você tem " + ano + " anos, " + meses + " meses e " + dias + " dias de vida.");

	}

}
