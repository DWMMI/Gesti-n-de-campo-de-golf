package controlador;

import javax.swing.JFrame;

import modelo.Modelo;
import vista.Vistas;
import vista._00_Login;

public class Main {
	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		Vistas[] misVistas = new Vistas[2];

		misVistas[0] = new _00_Login();

		miModelo.setVistas(misVistas);

		miControlador.setVistas(misVistas);
		miControlador.setModelo(miModelo);

		for (Vistas vista : misVistas) {
			vista.setModelo(miModelo);
			vista.setControlador(miControlador);
		}

		((JFrame) misVistas[0]).setVisible(true);
	}
}
