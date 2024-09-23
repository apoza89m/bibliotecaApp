package bibliotecaApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Biblioteca {

	private String nombre;
	private String direccion;
	private Set<Libro> libros;
	private Set<Usuario> usuarios;
	private List<Prestamo> prestamos;
	

	public Biblioteca(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		setLibros(new HashSet<Libro>());
		setUsuarios(new HashSet<Usuario>());
		setPrestamos(new ArrayList<Prestamo>());
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
    
    public void addPrestamo(Prestamo prestamo) {
    	if (prestamo.getLibro().getEjemplosDisponibles()>0) {
    		prestamos.add(prestamo);
    		prestamo.getLibro().retirarLibro();
    		prestamo.getUsuario().incrementarPrestamos();
    		System.out.println("Prestamo realizado correctamente.");
    	}
    	else System.out.println("No existen unidades para prestar");
    }
    
    public void returnPrestamo(Prestamo prestamo) {
        if (prestamo.getFechaDevolucion() == null) {
            prestamo.setFechaDevolucion(LocalDate.now());         
            prestamo.getLibro().devolverLibro();         
            prestamos.remove(prestamo);         
            System.out.println(prestamo.getLibro().getTitulo() +" devuelto correctamente.");
        } else {
            System.out.println("Este prestamo ya ha sido devuelto.");
        }
    }
    
    public void mostrarRegistro() {
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
    
	public void imprimirTop10LibrosMasPrestados() {
	    List<Libro> topLibros = libros.stream()
	        .sorted(Comparator.comparingInt(Libro::getAnioPublicacion)) // Ordenar por anio
	        .sorted(Comparator.comparingInt(Libro::getContadorPrestamos).reversed()) // Ordenar por prestamos (descendente)
	        .limit(10) // Limitar a los 10 primeros
	        .collect(Collectors.toList());

	    topLibros.forEach(libro -> 
	        System.out.println(libro.getTitulo() + " - " + libro.getContadorPrestamos() + " prestamos, Año: " + libro.getAnioPublicacion())
	    );
	}
	
	public void imprimirUsuariosConPrestamos() {
	    List<Usuario> usuariosConPrestamos = usuarios.stream()
	        .filter(usuario -> 
	            prestamos.stream().anyMatch(prestamo -> prestamo.getUsuario().equals(usuario))
	        ) // Filtrar usuarios que tienen al menos un prestamo
	        .sorted(Comparator.comparing(Usuario::getNombre)
	            .thenComparing(Usuario::getApellido)) // Ordenar por nombre y luego apellido
	        .collect(Collectors.toList());

	    usuariosConPrestamos.forEach(usuario -> 
	    System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " - " + usuario.getContadorPrestamos() + " prestamos")
	    );
	}
	
	public Map<Integer, Libro> generarMapaLibrosInfantiles() {
	    return libros.stream() 
	        .filter(libro -> libro.getGenero() == GeneroLibro.INFANTIL) // Filtrar libros infantil
	        .collect(Collectors.toMap(Libro::getId, libro -> libro)); // Crear el map con ID como clave y libro como valor
	}
	
	public void imprimirLibrosInfantil() {
		Map<Integer, Libro> librosInfantiles = generarMapaLibrosInfantiles();

		librosInfantiles.forEach((id, libro) -> 
		    System.out.println("ID: " + id + ", Título: " + libro.getTitulo())
		);
	}
	
	//GETTERS AND SETTERS

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

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	
}
