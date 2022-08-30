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
public class Monedas {
	
	control miControl;
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirPesosADolares(double input) {		
		double resultado = input / 4144.22;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirPesosAEuros(double input) {
		double resultado = input / 129.1381;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirPesosALibrasEsterlinas(double input) {
		double resultado = input / 150.4717;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirPesosAYenJapones(double input) {
		double resultado = input / 0.9095;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirPesosAWonSurcoreano(double input) {
		double resultado = input / 0.0951;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirDolaresAPesos(double input) {		
		double resultado = input * 4144.22;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirEurosAPesos(double input) {		
		double resultado = input * 129.1381;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirLibrasEsterlinasAPesos(double input) {		
		double resultado = input * 150.4717;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirYenJaponesAPesos(double input) {		
		double resultado = input * 0.9095;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public String convertirWonSurcoreanoAPesos(double input) {		
		double resultado = input * 0.0951;
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