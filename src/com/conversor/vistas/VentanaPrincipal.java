package com.conversor.vistas;
/**
 * 
 */
import javax.swing.JOptionPane;
import com.conversor.controlador.control;
/**
 * @utor Ernesto Trompa
 * Challenge Alura 2022
 * conversor unidades 
 */
public class VentanaPrincipal {
	
	control miControl;
	boolean continua = true;

	/**
	 * 
	 */
	public void iniciarConversor() {
		
		while(continua) {
			String opciones = (JOptionPane.showInputDialog(
					null, 
					"Selecciona una opción de conversión",
					"Conversor valores con codigo Java",
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					new Object[] {
							"Conversor de Moneda", 
							"Conversor de Temperatura",
							"Conversor de Longitud"
					},
					"Seleccion"
			)).toString();
			/**
			 * 
			 */
			if(opciones == "Conversor de Moneda") {
				String input = JOptionPane.showInputDialog(
						"Ingresa la cantidad de dinero que deseas convertir: "
				);
				
				double numero = miControl.validarNumero(input);
				/**
				 * 
				 */
				if( numero > 0 ) {
					String tipoConversion = (JOptionPane.showInputDialog(
							null, 
							"Elije una opción para convertir", 
							"Conversor de Moneda",
							JOptionPane.QUESTION_MESSAGE,
							null,
							new Object[] {
									"De Pesos a Dolares",
									"De Pesos a Euros",
									"De Pesos a Libras Esterlinas",
									"De Pesos a Yen Japones",
									"De Pesos a Won Surcoreano",
									"De Dolares a Pesos",
									"De Euros a Pesos",
									"De Libras Esterlinas a Pesos",
									"De Yen Japones a Pesos",
									"De Won Surcoreano a Pesos",
							}, 
							"Seleccion"
					)).toString();
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Dolares") {
						String resultado = (miControl.convertirPesosADolares(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Dolares"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Euros") {
						String resultado = (miControl.convertirPesosAEuros(numero));
						JOptionPane.showMessageDialog(
								null, 
								"Tienes "+resultado +" Euros"
						);
						
						continuaEjecucion();
						
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Libras Esterlinas") {
						String resultado = (miControl.convertirPesosALibrasEsterlinas(numero));
						JOptionPane.showMessageDialog(
								null, 
								"Tienes "+resultado +" Libras Esterlinas"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Yen Japones") {
						String resultado = (miControl.convertirPesosAYenJapones(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Yenes Japoneses"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Won Surcoreano") {
						String resultado = (miControl.convertirPesosAWonSurcoreano(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Wones Surcoreanos"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Dolares a Pesos") {
						String resultado = (miControl.convertirDolaresAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Euros a Pesos") {
						String resultado = (miControl.convertirEurosAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Libras Esterlinas a Pesos") {
						String resultado = (miControl.convertirLibrasEsterlinasAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Yen Japones a Pesos") {
						String resultado = (miControl.convertirYenJaponesAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Won Surcoreano a Pesos") {
						String resultado = (miControl.convertirWonSurcoreanoAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
				} else {
					JOptionPane.showMessageDialog(
							null, 
							"Ingresa un numero valido"
					);
				}
				
			} else if(opciones == "Conversor de Temperatura") {
				String input = JOptionPane.showInputDialog(
						"Ingresa la cantidad de grados que deseas convertir: "
				);
				
				double numero = miControl.validarNumero(input);
				/**
				 * 
				 */
				if( numero != 0 ) {
					String tipoConversion = (JOptionPane.showInputDialog(
							null, 
							"Elije una opcion para convertir",
							"Conversor de Temperatura",
							JOptionPane.QUESTION_MESSAGE,
							null, 
							new Object[] {
									"De Celsius a Fahrenheit",
									"De Fahrenheit a Celsius",
									"De Celsius a Kelvin",
									"De Kelvin a Celsius",
							},
							"Seleccion"
					)).toString();
					/**
					 * 
					 */
					if(tipoConversion == "De Celsius a Fahrenheit") {
						String resultado = miControl.convertirCelsiusEnFahrenheit(numero);
						JOptionPane.showMessageDialog(
								null,
								input +"Grados Celsius equivalen a "+resultado +"Grados Fahrenheit"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De grados Fahrenheit a grados Celsius") {
						String resultado = miControl.convertirFahrenheitEnCelsius(numero);
						JOptionPane.showMessageDialog(
								null,
								input +"grados Fahrenheit equivalen a "+resultado +"grados Celsius"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Celsius a Kelvin") {
						String resultado = miControl.convertirCelsiusEnKelvin(numero);
						JOptionPane.showMessageDialog(
								null,
								input +"Grados Celsius equivalen a "+resultado +"grados Kelvin"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Kelvin a Celsius") {
						String resultado = miControl.convertirKelvinEnCelsius(numero);
						JOptionPane.showMessageDialog(
								null,
								input +"Grados Celsius equivalen a "+resultado +"Grados Kelvin"
						);
						
						continuaEjecucion();
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
				}
				
			} else if(opciones == "Conversor de Longitud") {
				String input = JOptionPane.showInputDialog(
						"Ingresa la longitud que deseas convertir: "
				);
				
				double numero = miControl.validarNumero(input);
				/**
				 * 
				 */
				if( numero > 0 ) {
					String tipoConversion = (JOptionPane.showInputDialog(
							null,
							"Elije una opcion para convertir",
							"Conversor de Longitudes",
							JOptionPane.QUESTION_MESSAGE,
							null,
							new Object[] {
									"De Kilometros a Metros",
									"De Kilometros a Millas",
									"De Kilometros a Yardas",
									"De Metros a Kilometros",
									"De Millas a Kilometros",
									"De Yardas a Kilometros",
							},
							"Seleccion"
					)).toString();
					/**
					 * 
					 */
					if(tipoConversion == "De Kilometros a Metros") {
						String resultado = miControl.convertirKilometrosAMetros(numero);
						JOptionPane.showMessageDialog(null, input +" Kilometros equivalen a "+resultado +" Metros");
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Kilometros a Millas") {
						String resultado = miControl.convertirKilometrosAMillas(numero);
						JOptionPane.showMessageDialog(null, input +" Kilometros equivalen a "+resultado +" Millas");
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Kilometros a Yardas") {
						String resultado = miControl.convertirKilometrosAYardas(numero);
						JOptionPane.showMessageDialog(null, input +" Kilometros equivalen a "+resultado +" Yardas");
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Metros a Kilometros") {
						String resultado = miControl.convertirMetrosAKilometros(numero);
						JOptionPane.showMessageDialog(null, input +" Metros equivalen a "+resultado +" Kil�metros");
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Millas a Kilometros") {
						String resultado = miControl.convertirMillasAKilometros(numero);
						JOptionPane.showMessageDialog(null, input +" Millas equivalen a "+resultado +" Kil�metros");
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Yardas a Kilometros") {
						String resultado = miControl.convertirYardasAKilometros(numero);
						JOptionPane.showMessageDialog(null, input +" Yardas equivalen a "+resultado +" Kilometros");
						
						continuaEjecucion();
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
				}
			}
		}
	}
	/**
	 * 
	 */
	private void continuaEjecucion() {
		int respuesta = JOptionPane.showConfirmDialog(
				null,
				"Deseas realizar otra conversion?"
		);
		/**
		 * 
		 */
		if(JOptionPane.OK_OPTION != respuesta) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
			continua = false;
		}
	}
	/**
	 * 
	 * @param miControl
	 */
	public void setCoordinador(control miControl) {
		this.miControl = miControl;
	}
}
