package modell;
import view.PrimerPanel;
//import view.Prueba;
import view.SegundoPanel;

import javax.lang.model.util.SimpleTypeVisitor14;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.PanelUI;

/*
 * Autor: Iván Monsalve | Julián Montañez
 * Descripción: Componente gráfico SwimSoft
 * Fecha: 14/05/22
 */
public class Operacion {
	//Declaracion de variables 
	private Boolean resultadoLogIn;
	private String caracterUsuario;
	private String caracterContraseña;
	private String mensajeInscripcion;
	private String mensajeDatos;
	private int reciboEntradas;

	//Método Constructor
	public Operacion() {
		
		resultadoLogIn = false;
		caracterUsuario = "admin";
		caracterContraseña = "admin123";
 	}

	//Métodos propios
	public boolean validarDatos(String usuario, String contraseña) {
		if(usuario.equals(caracterUsuario) == true && contraseña.equals(caracterContraseña) == true) {
			resultadoLogIn = true;
		} else {
			resultadoLogIn = false;
		}
		return resultadoLogIn;
	}

	public String realizarValidacionRegistro(String nombre, String apellido, String sexo, String identificacion, int cantidadNinos, int cantidadAdultos) {
		mensajeInscripcion = "Los datos del cliente registrado son: \nNombre: " + nombre + "\nApellido: " + apellido + "\nSexo: " + sexo + "\nIdentificacion: " + identificacion + "\nCantidad de manillas niños: " + cantidadNinos + "\nCantidad de manillas adultos: " + cantidadAdultos;
		return mensajeInscripcion;	
	}

	public String realizarValidacionDatos(String nombre, String apellido, String sexo, String identificacion, int cantidadNinos, int cantidadAdultos) {
		mensajeDatos= "Los datos del cliente registrado son: \nNombre: " + nombre + "\nApellido: " + apellido + "\nSexo: " + sexo + "\nIdentificacion: " + identificacion + "\nCantidad de manillas niños: " + cantidadNinos + "\nCantidad de manillas adultos: " + cantidadAdultos;
		
		return mensajeDatos;	
	}
	
	

	
	
}





