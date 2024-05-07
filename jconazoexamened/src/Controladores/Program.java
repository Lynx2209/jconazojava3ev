package Controladores;


	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class Program {
	    public static void main(String[] args) {
	        MenuInterfaz alpha = new MenuImplementacion();
	        

	        List<CitasDTos> listaCitas = new ArrayList<>();

	        int opcionSeleccionada;
	        boolean cerrarMenu = false;
	        Scanner scanner = new Scanner(System.in);

	        try {
	            while (!cerrarMenu) {
	                opcionSeleccionada = alpha.menuPrincipal();

	                switch (opcionSeleccionada) {
	                    case 0:
	                        System.out.println("Menu cerrado");
	                        cerrarMenu = true;
	                        break;
	                    case 1:
	                        System.out.println("Registro de llegada");
	                        alpha.registroLlegada(listaCitas);
	                        break;
	                    case 2:
	                        System.out.println("Listado de consultas");
	                        int opcion;
	                        boolean cerrarSubmenu = false;

	                        while (!cerrarSubmenu) {
	                            opcion = alpha.mostrarSubmenu();

	                            switch (opcion) {
	                                case 0:
	                                    System.out.println("Menu principal");
	                                    cerrarSubmenu = true;
	                                    break;
	                                case 1:
	                                    System.out.println("Mostrar consultas");
	                                    int opcion2;
	                                    boolean cerrarSubmenu2 = false;

	                                    while (!cerrarSubmenu2) {
	                                        opcion2 = alpha.mostrarConsultas();

	                                        switch (opcion2) {
	                                            case 0:
	                                                System.out.println("Psicología");
	                                                alpha.mostrarConsultas(listaCitas);
	                                                cerrarSubmenu2 = true;
	                                                break;
	                                            case 1:
	                                                System.out.println("Traumatología");
	                                                alpha.mostrarConsultas(listaCitas);
	                                                cerrarSubmenu2 = true;
	                                                break;
	                                            case 2:
	                                                System.out.println("Fisioterapia");
	                                                alpha.mostrarConsultas(listaCitas);
	                                                cerrarSubmenu2 = true;
	                                                break;
	                                            default:
	                                                System.out.println("Opción no válida");
	                                                break;
	                                        }
	                                    }
	                                    break;
	                                case 2:
	                                    System.out.println("Imprimir consulta");
	                                    break;
	                                default:
	                                    System.out.println("Opción no válida");
	                                    break;
	                            }
	                        }
	                        break;
	                    default:
	                        System.out.println("Opción no válida");
	                        break;
	                }
	            }
	        } catch (Exception ex) {
	            System.out.println(ex.toString());
	        }
	    }
	}


