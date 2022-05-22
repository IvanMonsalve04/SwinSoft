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
	private JLabel etiquetaCantidad;
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


	//metodo constructor
	public TercerPanel(){
		
		setLayout(null);

		fuente = new Font("Berlin Sans FB", Font.BOLD, 20);
		fuenteDos = new Font("Berlin Sans FB", Font.BOLD, 16);

		etiquetaTitulo = new JLabel("TIENDA DE LA PISCINA");
		etiquetaTitulo.setBounds(240, 470, 500, 80);
		etiquetaTitulo.setFont(fuente);
		etiquetaTitulo.setForeground(java.awt.Color.decode("#717137"));
		add(etiquetaTitulo);



		etiquetaProducto = new JLabel("NOMBRE PRODUCTO");
		etiquetaProducto.setForeground(java.awt.Color.decode("#717137"));
		etiquetaProducto.setBounds(110, 20, 300, 50);
		etiquetaProducto.setFont(fuente);
		add( etiquetaProducto);

		etiquetaCantidad = new JLabel("CANTIDAD");
		etiquetaCantidad.setBounds(400, 20, 200, 50);
		etiquetaCantidad.setForeground(java.awt.Color.decode("#717137"));
		etiquetaCantidad.setFont(fuente);
		add( etiquetaCantidad);


		etiquetaUno = new JLabel("COCACOLA");
		etiquetaUno.setBounds(120, 90, 200, 100);
		etiquetaUno.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaUno.setFont(fuenteDos);
		add(etiquetaUno);

		contenidoCocaCola = new JTextField("");
		contenidoCocaCola.setBounds(420, 120, 40, 20);
		
		add(contenidoCocaCola);

		etiquetaDos = new JLabel("AGUA");
		etiquetaDos.setBounds(120, 70, 200, 200);
		etiquetaDos.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaDos.setFont(fuenteDos);
		add(etiquetaDos);

		contenidoAgua = new JTextField();
		contenidoAgua.setBounds(420, 160, 40, 20);
		add(contenidoAgua);
		
		etiquetaTres = new JLabel("JUGO NATURAL");
		etiquetaTres.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaTres.setBounds(120, 110, 200, 200);
		etiquetaTres.setFont(fuenteDos);
		add(etiquetaTres);

		contenidoJugo = new JTextField();
		contenidoJugo.setBounds(420, 200, 40, 20);
		add(contenidoJugo);

		etiquetaCuatro = new JLabel("SANDWITCH");
		etiquetaCuatro.setBounds(120, 150, 200, 200);
		etiquetaCuatro.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaCuatro.setFont(fuenteDos);
		add(etiquetaCuatro);

		contenidoSandwitch = new JTextField();
		contenidoSandwitch.setBounds(420, 240, 40, 20);
		add(contenidoSandwitch);

		etiquetaCinco = new JLabel("SALCHICHON");
		etiquetaCinco.setBounds(120, 190, 280, 200);
		etiquetaCinco.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaCinco.setFont(fuenteDos);
		add(etiquetaCinco);

		contenidoSalchichon = new JTextField();
		contenidoSalchichon.setBounds(420, 280, 40, 20);
		add(contenidoSalchichon);

		etiquetaSeis = new JLabel("EMPANADA");
		etiquetaSeis.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaSeis.setBounds(120, 230, 400, 200);
		etiquetaSeis.setFont(fuenteDos);
		add(etiquetaSeis);

		contenidoEmpanada = new JTextField();
		contenidoEmpanada.setBounds(420, 320, 40, 20);
		add(contenidoEmpanada);

		botonAceptar = new JButton("ACEPTAR");
		botonAceptar.setForeground(java.awt.Color.decode("#97970D"));
		botonAceptar.setBounds(390,370,100,40);
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


    @Override
    public void actionPerformed(ActionEvent arg0) {

		JOptionPane.showMessageDialog(null, "click two");
        // TODO Auto-generated method stub
        
    }

    

    

}
