package atv2703;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;
		
            System.out.println("Digite o seu numero");
            n = ler.nextInt();
            
		if (n % 2 == 1 ) {
			System.out.println("O numero é impar");

		}else {
			System.out.println("O numero é par");
		}
		ler.close();
	}

}
