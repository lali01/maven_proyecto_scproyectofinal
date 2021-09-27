package proyecto.fiinal;

public class Libro implements Comparable<Libro> {

	//atributos
	private String codigo;
	private String nombre;
	private String autor;
	private int anio;
	private String editorial;
	private int cantidadPaginas;
	private double precio;
	private String estado;
	private String fechaEntrega;


	public Libro(String codigo, String nombre, String autor, int anio, String editorial, int cantidadPaginas,
			double precio, String estado, String fechaEntrega) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
		this.anio = anio;
		this.editorial = editorial;
		this.cantidadPaginas = cantidadPaginas;
		this.precio = precio;
		this.estado = estado;
		this.fechaEntrega = fechaEntrega;
		
	}

	public Libro() {
		// TODO Auto-generated constructor stub
	}

	// set y get
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", autor=" + autor + ", anio=" + anio + ", estado="
				+ estado + ", fechaEntrega=" + fechaEntrega + "]";

	}

	public void prestado() {

	}

	public void reservado() {

	}

	public void disponible() {
	
}

	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		
		if (this.codigo == o.getCodigo()) {
			return 0;	
		}else {
			return -1;
		}
	}
}
