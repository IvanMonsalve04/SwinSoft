package controll;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import modell.Operacion;
import view.CustomEvent;
import view.CustomEventRespons;
import view.IOManager;
import view.SegundoPanel;

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
	private IOManager objetoIOManager;
	private SegundoPanel objetoSegundoPanel;
	
	
	//Método Constructor
	public Controller(){
		objetoOperaciones = new Operacion();
		
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
		//objetoArchivos = new File("src\\resources\\RegistroClientes.txt");
		objetoArchivos = new File("src\\resources\\" + identificacion + ".txt");
		

		try {
		
			escribirArchivo = new BufferedWriter(new FileWriter(objetoArchivos)); // Se crea el archivo
			
			escribirArchivo.write("\nSWIM SOFT ENTRADA DE PERSONAS\n");
			escribirArchivo.newLine();
			escribirArchivo.write("Nombre comprador:  " + nombre);
			escribirArchivo.write("\nApellido:  " + apellido);
			escribirArchivo.write("\nSexo comprador:  " + sexo);
			escribirArchivo.write("\nIdentificacion comprador:  " + identificacion);
			escribirArchivo.write("\nCantidad de manillas para ninos:  " + cantidadNinos);
			escribirArchivo.write("\nCantidad manillas para adultos:  " + cantidadAdultos);
			escribirArchivo.close();
			mensaje = "Tu archivo se ha creado y ya tiene datos";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "El archivo no se puede crear.";
		}

	}

	@Override
	public void retornarCalculo(int cocaCola, int agua, int jugo, int sandwitch, int cerveza, int empanada) {
		int resultadoImpresion = objetoOperaciones.realizarValidacionCalculo(cocaCola, agua, jugo, sandwitch, cerveza, empanada);
		
		JOptionPane.showMessageDialog(null, resultadoImpresion);
		
		objetoArchivos = new File("src\\resources\\RegistroTienda.txt");
		
		try {
		
			escribirArchivo = new BufferedWriter(new FileWriter(objetoArchivos)); // Se crea el archivo
			
			escribirArchivo.write("\nSWIM SOFT TIENDA\n");
			escribirArchivo.newLine();
			escribirArchivo.write("Valor CocaCola: " + (cocaCola * 3000));
			escribirArchivo.write("\nValor agua: " + (agua * 1800));
			escribirArchivo.write("\nValor jugo: " + (jugo * 2500));
			escribirArchivo.write("\nValor sandwitch: " + (sandwitch * 2000));
			escribirArchivo.write("\nValor cerveza:  " + (cerveza * 3000));
			escribirArchivo.write("\nValor empanada:  " + (empanada * 2500));
			escribirArchivo.close();
			mensaje = "Tu archivo se ha creado y ya tiene datos";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "El archivo no se puede crear.";
		}

		
		eventoRespuesta.respuestaCalculo(resultadoImpresion);

	}

	@Override
	public void retornarCalculoQuiosco(int cantidadTraje, int cantidadGafas, int cantidadAletas, int cantidadGorros, int cantidadProtector, int cantidadProtectorCelular) {
		int resultadoImpresion = objetoOperaciones.realizarCalculoQuiosco(cantidadTraje, cantidadGafas, cantidadAletas, cantidadGorros, cantidadProtector, cantidadProtectorCelular);
		
		JOptionPane.showMessageDialog(null, resultadoImpresion);
		
		objetoArchivos = new File("src\\resources\\RegistroQuiosco.txt");
		
		try {
		
			escribirArchivo = new BufferedWriter(new FileWriter(objetoArchivos)); // Se crea el archivo
			
			escribirArchivo.write("\nSWIM SOFT QUIOSCO\n");
			escribirArchivo.newLine();
			escribirArchivo.write("Valor traje de baño: " + (cantidadTraje * 3000));
			escribirArchivo.write("\nValor gafas: " + (cantidadGafas * 1800));
			escribirArchivo.write("\nValor aletas: " + (cantidadAletas * 2500));
			escribirArchivo.write("\nValor gorro: " + (cantidadGorros * 2000));
			escribirArchivo.write("\nValor protector solar:  " + (cantidadProtector * 3000));
			escribirArchivo.write("\nValor protector celular:  " + (cantidadProtectorCelular * 2500));
			escribirArchivo.close();
			mensaje = "Tu archivo se ha creado y ya tiene datos";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "El archivo no se puede crear.";
		}

		
		eventoRespuesta.respuestaCalculo(resultadoImpresion);

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
		
	}

	
	
}
