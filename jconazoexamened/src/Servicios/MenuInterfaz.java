package Servicios;

	
public interface MenuInterfaz {
	    /**
	     * Método que muestra el menú principal y su selección.
	     *
	     * @return La opción seleccionada del menú principal.
	     */
	    public int menuPrincipal();

	    /**
	     * Método que muestra el submenú y su selección.
	     *
	     * @return La opción seleccionada del submenú.
	     */
	    public int mostrarSubmenu();

	    /**
	     * Método que muestra las consultas y su selección.
	     *
	     * @return La opción seleccionada de las consultas.
	     */
	    public int mostrarConsultas();
	}
