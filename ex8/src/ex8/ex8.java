package ex8;

	import java.util.Scanner;

	public class ex8 {

	    public static void main(String[] args) {

	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Introdu numarul: ");

	        int nr = scanner.nextInt();
	        
	        scanner.close();
	        
	        int fact = 1;
	        int contor = 1;
	        
	        while (contor <= nr)
	        {
	        fact = fact * contor;
	        contor ++;
	        }
	        
	        
	        System.out.println("Factorialul nr. este " + fact );
	        
	    }
	
}
