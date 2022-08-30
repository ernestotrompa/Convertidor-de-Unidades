package com.conversor.controlador;

import com.conversor.modelo.Funciones;
import com.conversor.modelo.Temperatura;
import com.conversor.modelo.Longitud;
import com.conversor.modelo.Monedas;
import com.conversor.vistas.VentanaPrincipal;

public class control {
	
	private VentanaPrincipal miVentanaPrincipal;
	private Funciones misFunciones;
	private Monedas misPesos;
	private Temperatura miGradoCelsius;
	private Longitud miKilometro;
	
	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	
	public void setMisFunciones(Funciones misFunciones) {
		this.misFunciones = misFunciones;
	}

	public void setmisPesos(Monedas misPesos) {
		this.misPesos = misPesos;
	}
	
	public void setMisGradosCelsius(Temperatura miGradoCelsius) {
		this.miGradoCelsius = miGradoCelsius;
	}
	
	public void setMisKilometros(Longitud miKilometro) {
		this.miKilometro = miKilometro;
	}
	
	public void mostrarVentanaPrincipal() {
		miVentanaPrincipal.iniciarConversor();		
	}

	public double validarNumero(String input) {
		return misFunciones.validarNumero(input);
	}
	
	public String formatoResultado(double resultado) {
		return misFunciones.formatoResultado(resultado);
	}
	
	public String convertirPesosADolares(double numero) {
		return misPesos.convertirPesosADolares(numero);
	}

	public String convertirPesosAEuros(double numero) {
		return misPesos.convertirPesosAEuros(numero);
	}

	public String convertirPesosALibrasEsterlinas(double numero) {
		return misPesos.convertirPesosALibrasEsterlinas(numero);
	}

	public String convertirPesosAYenJapones(double numero) {
		return misPesos.convertirPesosAYenJapones(numero);
	}

	public String convertirPesosAWonSurcoreano(double numero) {
		return misPesos.convertirPesosAWonSurcoreano(numero);
	}

	public String convertirDolaresAPesos(double numero) {
		return misPesos.convertirDolaresAPesos(numero);
	}

	public String convertirEurosAPesos(double numero) {
		return misPesos.convertirEurosAPesos(numero);
	}

	public String convertirLibrasEsterlinasAPesos(double numero) {
		return misPesos.convertirLibrasEsterlinasAPesos(numero);
	}

	public String convertirYenJaponesAPesos(double numero) {
		return misPesos.convertirYenJaponesAPesos(numero);
	}

	public String convertirWonSurcoreanoAPesos(double numero) {
		return misPesos.convertirWonSurcoreanoAPesos(numero);
	}
	
	public String convertirCelsiusEnFahrenheit(double numero) {
		return miGradoCelsius.convertirCelsiusEnFahrenheit(numero);
	}
	
	public String convertirCelsiusEnKelvin(double numero) {
		return miGradoCelsius.convertirCelsiusEnKelvin(numero);
	}
	
	public String convertirFahrenheitEnCelsius(double numero) {
		return miGradoCelsius.convertirFahrenheitEnCelsius(numero);
	}
	
	public String convertirKelvinEnCelsius(double numero) {
		return miGradoCelsius.convertirKelvinEnCelsius(numero);
	}

	public String convertirKilometrosAMetros(double numero) {
		return miKilometro.convertirKilometrosAMetros(numero);
	}

	public String convertirKilometrosAMillas(double numero) {
		return miKilometro.convertirKilometrosAMillas(numero);
	}

	public String convertirKilometrosAYardas(double numero) {
		return miKilometro.convertirKilometrosAYardas(numero);
	}

	public String convertirMetrosAKilometros(double numero) {
		return miKilometro.convertirMetrosAKilometros(numero);
	}

	public String convertirMillasAKilometros(double numero) {
		return miKilometro.convertirMillasAKilometros(numero);
	}

	public String convertirYardasAKilometros(double numero) {
		return miKilometro.convertirYardasAKilometros(numero);
	}
}