package controll;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
	private FileWriter sobreEscribirArchivo;
	private BufferedWriter escribirArchivo;
	private BufferedReader leerArchivo;
	private IOManager objetoIOManager;
	private SegundoPanel objetoSegundoPanel;
	
	private double resultadoValorManillas;
	private double resultadoValorTienda;
	private double resultadoValorQuiosco;
	
	
	//Método Constructor
	public Controller(){
		objetoOperaciones = new Operacion();
		resultadoValorManillas = 0;
		resultadoValorTienda = 0;
		resultadoValorQuiosco = 0;
		
	}
	
	//Métodos propios
	public CustomEventRespons getEventoRespuesta() {
		return eventoRespuesta;
	}

	public void setEventoRespuesta(CustomEventRespons eventoRespuesta) {
		this.eventoRespuesta = eventoRespuesta;
	}
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
		eventoRespuesta.respuestaRegistroPersonas(resultadoImpresion);
		JOptionPane.showMessageDialog(null, resultadoImpresion);
		resultadoValorManillas = objetoOperaciones.calcularTotalRegistroPersonas(cantidadNinos, cantidadAdultos);
		JOptionPane.showMessageDialog(null, "El valor total del registro a la piscina es de: " + resultadoValorManillas);
		objetoArchivos = new File("src\\resources\\documents\\RegistroClientes.txt");

		try {
			// Si el archivo no existe, se crea!
			if (!objetoArchivos.exists()) {
				objetoArchivos.createNewFile();
			}
			// flag true, indica adjuntar información al archivo.
			sobreEscribirArchivo = new FileWriter(objetoArchivos.getAbsoluteFile(), true);
			escribirArchivo = new BufferedWriter(new FileWriter(objetoArchivos)); // Se crea el archivo
			escribirArchivo.write("\nSWIM SOFT ENTRADA DE PERSONAS\n");
			escribirArchivo.newLine();
			escribirArchivo.write("Nombre comprador:  " + nombre);
			escribirArchivo.write("\nApellido:  " + apellido);
			escribirArchivo.write("\nSexo comprador:  " + sexo);
			escribirArchivo.write("\nIdentificacion comprador:  " + identificacion);
			escribirArchivo.write("\nCantidad de manillas para ninos:  " + cantidadNinos);
			escribirArchivo.write("\nCantidad manillas para adultos:  " + cantidadAdultos);
			escribirArchivo.newLine();
			//System.out.println("información agregada!");
			mensaje = "Tu archivo se ha creado y ya tiene datos";
    	} catch (IOException e) {
        	e.printStackTrace();
    	} finally {
			try {
				//Cierra instancias de FileWriter y BufferedWriter
				if (escribirArchivo != null)
					escribirArchivo.close();
				if (sobreEscribirArchivo != null)
					sobreEscribirArchivo.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	@Override
	public void retornarCalculo(int cocaCola, int agua, int jugo, int sandwitch, int cerveza, int empanada) {
		resultadoValorTienda = objetoOperaciones.realizarCalculoTienda(cocaCola, agua, jugo, sandwitch, cerveza, empanada);
		JOptionPane.showMessageDialog(null, "El valor total de las compras en la tienda es de: " + resultadoValorTienda);
		//System.out.println(resultadoValorTienda);
		objetoArchivos = new File("src\\resources\\documents\\RegistroTienda");
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
			escribirArchivo.newLine();
			escribirArchivo.close();
			mensaje = "Tu archivo se ha creado y ya tiene datos";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "El archivo no se puede crear.";
		}
		eventoRespuesta.respuestaCalculo(resultadoValorTienda);
	}
	

	@Override
	public void retornarCalculoQuiosco(int cantidadTraje, int cantidadGafas, int cantidadAletas, int cantidadGorros, int cantidadProtector, int cantidadProtectorCelular) {
		resultadoValorQuiosco = objetoOperaciones.realizarCalculoQuiosco(cantidadTraje, cantidadGafas, cantidadAletas, cantidadGorros, cantidadProtector, cantidadProtectorCelular);
		//System.out.println(resultadoValorQuiosco);
		//System.out.println(resultadoValorTienda);
		JOptionPane.showMessageDialog(null, "El valor total a pagar de las compras de quiosco es: " + resultadoValorQuiosco);
		objetoArchivos = new File("src\\resources\\documents\\RegistroQuiosco.txt");
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
			escribirArchivo.newLine();
			escribirArchivo.close();
			mensaje = "Tu archivo se ha creado y ya tiene datos";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "El archivo no se puede crear.";
		}
		eventoRespuesta.respuestaCalculo(resultadoValorQuiosco);
	}

	@Override
	public void retornarCalculoFactura(String sendData) {
		double valorTotalPagar = (resultadoValorManillas) + (resultadoValorTienda) + (resultadoValorQuiosco);
		eventoRespuesta.respuestaFactura(valorTotalPagar);
	}
	

	//Gets and Sets

	//Método main
	public void init() {
		IOManager objetoIOManager = new IOManager();
		objetoIOManager.setVisible(true);
	}
}
