package controle;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] array = new int[10];
        
        for(int i = 0; i < 10; i++) {
        	System.out.println("escreva um numero: ");
        	array[i] = sc.nextInt();
        }
        
        System.out.println("digite um numero para ser buscado: ");
        int num = sc.nextInt();
        int achou =0;
        for(int i = 0; i < 10; i++) {
        	if(array[i] == num) {
        		achou = 1; 
        		break;
        	}
        	
        	
        }

        if(achou == 1) {
            System.out.println("o numero foi encontrado!!!");

        }
        else {
            System.out.println("não achou um numero!!!");

        }
        
	}

}
