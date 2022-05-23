package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Graphics;
import java.awt.Font;



import javax.imageio.ImageIO;


import controll.Controller;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;



public class CuartoPanel extends JPanel implements ActionListener {

    //variables contenidos

	private BufferedImage ImagenDos;

	private Font fuente;
	private Font fuenteDos;
	//String o Int
	private String resultadoVista;

	private int cantidadTraje;
	private int cantidadGafas;
	private int cantidadAletas;
	private int cantidadGorros;
	private int cantidadProtector;
	private int cantidadProtectorCelular;

	//variables contenidos
	private JTextField contenidoAletas;
	private JTextField contenidoTraje;
	private JTextField contenidoGorros;
	private JTextField contenidoProtector ;
	private JTextField  contenidoGafasSol;
	private JTextField contenidoProtectorCelular;

	//variables etiquetas
	private JLabel etiquetaProducto;
	private JLabel etiquetaTraje;
	private JLabel etiquetaGafas;
	private JLabel etiquetaAletas;
	private JLabel etiquetaGorros;
	private JLabel etiquetaProtector ;
	private JLabel etiquetaProtectorCelular;
	private JLabel etiquetaPrecio;
	private JLabel etiquetaTitulo;
	private JLabel etiquetaCantidad;
	private JLabel etiquetaPrecioTraje;
	private JLabel etiquetaPrecioGafas;
	private JLabel etiquetaPrecioAletas;
	private JLabel etiquetaPrecioGorros;
	private JLabel etiquetaPrecioProtector;
	private JLabel etiquetaPrecioProtectorCelular;
	

	private CustomEvent evento;
	
	private JLabel etiquetaCelular;

	//variables para Boton
	private JButton botonAceptarQuiosco;

