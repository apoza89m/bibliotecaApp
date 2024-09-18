package bibliotecaApp;

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
        
        Usuario usuario1 = new Usuario("U001", "Juan", "Lolailo", "juan.lolailo@example.com", "555-1234");
        Usuario usuario2 = new Usuario("U002", "Ana", "Mellan", "ana.mellan@example.com", "555-5678");
        Usuario usuario3 = new Usuario("U003", "Luis", "Cobol", "luis.cobol@example.com", "555-8765");
        Usuario usuario4 = new Usuario("U004", "María", "O", "maria.o@example.com", "555-4321");
        Usuario usuario5 = new Usuario("U005", "Carlos", "Sainz", "carlos.sainz@example.com", "555-6789");
        
        biblioteca1.addLibro(libro1,libro2,libro3,libro4,libro5);
        biblioteca1.addUsuario(usuario1,usuario2,usuario3,usuario4,usuario5);
        
		System.out.println(libro1.getTitulo());
	}
}
