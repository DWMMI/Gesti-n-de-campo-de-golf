package vista;

import controlador.Controlador;
import modelo.Modelo;

public class _00_Login implements Vistas {
	// MVC
	private Controlador miControlador;
	private Modelo miModelo;
	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	//* MVC
	@Override
	public void setModelo(Modelo miModelo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setControlador(Controlador miControlador) {
		// TODO Auto-generated method stub
		
	}
}
