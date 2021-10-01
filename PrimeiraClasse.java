package Familia36;

import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\nDigite a primeira nota: ");
		n1=leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		n2=leia.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		n3=leia.nextFloat();
		
		media=(n1+n2+n3)/3;
		
		System.out.printf("\nSua média foi de: %2.2f",media);
				
		
		
	}

}
