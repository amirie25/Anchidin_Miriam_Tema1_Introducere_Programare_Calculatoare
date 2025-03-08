package ex5;

	import java.util.Scanner;

	public class ex5 {

	    public static void main(String[] args) {

	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Introdu numarul: ");

	        int nr = scanner.nextInt();
	        
	        scanner.close();
	        
	        int suma = 0;
	        int contor = 0;
	        
	        while (contor <= nr)
	        {
	        	suma = suma + contor;
	        	contor ++;
	        	
	        }
	        
	        
	        System.out.println("Suma este " + suma );
	        
	    }
	
}
