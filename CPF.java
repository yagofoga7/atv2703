package atv2703;

import java.util.Scanner;

public class CPF {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String cpf, senha, senha1, cpf1;
		double sac, sa1, sal1;
		
		senha1 = "senha";
		cpf1 = "587.843.588-27";
		sal1 = 15000;
		
        System.out.println("Digite o seu CPF");
        cpf = ler.nextLine();
            
        if (cpf.equals(cpf1)) {
        System.out.println("Digite sua senha");
        senha = ler.nextLine();
           
        if (senha.equals(senha1)) {
            System.out.println("Seu saldo R$ " + sal1);
			System.out.println("Insira o valor para o saque");
			sac = ler.nextDouble();
			
			if (sac <= sal1) {
			sa1 = sal1 - sac;
			System.out.println("Seu saldo atual é de:" + sa1 + " reais.");
			}else {
				System.out.println("Saldo insuficiente");
			}
        }else {
				System.out.println("Senha incorreta");
			}
			}else {
				System.out.println("Cpf invalido");	
			}
        ler.close();
	}
}