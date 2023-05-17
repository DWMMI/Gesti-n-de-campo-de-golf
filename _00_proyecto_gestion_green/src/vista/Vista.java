package vista;

import controlador.Controlador;
import modelo.Modelo;

public interface Vista {
	public void setModelo(Modelo miModelo);
	public void setControlador (Controlador miControlador);
}
