package atv2703;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double t1, t2, t3;
		
            System.out.println("Qual o tamanho do primeiro lado");
            t1 = ler.nextDouble();
            
            System.out.println("Qual o tamanho do segundo lado");
            t2 = ler.nextDouble();
            
            System.out.println("Qual o tamanho do segundo lado");
            t3 = ler.nextDouble();
            
		if (t1 == t2 && t2 == t3) {
			System.out.println("Seu triangulo é equilatero");
		}else if (t1 == t2 || t1 == t3 || t2 == t3) {
			System.out.println("O triangulo é isoceles");
		}else {
			System.out.println("O triangulo é escaleno");
		}
		
		ler.close();

	}

}
