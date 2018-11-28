package modelo;

public class Pareja<T> {
	private T primero;
	private T segundo;
	
	public Pareja(T primero, T segundo) {
		super();
		this.primero = primero;
		this.segundo = segundo;
	}
	
	public T getPrimero() {
		return primero;
	}
	
	public void setPrimero(T primero) {
		this.primero = primero;
	}
	
	public T getSegundo() {
		return segundo;
	}
	
	public void setSegundo(T segundo) {
		this.segundo = segundo;
	}
	
	
}
