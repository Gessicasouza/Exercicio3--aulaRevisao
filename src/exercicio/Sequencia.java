package exercicio;

import java.util.Scanner;

public class Sequencia {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero inicial");
		int inicio= entrada.nextInt();
		System.out.println("Digite o ultimo numero");
		int fim = entrada.nextInt();

		for (int i = inicio; i <= fim; i++) {
			if( i == fim) {
				System.out.println(i);
			}else {
				System.out.print(i + ",");
				
			}
		}
	}
}
