package modelo;

public class Nodo<T> {

	private T dato;
	private Nodo<T> hijoIzquierdo;
	private Nodo<T> hijoDerecho;

	public Nodo(T dato) {
		this.dato = null;
		this.dato = dato;
		hijoIzquierdo = null;
		hijoDerecho = null;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Nodo<T> getHijoIzquierdo() {
		return hijoIzquierdo;
	}

	public void setHijoIzquierdo(Nodo<T> hijoIzquierdo) {
		this.hijoIzquierdo = hijoIzquierdo;
	}

	public Nodo<T> getHijoDerecho() {
		return hijoDerecho;
	}

	public void setHijoDerecho(Nodo<T> hijoDerecho) {
		this.hijoDerecho = hijoDerecho;
	}

	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ",\n hijoIzquierdo=" + hijoIzquierdo + ", hijoDerecho=" + hijoDerecho + "]\n";
	}

}
