package com.conversor.modelo;
/**
 * 
 */
import com.conversor.controlador.control;
/**
 * @utor Ernesto Trompa
 * Challenge Alura 2022
 * conversor unidades 
 */
public class Temperatura {
	
	control miControl;
	/**
	 * 
	 * @param grados
	 * @return
	 */
	public String convertirCelsiusEnFahrenheit(double grados) {
		double resultado = (grados * 9/5) + 32;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param grados
	 * @return
	 */
	public String convertirCelsiusEnKelvin(double grados) {
		double resultado = grados + 273.15;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param grados
	 * @return
	 */
	public String convertirFahrenheitEnCelsius(double grados) {
		double resultado = (grados - 32) * 5/9;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param grados
	 * @return
	 */
	public String convertirKelvinEnCelsius(double grados) {
		double resultado = grados - 273.15;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param miControl
	 */
	public void setCoordinador(control miControl) {
		this.miControl = miControl;
	}
}