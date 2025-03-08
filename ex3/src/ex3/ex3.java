package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Primul numar: ");
        var nr1 = scanner.nextInt(); 
        
        System.out.print("Al doilea numar: ");
        var nr2 = scanner.nextInt(); 
        
        scanner.close();
        
        if (nr1 % 2 == 0 && nr2 % 2 ==0)
        {
        	System.out.print("Media este " + (nr1+nr2)/2);
        }
        
        if (nr1 % 2 == 1 && nr2 % 2 == 1)
        {
        	System.out.print("Produsul este " + nr1*nr2);
        }
        
        if (nr1 % 2 == 0 && nr2 % 2 ==1 || nr1 % 2 == 1 && nr2 % 2 == 0) 
        {
        	System.out.print("Suma este " + (nr1+nr2));
        }
	
	}
	

}