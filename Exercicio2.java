package Familia36;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anos,meses,dias,total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("**************************************");
		System.out.println("*******C�LCULO DOS DIAS DE VIDA*******");
		System.out.println("**************************************");
		
		System.out.println("\nDigite quantos anos de vida voc� tem: ");
		anos=leia.nextInt();
		System.out.println("\nDigite quantos meses de vida voc� tem: ");
		meses=leia.nextInt();
		System.out.println("\nDigite quantos dias de vida voc� tem: ");
		dias=leia.nextInt();
		
		
		total=((anos*365)+(meses*30)+dias);
		
		System.out.println("Voc� tem "+total+" dias de vida");
		
	}

	

}