	public CuartoPanel(){
		resultadoVista = " ";
		setLayout(null);

		fuente = new Font("Berlin Sans FB", Font.BOLD, 20);
		fuenteDos = new Font("Berlin Sans FB", Font.BOLD, 16);

		etiquetaTitulo = new JLabel("BIENVENIDO AL QUIOSCO DE LA PISCINA");
		etiquetaTitulo.setBounds(200, 10, 400, 50);
		etiquetaTitulo.setFont(fuente);
		etiquetaTitulo.setForeground(java.awt.Color.decode("#0B2B7C"));
		//add(etiquetaTitulo);

		etiquetaProducto = new JLabel("PRODUCTO");
		etiquetaProducto.setForeground(java.awt.Color.decode("#717137"));
		etiquetaProducto.setBounds(110, 60, 300, 50);
		etiquetaProducto.setFont(fuente);
		add(etiquetaProducto);

		etiquetaPrecio = new JLabel("PRECIO");
		etiquetaPrecio.setForeground(java.awt.Color.decode("#717137"));
		etiquetaPrecio.setBounds(320, 60, 300, 50);
		etiquetaPrecio.setFont(fuente);
		add( etiquetaPrecio);

		etiquetaCantidad = new JLabel("CANTIDAD");
		etiquetaCantidad.setBounds(480, 60, 200, 50);
		etiquetaCantidad.setForeground(java.awt.Color.decode("#717137"));
		etiquetaCantidad.setFont(fuente);
		add( etiquetaCantidad);


		etiquetaTraje = new JLabel("TRAJE DE BAÑO");
		etiquetaTraje.setBounds(120, 90, 200, 100);
		etiquetaTraje.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaTraje.setFont(fuenteDos);
		add(etiquetaTraje);

		etiquetaPrecioTraje= new JLabel("20.000");
		etiquetaPrecioTraje.setBounds(320, 90, 200, 100);
		etiquetaPrecioTraje.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaPrecioTraje.setFont(fuenteDos);
		add(etiquetaPrecioTraje);

		contenidoTraje = new JTextField("");
		contenidoTraje.setBounds(500, 120, 40, 20);
		add(contenidoTraje);

		etiquetaGafas = new JLabel("GAFAS DE SOL");
		etiquetaGafas.setBounds(120, 70, 200, 200);
		etiquetaGafas.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaGafas.setFont(fuenteDos);
		add(etiquetaGafas);

		etiquetaPrecioGafas = new JLabel("15.000");
		etiquetaPrecioGafas.setBounds(320, 70, 200, 200);
		etiquetaPrecioGafas.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaPrecioGafas.setFont(fuenteDos);
		add(etiquetaPrecioGafas);

		contenidoGafasSol = new JTextField();
		contenidoGafasSol.setBounds(500, 160, 40, 20);
		add(contenidoGafasSol);
		
		etiquetaAletas = new JLabel("ALETAS");
		etiquetaAletas.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaAletas.setBounds(120, 110, 200, 200);
		etiquetaAletas.setFont(fuenteDos);
		add(etiquetaAletas);

		etiquetaPrecioAletas = new JLabel("30.000");
		etiquetaPrecioAletas.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaPrecioAletas.setBounds(320, 110, 200, 200);
		etiquetaPrecioAletas.setFont(fuenteDos);
		add(etiquetaPrecioAletas);

		contenidoAletas = new JTextField();
		contenidoAletas.setBounds(500, 200, 40, 20);
		add(contenidoAletas);

		etiquetaGorros = new JLabel("GORROS DE PISCINA");
		etiquetaGorros.setBounds(120, 150, 200, 200);
		etiquetaGorros.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaGorros.setFont(fuenteDos);
		add(etiquetaGorros);

		etiquetaPrecioGorros = new JLabel("3.000");
		etiquetaPrecioGorros.setBounds(320, 150, 200, 200);
		etiquetaPrecioGorros.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaPrecioGorros.setFont(fuenteDos);
		add(etiquetaPrecioGorros);

		contenidoGorros = new JTextField();
		contenidoGorros.setBounds(500, 240, 40, 20);
		add(contenidoGorros);

		etiquetaProtector = new JLabel("PROTECTOR SOLAR");
		etiquetaProtector.setBounds(120, 190, 280, 200);
		etiquetaProtector.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaProtector.setFont(fuenteDos);
		add(etiquetaProtector);

		etiquetaPrecioProtector = new JLabel("25.000");
		etiquetaPrecioProtector.setBounds(320, 190, 280, 200);
		etiquetaPrecioProtector.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaPrecioProtector.setFont(fuenteDos);
		add(etiquetaPrecioProtector);

		contenidoProtector = new JTextField();
		contenidoProtector.setBounds(500, 280, 40, 20);
		add(contenidoProtector);

		etiquetaProtectorCelular = new JLabel("PROTECTOR CELULAR");
		etiquetaProtectorCelular.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaProtectorCelular.setBounds(120, 230, 400, 200);
		etiquetaProtectorCelular.setFont(fuenteDos);
		add(etiquetaProtectorCelular);

		etiquetaPrecioProtectorCelular = new JLabel("12.000");
		etiquetaPrecioProtectorCelular.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaPrecioProtectorCelular.setBounds(320, 230, 400, 200);
		etiquetaPrecioProtectorCelular.setFont(fuenteDos);
		add(etiquetaPrecioProtectorCelular);

		contenidoProtectorCelular = new JTextField();
		contenidoProtector.setBounds(500, 320, 40, 20);
		add(contenidoProtectorCelular);
	

		botonAceptarQuiosco = new JButton("ACEPTAR");
		botonAceptarQuiosco.setForeground(java.awt.Color.decode("#97970D"));
		botonAceptarQuiosco.setBounds(300,380,100,40);
		botonAceptarQuiosco.setActionCommand("Segundo Boton");
		botonAceptarQuiosco.addActionListener(this);
		add(botonAceptarQuiosco);
	}

	//Métodos propios
	public void mostrarResultadoQuiosco(int resultadoQuiosco) {
		String resultadoVista = Integer.toString(resultadoQuiosco);
	}

     //Gráficos de imagen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//exception  controlan el entorno
		try {
			ImagenDos = ImageIO.read(new File("src\\resources\\Quiosco.jpg"));
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
		JOptionPane.showMessageDialog(null, "Se ha registrado la información.");
	    
		cantidadTraje = Integer.parseInt(contenidoTraje.getText());
		cantidadGafas = Integer.parseInt(contenidoGafasSol.getText());
		cantidadAletas = Integer.parseInt(contenidoAletas.getText());
		cantidadGorros = Integer.parseInt(contenidoGorros.getText());
		cantidadProtector = Integer.parseInt(contenidoProtector.getText());
		cantidadProtectorCelular = Integer.parseInt(contenidoProtectorCelular.getText());

		evento.retornarCalculoQuiosco(cantidadTraje, cantidadGafas, cantidadAletas, cantidadGorros, cantidadProtector, cantidadProtectorCelular);
        
		contenidoTraje.setText("");
		contenidoGafasSol.setText("");
		contenidoAletas.setText("");
		contenidoGorros.setText("");
		contenidoProtector.setText("");
		contenidoProtectorCelular.setText("");
		
    }


}
