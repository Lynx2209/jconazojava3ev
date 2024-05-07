package Servicios;


	
	import java.util.Scanner;

	public class MenuImplementacion implements MenuInterfaz {
	    public int menuPrincipal() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("|0. Cerrar menu           |");
	        System.out.println("|1. Registro de llegada   |");
	        System.out.println("|2. Listado de consultas  |");
	        

	        int opcion = scanner.nextInt();

	        return opcion;
	    }

	    public int mostrarSubmenu() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("|0. Volver              |");
	        System.out.println("|1. Mostrar consulta    |");
	        System.out.println("|2. Imprimir consultas  |");
	       

	        int opcion = scanner.nextInt();

	        return opcion;
	    }

	    public int mostrarConsultas() {
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.println("|1. Psicología      |");
	        System.out.println("|2. Traumatología   |");
	        System.out.println("|3. Fisioterapia    |");
	       

	        int opcion = scanner.nextInt();
	        

	        return opcion;
	    }
	}


}
