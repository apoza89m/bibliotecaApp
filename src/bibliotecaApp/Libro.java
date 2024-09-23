package bibliotecaApp;

public class Libro {

	private int id;
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private GeneroLibro genero;
	private int ejemplosDisponibles;
	private int contadorPrestamos;

	public int getId() {
		return id;
	}

	public Libro() {
	}

	public Libro(int id, String titulo, String autor, int anioPublicacion, GeneroLibro genero,
			int ejemplosDisponibles) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.genero = genero;
		this.ejemplosDisponibles = ejemplosDisponibles;
		this.contadorPrestamos = 0;

	}

	public void retirarLibro() {
		ejemplosDisponibles--;
		contadorPrestamos++;
	}

	public void devolverLibro() {
		ejemplosDisponibles++;
	}

	public void consultaDisponibilidad() {
		System.out.println("El libro " + this.titulo + " tiene " + this.ejemplosDisponibles + " unidades");
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public GeneroLibro getGenero() {
		return genero;
	}

	public void setGenero(GeneroLibro genero) {
		this.genero = genero;
	}

	public int getEjemplosDisponibles() {
		return ejemplosDisponibles;
	}

	public void setEjemplosDisponibles(int ejemplosDisponibles) {
		this.ejemplosDisponibles = ejemplosDisponibles;
	}

	public int getContadorPrestamos() {
		return contadorPrestamos;
	}

	public void setContadorPrestamos(int contadorPrestamos) {
		this.contadorPrestamos = contadorPrestamos;
	}

}
