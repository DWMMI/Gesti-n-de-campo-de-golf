package controlador;

import javax.swing.JFrame;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
	// MVC
	private Modelo miModelo;
	private Vista[] misVistas;

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setMisVistas(Vista[] misVistas) {
		this.misVistas = misVistas;
	}
	// * MVC

	// método para cambiar ventanas:
	public void cambiarVentana(int i, int j) {
		((JFrame) misVistas[i]).setVisible(false);
		((JFrame) misVistas[j]).setVisible(true);
	}
}
