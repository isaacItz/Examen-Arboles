package modelo;

public class Alumno implements Comparable<Alumno> {

	private int id;
	private String numControl;
	private String nombre;
	private String genero;
	private int promedio;

	public Alumno(int id, String numControl, String nombre, String genero, int promedio) {
		super();
		this.id = id;
		this.numControl = numControl;
		this.nombre = nombre;
		this.genero = genero;
		this.promedio = promedio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumControl() {
		return numControl;
	}

	public void setNumControl(String numControl) {
		this.numControl = numControl;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", numControl=" + numControl + ", nombre=" + nombre + ", genero=" + genero
				+ ", promedio=" + promedio + "]";
	}

	@Override
	public int compareTo(Alumno a) {
		return Integer.compare(promedio, a.promedio);
	}

}
