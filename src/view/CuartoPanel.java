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

	//variables contenidos
	private JTextField contenidoAletas;
	private JTextField contenidoTraje;
	private JTextField contenidoGorros;
	private JTextField contenidoProtector ;
	
	
	private JTextField  contenidoGafasSol;

	//variables etiquetas
	private JLabel etiquetaTraje;
	private JLabel etiquetaUno;
	private JLabel etiquetaDos;
	private JLabel etiquetaTres;
	private JLabel etiquetaCuatro;
	private JLabel etiquetaCinco;
	private JLabel etiquetaSeis;
	private JLabel etiquetaPrecio;
	private JLabel etiquetaTitulo;
	private JLabel etiquetaCantidad;
	private JLabel etiquetaPrecioTraje;
	private JLabel etiquetaGafas;
	private JLabel etiquetaAletas;
	private JLabel etiquetaGorros;
	private JLabel etiquetaProtector ;

	
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

		etiquetaUno = new JLabel("PRODUCTO");
		etiquetaUno.setForeground(java.awt.Color.decode("#717137"));
		etiquetaUno.setBounds(110, 60, 300, 50);
		etiquetaUno.setFont(fuente);
		add(etiquetaUno);

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

		contenidoTraje = new JTextField("");
		contenidoTraje.setBounds(500, 120, 40, 20);

		etiquetaPrecioTraje= new JLabel("20.000");
		etiquetaPrecioTraje.setBounds(320, 90, 200, 100);
		etiquetaPrecioTraje.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaPrecioTraje.setFont(fuenteDos);
		add(etiquetaPrecioTraje);
		
		add(contenidoTraje);

		etiquetaDos = new JLabel("GAFAS DE SOL");
		etiquetaDos.setBounds(120, 70, 200, 200);
		etiquetaDos.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaDos.setFont(fuenteDos);
		add(etiquetaDos);

		etiquetaGafas = new JLabel("15.000");
		etiquetaGafas.setBounds(320, 70, 200, 200);
		etiquetaGafas.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaGafas.setFont(fuenteDos);
		add(etiquetaGafas);

		contenidoGafasSol = new JTextField();
		contenidoGafasSol.setBounds(500, 160, 40, 20);
		add(contenidoGafasSol);
		
		etiquetaTres = new JLabel("ALETAS");
		etiquetaTres.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaTres.setBounds(120, 110, 200, 200);
		etiquetaTres.setFont(fuenteDos);
		add(etiquetaTres);

		etiquetaAletas = new JLabel("30.000");
		etiquetaAletas.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaAletas.setBounds(320, 110, 200, 200);
		etiquetaAletas.setFont(fuenteDos);
		add(etiquetaAletas);

		contenidoAletas = new JTextField();
		contenidoAletas.setBounds(500, 200, 40, 20);
		add(contenidoAletas);

		etiquetaCuatro = new JLabel("GORROS DE PISCINA");
		etiquetaCuatro.setBounds(120, 150, 200, 200);
		etiquetaCuatro.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaCuatro.setFont(fuenteDos);
		add(etiquetaCuatro);

		etiquetaGorros = new JLabel("3.000");
		etiquetaGorros.setBounds(320, 150, 200, 200);
		etiquetaGorros.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaGorros.setFont(fuenteDos);
		add(etiquetaGorros);

		contenidoGorros = new JTextField();
		contenidoGorros.setBounds(500, 240, 40, 20);
		add(contenidoGorros);

		etiquetaCinco = new JLabel("PROTECTOR SOLAR");
		etiquetaCinco.setBounds(120, 190, 280, 200);
		etiquetaCinco.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaCinco.setFont(fuenteDos);
		add(etiquetaCinco);

		etiquetaProtector = new JLabel("25.000");
		etiquetaProtector.setBounds(320, 190, 280, 200);
		etiquetaProtector.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaProtector.setFont(fuenteDos);
		add(etiquetaProtector);

		contenidoProtector = new JTextField();
		contenidoProtector.setBounds(500, 280, 40, 20);
		add(contenidoProtector );

		etiquetaSeis = new JLabel("PROTECTOR CELULAR");
		etiquetaSeis.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaSeis.setBounds(120, 230, 400, 200);
		etiquetaSeis.setFont(fuenteDos);
		add(etiquetaSeis);

		etiquetaCelular = new JLabel("12.000");
		etiquetaCelular.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaCelular.setBounds(320, 230, 400, 200);
		etiquetaCelular.setFont(fuenteDos);
		add(etiquetaCelular);


		contenidoProtector = new JTextField();
		contenidoProtector.setBounds(500, 320, 40, 20);
		add(contenidoProtector);
	


		botonAceptarQuiosco = new JButton("ACEPTAR");
		botonAceptarQuiosco.setForeground(java.awt.Color.decode("#97970D"));
		botonAceptarQuiosco.setBounds(300,380,100,40);
		botonAceptarQuiosco.setActionCommand("Segundo Boton");
		botonAceptarQuiosco.addActionListener(this);
		add(botonAceptarQuiosco);
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


    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }


	public void setEvento(Controller objetoControlador) {
	}

}
