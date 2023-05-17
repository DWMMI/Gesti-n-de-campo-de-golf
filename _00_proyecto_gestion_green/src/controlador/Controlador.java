package controlador;

import javax.swing.JFrame;

import modelo.Modelo;
import vista.Vistas;

public class Controlador {
	// MVC
	private Modelo miModelo;
	private Vistas[] misVistas;

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setVistas(Vistas[] misVistas) {
		this.misVistas = misVistas;
	}

	// * MVC

	// método para cambiar ventanas:
	public void cambiarVentana(int i, int j) {
		((JFrame) misVistas[i]).setVisible(false);
		((JFrame) misVistas[j]).setVisible(true);
	}
}
