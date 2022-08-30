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
public class Longitud {
	
	control miControl;
	/**
	 * 
	 * @param longitud
	 * @return
	 */
	public String convertirKilometrosAMetros(double longitud) {
		double resultado = (longitud * 1000);
		return miControl.formatoResultado(resultado);        
	}
	/**
	 * 
	 * @param longitud
	 * @return
	 */
	public String convertirKilometrosAMillas(double longitud) {
		double resultado = (longitud / 1.609);
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param longitud
	 * @return
	 */
	public String convertirKilometrosAYardas(double longitud) {
		double resultado = (longitud * 1094);
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param longitud
	 * @return
	 */
	public String convertirMetrosAKilometros(double longitud) {
		double resultado = (longitud / 1000);
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param longitud
	 * @return
	 */
	public String convertirMillasAKilometros(double longitud) {
		double resultado = (longitud * 1.609);
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param longitud
	 * @return
	 */
	public String convertirYardasAKilometros(double longitud) {
		double resultado = (longitud / 1094);
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