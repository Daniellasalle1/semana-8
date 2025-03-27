package controle;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] array = new int[8];
        int cont = 0;
        
        for(int i = 0; i < 8; i++) {
        	System.out.println("escreva um numero: ");
        	array[i] = sc.nextInt();
        	
        	if(array[i] % 2 == 0) {
        		cont++;
        	}
        }
        
        System.out.println("a quantidade de n pares são: " + cont);

        
        
        
        
	}

}
