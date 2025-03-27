package controle;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[5];
        double maior = 0;
        double menor = 0;
        
        for(int i = 0;i < 5; i++) {
        	System.out.println("escreva um numero: ");
        	numeros[i] = sc.nextDouble();
        	
        	if(numeros[i] > maior) {
        		maior = numeros[i];
        	}else if(numeros[i] < menor || menor == 0) {
        		menor = numeros[i];
        	}
        }
        
        System.out.println("o maior é: " + maior);
        System.out.println("o menor é: " + menor);
		
		
		
		
	}
}
