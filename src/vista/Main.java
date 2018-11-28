package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import controlador.Utileria;
import modelo.Alumno;
import modelo.Arbol;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar barra;
	private JMenuItem cargarArchivo;
	private JMenu visualizar;
	private JMenuItem inOrden;
	private JMenuItem postOrden;
	private JMenuItem preOrden;
	private JMenu alumnos;
	private Arbol<Alumno> arbol;

	public Main() {
		setTitle("Examen");
		setSize(300, 400);
		setExtendedState(MAXIMIZED_BOTH);
		añadirMenus();
		setJMenuBar(barra);
		arbol = new Arbol<>();
	}

	private void añadirMenus() {
		alumnos = new JMenu("Alumnos");
		cargarArchivo = new JMenuItem("Cargar Alumnos Mediante Archivo");
		visualizar = new JMenu("Visualizar Alumnos");
		inOrden = new JMenuItem("inOrden");
		postOrden = new JMenuItem("post Orden");
		preOrden = new JMenuItem("pre Orden");
		visualizar.add(inOrden);
		visualizar.add(postOrden);
		visualizar.add(preOrden);
		barra = new JMenuBar();
		alumnos.add(visualizar);
		alumnos.add(cargarArchivo);
		barra.add(alumnos);
		cargarArchivo.addActionListener(new oyenteRegistro());
		inOrden.addActionListener(new oyenteInOrden());
		preOrden.addActionListener(new oyentePreOrden());
		postOrden.addActionListener(new oyentePostOrden());

	}

	public static void main(String[] args) {
		new Main().setVisible(true);

	}

	private class oyenteRegistro implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			File archivo = Utileria.buscarArchivo();
			List<Alumno> list = Utileria.leerAlumnos(archivo);
			for (int i = 0; i < list.size(); i++)
				arbol.insertar(list.get(i));

			JOptionPane.showMessageDialog(null, "cargado con exito");
		}

	}

	private class oyenteInOrden implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String salida = arbol.inorden(arbol.getRaiz());
			JOptionPane.showMessageDialog(null, salida.isEmpty() ? "No Hay Alumnos" : salida, "Listado en Orden", 1);
		}

	}

	private class oyentePreOrden implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String salida = arbol.preOrden();
			JOptionPane.showMessageDialog(null, salida.isEmpty() ? "No Hay Alumnos" : salida, "Listado en Orden", 1);
		}

	}

	private class oyentePostOrden implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String salida = arbol.postOrden();
			JOptionPane.showMessageDialog(null, salida.isEmpty() ? "No Hay Alumnos" : salida, "Listado en Orden", 1);
		}

	}

}
