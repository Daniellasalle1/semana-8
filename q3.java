package controle;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[6];
        
        for(int i = 0; i < 6; i++) {
        	System.out.println("escreva um numero: ");
        	array[i] = sc.nextInt();
        }

        for(int i = 5; i != 0; i--) {
        	System.out.println("a ordem invertida é: " + array[i]);
        }
        
	}

}
