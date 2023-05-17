package vista;

import controlador.Controlador;
import modelo.Modelo;

public class _00_Login implements Vistas {
	// MVC
	private Controlador miControlador;
	private Modelo miModelo;

	public void setModelo(Modelo miModelo) {
		this.miControlador = miControlador;

	}

	public void setControlador(Controlador miControlador) {
		this.miModelo = miModelo;
	}
	// * MVC

}
