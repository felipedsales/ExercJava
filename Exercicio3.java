package Familia36;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seg,min,hrs;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>C�LCULO DE HRS, MINS E SEGS<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

		System.out.println("\nDigite a dura��o do evento em segundos: ");
		seg = leia.nextInt();
		
		hrs=seg/3600;
		min=(seg%3600)/60;
		seg=(seg%3600)%60;
		
		System.out.println("O tempo de dura��o do evento foi de "+hrs+" horas, " +min+ " minutos e "+seg+" segundos.");
		

	}

}
