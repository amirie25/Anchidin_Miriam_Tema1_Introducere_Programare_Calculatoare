package ex7;

	import java.util.Scanner;

	public class ex7 {

	    public static void main(String[] args) {

	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Introdu numarul: ");

	        int nr = scanner.nextInt();
	        
	        scanner.close();
	        
	        int suma = 0;
	        int contor = 0;
	        int medie = 0;
	        
	        while (contor <= nr)
	        {	
	        suma = suma + contor;
	        contor ++;
	        }
	        
	        medie = suma / nr;
	        
	        System.out.println("Media este " + medie );
	        
	    }
	
}
