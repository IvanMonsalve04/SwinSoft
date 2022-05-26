package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalTime;
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
	//Declaración de variables
	private JTabbedPane Pestana;
	//variables etiquetas
	private JLabel etiquetaUno;
	private JLabel etiquetaDos;
	private JLabel etiquetaTitulo;
	private JLabel etiquetaSexo;
	private JLabel etiquetaIdenti;
	private JLabel etiquetaNiños;
	private JLabel etiquetaMayores;
	private JLabel etiquetaPrecioNino;
	private JLabel etiquetaPrecioAdulto;
	private JLabel etiquetaPrecio;
	private Image ImagenDos;
	private JLabel etiquetaFecha;

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
		//add(etiquetaTitulo);

		etiquetaPrecio = new JLabel("PRECIO");
		etiquetaPrecio.setBounds(500, 60, 200, 50);
		etiquetaPrecio.setForeground(java.awt.Color.decode("#971A0D"));
		etiquetaPrecio.setFont(fuente);
		add( etiquetaPrecio);

		etiquetaUno = new JLabel("DIGITA TU NOMBRE");
		etiquetaUno.setBounds(100, 60, 200, 50);
		etiquetaUno.setForeground(java.awt.Color.decode("#971A0D"));
		etiquetaUno.setFont(fuenteDos);
		add(etiquetaUno);

		contenidoNombre = new JTextField("");
		contenidoNombre.setBounds(340, 80, 120, 20);
		add(contenidoNombre);

		etiquetaDos = new JLabel("DIGITA TU APELLIDO");
		etiquetaDos.setBounds(100, 30, 200, 200);
		etiquetaDos.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaDos.setFont(fuenteDos);
		add(etiquetaDos);
		
		contenidoApellido = new JTextField();
		contenidoApellido.setBounds(340, 120, 120, 20);
		add(contenidoApellido);
		
		etiquetaSexo = new JLabel("DIGITA TU SEXO");
		etiquetaSexo.setBounds(100, 70, 200, 200);
		etiquetaSexo.setForeground(java.awt.Color.decode("#971A0D"));
		etiquetaSexo.setFont(fuenteDos);
		add(etiquetaSexo);

		contenidoSexo = new JTextField();
		contenidoSexo.setBounds(360, 160, 100, 20);
		add(contenidoSexo);

		etiquetaIdenti = new JLabel("DIGITA TU IDENTIFICACION");
		etiquetaIdenti.setBounds(100, 110, 300, 200);
		etiquetaIdenti.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaIdenti.setFont(fuenteDos);
		add(etiquetaIdenti);

		contenidoIdentificacion = new JTextField();
		contenidoIdentificacion.setBounds(380, 200, 80, 20);
		add(contenidoIdentificacion);

		etiquetaNiños = new JLabel("CANTIDAD MANILLAS NIÑOS");
		etiquetaNiños.setBounds(100, 150, 280, 200);
		etiquetaNiños.setForeground(java.awt.Color.decode("#971A0D"));
		etiquetaNiños.setFont(fuenteDos);
		add(etiquetaNiños);

		etiquetaPrecioNino= new JLabel("6.000");
		etiquetaPrecioNino.setBounds(500, 150, 280, 200);
		etiquetaPrecioNino.setForeground(java.awt.Color.decode("#971A0D"));
		etiquetaPrecioNino.setFont(fuenteDos);
		add(etiquetaPrecioNino);

		contenidoManillasNinos = new JTextField();
		contenidoManillasNinos.setBounds(380, 240, 80, 20);
		add(contenidoManillasNinos);

		etiquetaMayores = new JLabel("CANTIDAD MANILLAS MAYORES");
		etiquetaMayores.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaMayores.setBounds(100, 190, 400, 200);
		etiquetaMayores.setFont(fuenteDos);
		add(etiquetaMayores);

		etiquetaPrecioAdulto= new JLabel("10.000");
		etiquetaPrecioAdulto.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaPrecioAdulto.setBounds(500, 190, 400, 200);
		etiquetaPrecioAdulto.setFont(fuenteDos);
		add(etiquetaPrecioAdulto);


		contenidoManillasAdultos = new JTextField();
		contenidoManillasAdultos.setBounds(380, 280, 80, 20);
		add(contenidoManillasAdultos);
		
		botonUno = new JButton("IMPRIMIR");
		botonUno.setForeground(java.awt.Color.decode("#1E2A8C"));
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
			ImagenDos = ImageIO.read(new File("src\\resources\\images\\panelDos.jpg"));
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
		String sexo = (contenidoSexo.getText());
		String identificacion = (contenidoIdentificacion.getText());
		int cantidadNinos = Integer.parseInt(contenidoManillasNinos.getText());
		int cantidadAdultos = Integer.parseInt(contenidoManillasAdultos.getText());
	
		evento.retornarImpresionPersonas(nombre, apellido, sexo, identificacion, cantidadNinos, cantidadAdultos);

		contenidoNombre.setText("");
		contenidoApellido.setText("");
		contenidoSexo.setText("");
		contenidoIdentificacion.setText("");
		contenidoManillasNinos.setText("");
		contenidoManillasAdultos.setText("");
	
	}

	//Manejo de Archivos
	public String imprimirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
		return null;
	}
}

	

	

