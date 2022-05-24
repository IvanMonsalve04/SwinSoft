package view;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

    private Operacion objetoOperaciones;

    //Método Constructor
    public Imprimir() {
		setLayout(null);
        objetoOperaciones = new Operacion();

        botonCierreCaja = new JButton("ACEPTAR");
		botonCierreCaja.setForeground(java.awt.Color.decode("#97970D"));
		botonCierreCaja.setBounds(300,380,100,40);
		botonCierreCaja.setActionCommand("Segundo Boton");
		botonCierreCaja.addActionListener(this);
		add(botonCierreCaja);
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
		// TODO Auto-generated method stub
		
	}

	public void setEvento(Controller objetoControlador) {
	}

    //Métodos propios

}
