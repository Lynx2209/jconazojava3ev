package Dtos;


	import java.time.LocalDate;

	public class CitasDTos {
	    private String dni = "aaaaa";
	    private String nombre = "aaaaa";
	    private String apellidos = "aaaaa";
	    private String especialidad = "aaaaaa";
	    private LocalDate fechaDeCita = LocalDate.of(9999, 12, 31);
	    private String asistenciaACita = "aaaa";

	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    public String getEspecialidad() {
	        return especialidad;
	    }

	    public void setEspecialidad(String especialidad) {
	        this.especialidad = especialidad;
	    }

	    public LocalDate getFechaDeCita() {
	        return fechaDeCita;
	    }

	    public void setFechaDeCita(LocalDate fechaDeCita) {
	        this.fechaDeCita = fechaDeCita;
	    }

	    public String getAsistenciaACita() {
	        return asistenciaACita;
	    }

	    public void setAsistenciaACita(String asistenciaACita) {
	        this.asistenciaACita = asistenciaACita;
	    }

	    public CitasDTos() {
	    }

	    public CitasDTos(String dni, String nombre, String apellidos, String especialidad, LocalDate fechaDeCita, String asistenciaACita) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.especialidad = especialidad;
	        this.fechaDeCita = fechaDeCita;
	        this.asistenciaACita = asistenciaACita;
	    }
	}

}
