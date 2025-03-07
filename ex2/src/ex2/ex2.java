package ex2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un numar: ");

        var nr = scanner.nextInt();
        
        scanner.close();
        
        	switch (nr) {
        	
        	case 1:
        	System.out.println("unu");
        	break;
        	case 2:
        	System.out.println("doi");
        	break;
        	case 3:
        	System.out.println("trei");
        	break;
        	case 4:
        	System.out.println("patru");
        	break;
        	case 5:
        	System.out.println("cinci");
        	break;
        	default:
        		System.out.println("Invalid");
        
        }
        
        }

       
}