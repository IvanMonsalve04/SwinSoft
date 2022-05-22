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
	public String verificarExistencia() {
		objetoArchivos = new File("src\\resources\\RegistroClientes.txt"); //Puede ir en el
		// constructor, pero si se utiliza esa ruta para todo el programa.
		//objetoArchivos = new File("src\\resources\\rimero.txt");
		if (objetoArchivos.exists()) { // Si el archivo existe...
			nombre = objetoArchivos.getName(); // obtiene el nombre del archivo
			ruta = objetoArchivos.getPath(); // obtiene la ruta
			rutaTotal = objetoArchivos.getAbsolutePath(); // obtiene la ruta total desde el disco raíz

			leer = objetoArchivos.canRead(); // Se puede leer?
			escribir = objetoArchivos.canWrite(); // Se puede escribir?
			tamanio = (objetoArchivos.length() / 1024); // Longitud del archivo en bytes, pasado a kilobytes
			mensaje = nombre + "\n" + ruta + "\n" + rutaTotal + "\n" + tamanio; // Se concatenan las variables
		} else {
			// mensaje = "El archivo no existe.";
			objetoArchivos = new File("src\\resources\\RegistroPersonas.txt");
			// Como se está invocando algo fuera del entorno se genera una excepción, por lo
			// tanto:
			try {
				escribirArchivo = new BufferedWriter(new FileWriter(objetoArchivos)); // Se crea el archivo
				mensaje = "Se ha creado el archivo";
			} catch (IOException e) {
				e.printStackTrace();
				mensaje = "El archivo no se puede crear.";
			}
		}
		return objetoIOManagerDos.imprimirMensaje(mensaje); // Retorna hacia la clase IOManager, en el método imprimir
															// mensaje con el parametro mensaje
	}

	public String escribirArchivo() {
		objetoArchivos = new File("src\\resources\\RegistroPersonas.txt");
		int suma = 23 + 27;
		// Los archivos siempre se manda información de tipo String
		// Como se está invocando algo fuera del entorno se genera una excepción, por lo
		// tanto:
		try {
			escribirArchivo = new BufferedWriter(new FileWriter(objetoArchivos)); // Se crea el archivo
			escribirArchivo.write("Hola mundo, soy Tadeo.");
			escribirArchivo.newLine();
			escribirArchivo.write("El resultado de la suma es: " + suma);
			escribirArchivo.close();
			mensaje = "Tu archivo se ha creado y ya tiene datos";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "El archivo no se puede crear.";
		}
		return objetoIOManagerDos.imprimirMensaje(mensaje);
	}

	public String leerArchivo() {
		objetoArchivos = new File("src\\resources\\RegistroPersonas.txt");
		try {
			leerArchivo = new BufferedReader(new FileReader(objetoArchivos));
			mensaje = leerArchivo.readLine();
			leerArchivo.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "El archivo no se puede crear.";
		}
		return objetoIOManagerDos.imprimirMensaje(mensaje);
	}

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
		verificarExistencia();
		escribirArchivo();
		leerArchivo();
	}

	
}
