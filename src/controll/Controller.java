package controll;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import modell.Operacion;
import view.CustomEvent;
import view.CustomEventRespons;
import view.IOManager;

public class Controller implements CustomEvent {
	//Declaración de variables
	private Operacion objetoOperaciones;
	private IOManager objetoIOManagerDos; 
	private CustomEventRespons eventoRespuesta;

	//Variables de Archivos
	private String mensaje;
	private String nombre;
	private String ruta;
	private String rutaTotal;
	private boolean leer;
	private boolean escribir;
	private boolean sePuedeLeer;
	private boolean sePuedeEscribir;
	private long tamanio;
	private File objetoArchivos;
	private BufferedWriter escribirArchivo;
	private BufferedReader leerArchivo;
	
	//Método Constructor
	public Controller(){
		objetoOperaciones = new Operacion();
		//objetoIOManagerDos = new IOManager();
	}
	
	//Métodos propios
	@Override
	public void retornarLogIn(String usuario, String contrasenia) {
		//System.out.println("Estoy en el controlador");
		boolean resultadoLogIn = objetoOperaciones.validarDatos(usuario, contrasenia);
		//System.out.println(resultadoLogIn);
		eventoRespuesta.respuestaResultadoLogIn(resultadoLogIn);
	}

	@Override
	public void retornarImpresionPersonas(String nombre, String apellido, String sexo, String identificacion, int cantidadNinos, int cantidadAdultos) {
		String resultadoImpresion = objetoOperaciones.realizarValidacionRegistro(nombre, apellido, sexo, identificacion, cantidadNinos, cantidadAdultos);
		//System.out.println(resultadoImpresion);
		eventoRespuesta.respuestaRegistroPersonas(resultadoImpresion);
		JOptionPane.showMessageDialog(null, resultadoImpresion);
	}

	//Manejo de Archivos

	//Gets and Sets
	public CustomEventRespons getEventoRespuesta() {
		return eventoRespuesta;
	}

	public void setEventoRespuesta(CustomEventRespons eventoRespuesta) {
		this.eventoRespuesta = eventoRespuesta;
	}

	//Método main
	public void init() {
		IOManager objetoIOManager = new IOManager();
		objetoIOManager.setVisible(true);
	}
	
}
