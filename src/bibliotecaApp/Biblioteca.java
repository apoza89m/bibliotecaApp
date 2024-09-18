package bibliotecaApp;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

	private String nombre;
	private String direccion;
	private Set<Libro> libros;
	private Set<Usuario> usuarios;
	

	public Biblioteca(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.setLibros(new HashSet<Libro>());
		this.setUsuarios(new HashSet<Usuario>());
	}
	
    public void addLibro(Libro... libros) {
        for (Libro libro : libros) {
            this.libros.add(libro);
        }
    }

    public void deleteLibro(Libro libro) {
        libros.remove(libro);
    }

    public void addUsuario(Usuario... usuarios) {
        for (Usuario usuario : usuarios) {
            this.usuarios.add(usuario);
        }
    }

    public void deleteUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
