package bibliotecaApp;

import java.util.ArrayList;
import java.util.List;

public class GestionaBiblioteca {

	public static void createData() {

	}

	public static void main(String[] args) {
		System.out.println("Bienvenido a la bibliotecaApp");
		Biblioteca biblioteca1 = new Biblioteca("La Colmena", "Calle Pepito Perez");

		Libro libro1 = new Libro(1, "Cien años de soledad", "Gabriel", 1967, GeneroLibro.DRAMA, 5);
		Libro libro2 = new Libro(2, "El Alquimista", "Paulo Coelho", 1988, GeneroLibro.HISTORICO, 3);
		Libro libro3 = new Libro(3, "Sapiens: De animales a dioses", "Yuval", 2011, GeneroLibro.TERROR, 7);
		Libro libro4 = new Libro(4, "1984", "George Orwell", 1949, GeneroLibro.DRAMA, 4);
		Libro libro5 = new Libro(5, "El nombre de la rosa", "Umberto Eco", 1980, GeneroLibro.ROMANTICO, 2);
		Libro libro6 = new Libro(6, "Alicia en el país de las maravillas", "Lewis Carroll", 1865, GeneroLibro.INFANTIL,
				7);
		Libro libro7 = new Libro(7, "Matilda", "Roald Dahl", 1988, GeneroLibro.INFANTIL, 5);
		Libro libro8 = new Libro(8, "El mago de Oz", "L. Frank Baum", 1900, GeneroLibro.INFANTIL, 4);
		Libro libro9 = new Libro(9, "Charlie y la fábrica de chocolate", "Roald Dahl", 1964, GeneroLibro.INFANTIL, 6);

		Usuario usuario1 = new Usuario("U001", "Juan", "Lolailo", "juan.lolailo@example.com", "555-1234");
		Usuario usuario2 = new Usuario("U002", "Ana", "Mellan", "ana.mellan@example.com", "555-5678");
		Usuario usuario3 = new Usuario("U003", "Luis", "Cobol", "luis.cobol@example.com", "555-8765");
		Usuario usuario4 = new Usuario("U004", "María", "Gonzalez", "maria.gonzalez@example.com", "555-4321");
		Usuario usuario5 = new Usuario("U005", "Carlos", "Sainz", "carlos.sainz@example.com", "555-6789");

		biblioteca1.addLibro(libro1, libro2, libro3, libro4, libro5, libro6, libro7, libro8, libro9);
		biblioteca1.addUsuario(usuario1, usuario2, usuario3, usuario4, usuario5);

		Prestamo prestamo1 = new Prestamo(usuario1, libro1);
		Prestamo prestamo2 = new Prestamo(usuario2, libro2);
		Prestamo prestamo3 = new Prestamo(usuario3, libro2);
		Prestamo prestamo4 = new Prestamo(usuario1, libro2);
		Prestamo prestamo5 = new Prestamo(usuario3, libro1);
		Prestamo prestamo6 = new Prestamo(usuario3, libro8);
		Prestamo prestamo7 = new Prestamo(usuario4, libro8);
		Prestamo prestamo8 = new Prestamo(usuario2, libro9);
		Prestamo prestamo9 = new Prestamo(usuario5, libro5);

		biblioteca1.addPrestamo(prestamo1);
		biblioteca1.addPrestamo(prestamo2);
		biblioteca1.addPrestamo(prestamo3);
		biblioteca1.addPrestamo(prestamo4);
		biblioteca1.addPrestamo(prestamo5);
		biblioteca1.addPrestamo(prestamo6);
		biblioteca1.addPrestamo(prestamo7);
		biblioteca1.addPrestamo(prestamo8);
		biblioteca1.addPrestamo(prestamo9);

		biblioteca1.returnPrestamo(prestamo8);

		libro3.consultaDisponibilidad();

		System.out.println("Registro de prestamos: ");
		biblioteca1.mostrarRegistro();

		System.out.println("Libros mas prestados: ");
		biblioteca1.imprimirTop10LibrosMasPrestados();

		System.out.println("Usuarios con mas prestamos: ");
		biblioteca1.imprimirUsuariosConPrestamos();

		System.out.println("Map de libros infantiles: ");
		biblioteca1.imprimirLibrosInfantil();

	}
}
