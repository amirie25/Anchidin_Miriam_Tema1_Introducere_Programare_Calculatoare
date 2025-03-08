package ex4;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Primul numar: ");
        var nr1 = scanner.nextInt(); 
        
        System.out.print("Al doilea numar: ");
        var nr2 = scanner.nextInt(); 
        
        System.out.print("Al treilea numar: ");
        var nr3 = scanner.nextInt(); 
        
        scanner.close();
        
        if (nr1<nr2 && nr1<nr3)
        {
        	System.out.print(nr1);
        }
        
        if (nr2<nr1 && nr2<nr3)
        {
        	System.out.print(nr2);
        }
        
       if (nr3<nr1 && nr3<nr2)
        {
        	System.out.print(nr3);	
        }
	}
	

}