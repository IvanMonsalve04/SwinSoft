package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TercerPanel extends JPanel implements ActionListener{
    private Image ImagenDos;

	//variables etiquetas
	private JLabel etiquetaProducto;
	private JLabel etiquetaPrecioCoca;
	private JLabel etiquetaJugo;
	private JLabel etiquetaAgua;
	private JLabel etiquetaPrecio;
	private JLabel etiquetaCantidad;
	private JLabel etiquetaSandwitch;
	private JLabel etiquetaCerveza;
	private JLabel etiquetaEmpanada;
	private JLabel etiquetaUno;
	private JLabel etiquetaDos;
	private JLabel etiquetaTres;
	private JLabel etiquetaTitulo;
	private JLabel etiquetaCuatro;
	private JLabel etiquetaCinco;
	private JLabel etiquetaSeis;



	//variables fuentes
	//Fuentes
	private Font fuente;
	private Font fuenteDos; 

	//variables contenidos
	private JTextField contenidoCocaCola;
	private JTextField contenidoJugo;
	private JTextField contenidoAgua;
	private JTextField contenidoSandwitch;
	private JTextField contenidoEmpanada;
	private JTextField contenidoSalchichon;

	//variables para Boton
	private JButton botonAceptar;

	//variables int o String
	private int cocaCola;
	private int agua;
	private int jugo;
	private int sandwitch;
	private int cerveza;
	private int empanada;

	//evento
	private CustomEvent evento;


	//metodo constructor
	public TercerPanel(){
		cocaCola = 3000;
		agua = 1800;
		jugo = 2500;
		sandwitch = 2000;
		cerveza = 3000;
		empanada = 2500;
		
		setLayout(null);

		fuente = new Font("Berlin Sans FB", Font.BOLD, 20);
		fuenteDos = new Font("Berlin Sans FB", Font.BOLD, 16);

		etiquetaTitulo = new JLabel("TIENDA DE LA PISCINA");
		etiquetaTitulo.setBounds(240, 470, 500, 80);
		etiquetaTitulo.setFont(fuente);
		etiquetaTitulo.setForeground(java.awt.Color.decode("#717137"));
		//add(etiquetaTitulo);



		etiquetaProducto = new JLabel("PRODUCTO");
		etiquetaProducto.setForeground(java.awt.Color.decode("#717137"));
		etiquetaProducto.setBounds(110, 60, 300, 50);
		etiquetaProducto.setFont(fuente);
		add( etiquetaProducto);

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


		etiquetaUno = new JLabel("COCACOLA");
		etiquetaUno.setBounds(120, 90, 200, 100);
		etiquetaUno.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaUno.setFont(fuenteDos);
		add(etiquetaUno);

		etiquetaPrecioCoca= new JLabel("3.000");
		etiquetaPrecioCoca.setBounds(320, 90, 200, 100);
		etiquetaPrecioCoca.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaPrecioCoca.setFont(fuenteDos);
		add(etiquetaPrecioCoca);

		contenidoCocaCola = new JTextField("");
		contenidoCocaCola.setBounds(500, 120, 40, 20);
		
		add(contenidoCocaCola);

		etiquetaDos = new JLabel("AGUA");
		etiquetaDos.setBounds(120, 70, 200, 200);
		etiquetaDos.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaDos.setFont(fuenteDos);
		add(etiquetaDos);

		etiquetaAgua = new JLabel("1.800");
		etiquetaAgua.setBounds(320, 70, 200, 200);
		etiquetaAgua.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaAgua.setFont(fuenteDos);
		add(etiquetaAgua);

		contenidoAgua = new JTextField();
		contenidoAgua.setBounds(500, 160, 40, 20);
		add(contenidoAgua);
		
		etiquetaTres = new JLabel("JUGO NATURAL");
		etiquetaTres.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaTres.setBounds(120, 110, 200, 200);
		etiquetaTres.setFont(fuenteDos);
		add(etiquetaTres);

		etiquetaJugo = new JLabel("2.500");
		etiquetaJugo.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaJugo.setBounds(320, 110, 200, 200);
		etiquetaJugo.setFont(fuenteDos);
		add(etiquetaJugo);

		contenidoJugo = new JTextField();
		contenidoJugo.setBounds(500, 200, 40, 20);
		add(contenidoJugo);

		etiquetaCuatro = new JLabel("SANDWITCH");
		etiquetaCuatro.setBounds(120, 150, 200, 200);
		etiquetaCuatro.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaCuatro.setFont(fuenteDos);
		add(etiquetaCuatro);

		etiquetaSandwitch = new JLabel("2.000");
		etiquetaSandwitch.setBounds(320, 150, 200, 200);
		etiquetaSandwitch.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaSandwitch.setFont(fuenteDos);
		add(etiquetaSandwitch);

		contenidoSandwitch = new JTextField();
		contenidoSandwitch.setBounds(500, 240, 40, 20);
		add(contenidoSandwitch);

		etiquetaCinco = new JLabel("CERVEZA");
		etiquetaCinco.setBounds(120, 190, 280, 200);
		etiquetaCinco.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaCinco.setFont(fuenteDos);
		add(etiquetaCinco);

		etiquetaCerveza = new JLabel("3.000");
		etiquetaCerveza.setBounds(320, 190, 280, 200);
		etiquetaCerveza.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaCerveza.setFont(fuenteDos);
		add(etiquetaCerveza);

		contenidoSalchichon = new JTextField();
		contenidoSalchichon.setBounds(500, 280, 40, 20);
		add(contenidoSalchichon);

		etiquetaSeis = new JLabel("EMPANADA");
		etiquetaSeis.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaSeis.setBounds(120, 230, 400, 200);
		etiquetaSeis.setFont(fuenteDos);
		add(etiquetaSeis);

		etiquetaEmpanada = new JLabel("2.500");
		etiquetaEmpanada.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaEmpanada.setBounds(320, 230, 400, 200);
		etiquetaEmpanada.setFont(fuenteDos);
		add(etiquetaEmpanada);


		contenidoEmpanada = new JTextField();
		contenidoEmpanada.setBounds(500, 320, 40, 20);
		add(contenidoEmpanada);

		botonAceptar = new JButton("ACEPTAR");
		botonAceptar.setForeground(java.awt.Color.decode("#97970D"));
		botonAceptar.setBounds(300,380,100,40);
		botonAceptar.setActionCommand("Segundo Boton");
		botonAceptar.addActionListener(this);
		add(botonAceptar);
	}



    //Gráficos de imagen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//exception  controlan el entorno
		try {
			ImagenDos = ImageIO.read(new File("src\\resources\\FondoPanelTienda.jpg"));
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
	//Métodos Propios
	public void mostrarResultadoCalculo(double resultadoCalculo) {
		String resultadoVista = Double.toString(resultadoCalculo);
	}

    @Override
    public void actionPerformed(ActionEvent arg0) {

		JOptionPane.showMessageDialog(null, "Se ha registrado la información.");

	    cocaCola = Integer.parseInt(contenidoCocaCola.getText());
		agua = Integer.parseInt(contenidoAgua.getText());
		jugo = Integer.parseInt(contenidoJugo.getText());
		sandwitch = Integer.parseInt(contenidoSandwitch.getText());
		cerveza =  Integer.parseInt(contenidoSalchichon.getText());
		empanada =  Integer.parseInt(contenidoEmpanada.getText());


		evento.retornarCalculo(cocaCola, agua, jugo, sandwitch, cerveza, empanada);
        
		contenidoCocaCola.setText("");
		contenidoAgua.setText("");
		contenidoJugo.setText("");
		contenidoSandwitch.setText("");
		contenidoSalchichon.setText("");
		contenidoEmpanada.setText("");
    }

}
