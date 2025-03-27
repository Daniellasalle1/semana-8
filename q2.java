package controle;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	
        double[] notas = new double[4];
        double media = 0;
        double soma = 0;

        for(int i = 0; i < 4; i++) {
        	System.out.println("escreva a nota: ");
        	notas[i] = sc.nextDouble();
        	soma += notas[i];
        }
        
        media = soma / 4;
        
        System.out.println("a media é: " + media);
        
	}
}
