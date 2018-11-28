package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;

import modelo.Alumno;

public class Utileria {

	public static File buscarArchivo() {

		JFileChooser selector = new JFileChooser("//home//isaac//Escritorio//programa4M (copia).c");

		// File archivo = new File("//home//isaac//Escritorio//programa4M (copia).c");

		File archivo = null;

		int respuesta = selector.showOpenDialog(null);
		if (respuesta == 0)
			archivo = selector.getSelectedFile();

		return archivo;

	}

	public static List<Alumno> leerAlumnos(File archivo) {
		Scanner sc = null;
		List<Alumno> alumnos = new ArrayList<>();
		try {
			sc = new Scanner(archivo);
			while (sc.hasNextLine()) {
				String temporal = sc.nextLine();
				String[] datos = temporal.split("\t");
				Alumno al = new Alumno(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3],
						Integer.parseInt(datos[4]));
				alumnos.add(al);
			}

		} catch (FileNotFoundException | NumberFormatException e) {
			System.err.println("Hubo un Error " + e.getMessage());
		} finally {
			sc.close();
		}
		return alumnos;
	}

}
