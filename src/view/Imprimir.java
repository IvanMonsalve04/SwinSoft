package view;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Graphics;
import controll.Controller;
import modell.Operacion;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class Imprimir extends JPanel implements ActionListener {
    //Declaración de variables
    private BufferedImage ImagenDos;
    private CustomEvent evento;
    private JButton botonCierreCaja;
	private double valorRegistro;
	private double valorTotalPagar;
	private JTextArea contenidoValorTotal;
    private String resultadoVista;
	private JLabel etiquetaFactura; 
	private Font fuente;
    private Operacion objetoOperaciones;
	private Controller objetoControlador;
	private JTextArea saludo;

    //Método Constructor
    public Imprimir() {
		setLayout(null);
        objetoOperaciones = new Operacion();
		objetoControlador = new Controller();
		fuente = new Font("Berlin Sans FB", Font.BOLD, 20);
		etiquetaFactura = new JLabel("VALOR TOTAL A PAGAR");
		etiquetaFactura.setForeground(java.awt.Color.decode("#97970D"));
		etiquetaFactura.setBounds(250, 120, 300, 100);
		etiquetaFactura.setFont(fuente);
		add(etiquetaFactura);

		contenidoValorTotal = new JTextArea(resultadoVista);
		contenidoValorTotal.setBounds(300, 200, 100, 50);
		add(contenidoValorTotal);

		saludo = new JTextArea("HOLA");
		saludo.setBounds(500, 280, 100, 50);

        botonCierreCaja = new JButton("Generar Factura");
		botonCierreCaja.setForeground(java.awt.Color.decode("#97970D"));
		botonCierreCaja.setBounds(275, 280, 150, 40);
		botonCierreCaja.setActionCommand("Segundo Boton");
		botonCierreCaja.addActionListener(this);
		add(botonCierreCaja);
    }

	//Gráficos de imagen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//exception  controlan el entorno
		try {
			ImagenDos = ImageIO.read(new File("src\\resources\\images\\FondoPanelTienda.jpg"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "IMAGEN NO ENCONTRADA ");
		}
		g.drawImage(ImagenDos, 0, 0, null);//movemos imagen
	}
	
	public void mostrarResultadoFactura(double resultadoFactura) {
		resultadoVista = Double.toString(resultadoFactura);
		
	}

	public CustomEvent getEvento() {
		return evento;
	}
	
	public void setEvento(CustomEvent evento) {
		this.evento = evento;
	}

	//Métodos propios
	@Override
	public void actionPerformed(ActionEvent e) {
		String sendData = "HOLA";
		evento.retornarCalculoFactura(sendData);
		//System.out.println( "El valor total a pagar por la factura es: " + resultadoVista);
		contenidoValorTotal.setText(resultadoVista);
	}	
}
