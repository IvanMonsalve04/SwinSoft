package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Graphics;
import java.awt.Font;
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
	private JLabel etiquetaTitulo;
	private JLabel etiquetaCantidad;

	
	private JLabel etiquetaIdenti;
	private JLabel etiquetaNiños;
	private JLabel etiquetaMayores;
	private JLabel resultado;


	public CuartoPanel(){




		resultadoVista = " ";
		setLayout(null);

		fuente = new Font("Berlin Sans FB", Font.BOLD, 20);
		fuenteDos = new Font("Berlin Sans FB", Font.BOLD, 13);

		etiquetaTitulo = new JLabel("BIENVENIDO AL QUIOSCO DE LA PISCINA");
		etiquetaTitulo.setBounds(300, 10, 400, 50);
		etiquetaTitulo.setFont(fuente);
		etiquetaTitulo.setForeground(java.awt.Color.decode("#0B2B7C"));
		add(etiquetaTitulo);

		etiquetaUno = new JLabel("PRODUCTO");
		etiquetaUno.setForeground(java.awt.Color.decode("#717137"));
		etiquetaUno.setBounds(110, 20, 300, 50);
		etiquetaUno.setFont(fuente);
		add(etiquetaUno);

		etiquetaCantidad = new JLabel("CANTIDAD");
		etiquetaCantidad.setBounds(400, 20, 200, 50);
		etiquetaCantidad.setForeground(java.awt.Color.decode("#717137"));
		etiquetaCantidad.setFont(fuente);
		add( etiquetaCantidad);


		etiquetaTraje = new JLabel("TRAJE DE BAÑO");
		etiquetaTraje.setBounds(120, 90, 200, 100);
		etiquetaTraje.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaTraje.setFont(fuenteDos);
		add(etiquetaTraje);

		contenidoTraje = new JTextField("");
		contenidoTraje.setBounds(420, 120, 40, 20);
		
		add(contenidoTraje);

		etiquetaDos = new JLabel("GAFAS DE SOL");
		etiquetaDos.setBounds(120, 70, 200, 200);
		etiquetaDos.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaDos.setFont(fuenteDos);
		add(etiquetaDos);

		contenidoGafasSol = new JTextField();
		contenidoGafasSol.setBounds(420, 160, 40, 20);
		add(contenidoGafasSol);
		
		etiquetaTres = new JLabel("ALETAS");
		etiquetaTres.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaTres.setBounds(120, 110, 200, 200);
		etiquetaTres.setFont(fuenteDos);
		add(etiquetaTres);

		contenidoAletas = new JTextField();
		contenidoAletas.setBounds(420, 200, 40, 20);
		add(contenidoAletas);

		etiquetaCuatro = new JLabel("GORROS DE PISCINA");
		etiquetaCuatro.setBounds(120, 150, 200, 200);
		etiquetaCuatro.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaCuatro.setFont(fuenteDos);
		add(etiquetaCuatro);

		contenidoGorros = new JTextField();
		contenidoGorros.setBounds(420, 240, 40, 20);
		add(contenidoGorros);

		etiquetaCinco = new JLabel("PROTECTOR SOLAR");
		etiquetaCinco.setBounds(120, 190, 280, 200);
		etiquetaCinco.setForeground(java.awt.Color.decode("#1E2A8C"));
		etiquetaCinco.setFont(fuenteDos);
		add(etiquetaCinco);

		contenidoProtector = new JTextField();
		contenidoProtector.setBounds(420, 280, 40, 20);
		add(contenidoProtector );

		etiquetaSeis = new JLabel("PROTECTOR CELULAR");
		etiquetaSeis.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaSeis.setBounds(120, 230, 400, 200);
		etiquetaSeis.setFont(fuenteDos);
		add(etiquetaSeis);

		contenidoProtector = new JTextField();
		contenidoProtector.setBounds(420, 320, 40, 20);
		add(contenidoProtector);

		







	}


     //Gráficos de imagen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//exception  controlan el entorno
		try {
			ImagenDos = ImageIO.read(new File("C:\\Users\\Acer\\Desktop\\uni\\programacion\\Proyecto final\\cierreCaja.jpg"));
			//ImagenDos = ImageIO.read(new File("C:\\Users\\ivan\\Downloads\\CierreCaja.jpeg"));
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
