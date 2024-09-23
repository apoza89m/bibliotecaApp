package bibliotecaApp;

import java.time.LocalDate;
import java.util.List;

public class Prestamo {

	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;

	private Usuario usuario;
	private Libro libro;

	public Prestamo(Usuario usuario, Libro libro) {
		this.fechaPrestamo = LocalDate.now();
		this.fechaDevolucion = null;
		this.usuario = usuario;
		this.libro = libro;
	}


	
	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "Prestamo [fechaPrestamo= " + fechaPrestamo + ", fechaDevolucion= " + fechaDevolucion + ", usuario= "
				+ usuario.getNombre() + ", libro= " + libro.getTitulo() + "]";
	}
	
	

}
