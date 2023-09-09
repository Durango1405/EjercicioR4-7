package Actividad2;

import java.util.Scanner;

public class Cap4_7 {
	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese numero a:");
		a = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese numero b:");
		b = entrada1.nextInt();
		
		if(a>b){
			System.out.println("a es mayor que b");
		}
		
		else if(a==b){
			System.out.println("a es igual b");
		}
		
		
		else {
			System.out.println("a es menor que b");
		}
		entrada.close();
		entrada1.close();
	}
}
