package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;


import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import controll.Controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JFrame;


import java.awt.Image;

public class SegundoPanel extends JPanel implements ActionListener {
	
	private JTabbedPane Pestana;

	//variables etiquetas
	private JLabel etiquetaUno;
	private JLabel etiquetaDos;
	private JLabel etiquetaTitulo;
	private JLabel etiquetaSexo;
	private JLabel etiquetaIdenti;
	private JLabel etiquetaNiños;
	private JLabel etiquetaMayores;
	private JLabel resultado;
	private Image ImagenDos;

	//Fuentes
	private Font fuente;
	private Font fuenteDos; 

	//variables contenidos
	private JTextField contenidoNombre;
	private JTextField contenidoApellido;
	private JTextField contenidoSexo;
	private JTextField contenidoIdentificacion;
	private JTextField contenidoManillasNinos;
	private JTextField contenidoManillasAdultos;

	private Imprimir panelImprimir;

	//variables para Boton
	private JButton botonUno;

	//custom Event
	private CustomEvent evento;

	//String o Int
	private String resultadoVista;

	

	

	//Método Constructor
	public SegundoPanel() {
        setLayout(null);

		fuente = new Font("Berlin Sans FB", Font.BOLD, 20);
		fuenteDos = new Font("Berlin Sans FB", Font.BOLD, 16);

		etiquetaTitulo = new JLabel("BIENVENIDO SEÑOR USUARIO");
		etiquetaTitulo.setBounds(300, 10, 300, 50);
		etiquetaTitulo.setFont(fuente);
		etiquetaTitulo.setForeground(java.awt.Color.decode("#97970D"));
		add(etiquetaTitulo);

		etiquetaUno = new JLabel("DIGITA TU NOMBRE");
		etiquetaUno.setBounds(100, 60, 200, 50);
		etiquetaUno.setFont(fuenteDos);
		add(etiquetaUno);

		contenidoNombre = new JTextField("");
		contenidoNombre.setBounds(350, 80, 180, 20);
		
		add(contenidoNombre);

		etiquetaDos = new JLabel("DIGITA TU APELLIDO");
		etiquetaDos.setBounds(100, 30, 200, 200);
		etiquetaDos.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaDos.setFont(fuenteDos);
		add(etiquetaDos);

		contenidoApellido = new JTextField();
		contenidoApellido.setBounds(350, 120, 180, 20);
		add(contenidoApellido);
		
		etiquetaSexo = new JLabel("DIGITA TU SEXO");
		etiquetaSexo.setBounds(100, 70, 200, 200);
		etiquetaSexo.setFont(fuenteDos);
		add(etiquetaSexo);

		contenidoSexo = new JTextField();
		contenidoSexo.setBounds(350, 160, 180, 20);
		add(contenidoSexo);

		etiquetaIdenti = new JLabel("DIGITA TU IDENTIFICACION");
		etiquetaIdenti.setBounds(100, 110, 200, 200);
		etiquetaIdenti.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaIdenti.setFont(fuenteDos);
		add(etiquetaIdenti);

		contenidoIdentificacion = new JTextField();
		contenidoIdentificacion.setBounds(350, 200, 180, 20);
		add(contenidoIdentificacion);

		etiquetaNiños = new JLabel("CANTIDAD MANILLAS NIÑOS");
		etiquetaNiños.setBounds(100, 150, 280, 200);
		etiquetaNiños.setFont(fuenteDos);
		add(etiquetaNiños);

		contenidoManillasNinos = new JTextField();
		contenidoManillasNinos.setBounds(350, 240, 180, 20);
		add(contenidoManillasNinos);

		etiquetaMayores = new JLabel("CANTIDAD MANILLAS MAYORES");
		etiquetaMayores.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaMayores.setBounds(100, 190, 400, 200);
		etiquetaMayores.setFont(fuenteDos);
		add(etiquetaMayores);

		contenidoManillasAdultos = new JTextField();
		contenidoManillasAdultos.setBounds(350, 280, 180, 20);
		add(contenidoManillasAdultos);
		
		resultado = new JLabel("Su resultado Es: ");
		resultado.setBounds(8, 90, 200, 50);
		//add(resultado);

		botonUno = new JButton("IMPRIMIR");
		botonUno.setForeground(java.awt.Color.decode("#97970D"));
		botonUno.setBounds(300,350,100,40);
		botonUno.setActionCommand("Primer Boton");
		botonUno.addActionListener(this);
		add(botonUno);
	}

	//Métodos Propios
	public void mostrarResultadoRegistro(String resultadoImpresion) {
		String resultadoVista = resultadoImpresion.toString();
	}

	//Gráficos de imagen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//exception  controlan el entorno
		g.setColor(Color.BLACK);//repintar la pantalla g
		g.drawLine(5, 900, 120, 20);//linea g
		g.setColor(Color.yellow);
		g.drawRect(30, 30, 100, 30);//rectangulo g 
		try {
			ImagenDos = ImageIO.read(new File("src\\resources\\panelDos.jpg"));
			super.paintComponent(g);//herencia para poner color en g
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "IMAGEN NO ENCONTRADA ");
		}
		g.drawImage(ImagenDos, 0, 0, null);//movemos imagen
	}

	

	//Gets and Sets 
	public CustomEvent getEvento() {
		return evento;
	}

	public void setEvento(CustomEvent evento) {
		this.evento = evento;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "Click");
		PrimerPanel segundaPestaña = new PrimerPanel();
        Pestanas.add("Pestaña2", segundaPestaña);
        Pestanas.setSelectedComponent(segundaPestaña);
		Pestanas.setseleccion(segundaPestaña);

		String nombre = (contenidoNombre.getText());
		String apellido =(contenidoApellido.getText());
		String sexo = (contenidoNombre.getText());
		String identificacion = (contenidoApellido.getText());
		int cantidadNinos = Integer.parseInt(contenidoManillasNinos.getText());
		int cantidadAdultos = Integer.parseInt(contenidoManillasAdultos.getText());
	
		

		evento.retornarImpresionPersonas(nombre, apellido, sexo, identificacion, cantidadNinos, cantidadAdultos);

		contenidoNombre.setText(" ");
		contenidoApellido.setText(" ");
		contenidoSexo.setText(" ");
		contenidoIdentificacion.setText(" ");
		contenidoManillasNinos.setText(" ");
		contenidoManillasAdultos.setText(" ");
	
	}

	//Manejo de Archivos
	public String imprimirMensaje(String mensaje) {

		

		

		JOptionPane.showMessageDialog(null, mensaje);
		return null;
	}
	
	
}

	

	

