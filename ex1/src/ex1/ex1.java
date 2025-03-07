package ex1;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu nota: ");

        int nota = scanner.nextInt();
        
        scanner.close();
        
        if (nota < 1 || nota > 10) {
            System.out.println("Invalid");
        }   

        if (nota>=1 && nota<5) {
        	System.out.println("Respins");
        }
        
        if (nota>5 && nota<=10) {
        	System.out.println("Admis");
        }
        
        }

       
}