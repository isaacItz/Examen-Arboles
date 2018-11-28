package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {

	private List<T> pila;

	public Pila() {

		pila = new ArrayList<>();

	}

	public void push(T dato) {
		pila.add(dato);
	}

	public T pop() {
		return pila.remove(pila.size() - 1);
	}

	public boolean estaVacia() {
		return pila.isEmpty();
	}

	public String cima() {
		return pila.get(pila.size() - 1).toString();
	}

}
