package bibliotecaApp;

import java.time.LocalDate;

public class Prestamo {

	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	
	private Usuario usuario;
	private Libro libro;
	
	
	
	public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, Usuario usuario, Libro libro) {
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
	
	
}
