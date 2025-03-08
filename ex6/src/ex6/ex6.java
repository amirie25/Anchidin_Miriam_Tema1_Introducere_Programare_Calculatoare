package ex6;

	import java.util.Scanner;

	public class ex6 {

	    public static void main(String[] args) {

	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Introdu numarul: ");

	        int nr = scanner.nextInt();
	        
	        scanner.close();
	        
	        int suma = 0;
	        int contor = 0;
	        
	        while (contor <= nr)
	        {
	        	if(contor % 2 == 1)
	        		{
	        		suma = suma + contor;
	        		}
	        contor ++;
	        }
	        
	        
	        System.out.println("Suma nr. impare este " + suma );
	        
	    }
	
}
