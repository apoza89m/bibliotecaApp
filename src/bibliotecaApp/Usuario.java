package bibliotecaApp;

import java.util.Random;

public class Usuario {

	private String id;
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private String telefono;
	private int contadorPrestamos;

	public Usuario(String nombre, String apellido, String correoElectronico, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
		this.contadorPrestamos = 0;
		this.id = calculaId();
	}

	public void incrementarPrestamos() {
		contadorPrestamos++;
	}

	public int getContadorPrestamos() {
		return contadorPrestamos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String calculaId() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(10000); // Random entre 0 y 9999
		return correoElectronico + "_" + numeroAleatorio;
	}

}
