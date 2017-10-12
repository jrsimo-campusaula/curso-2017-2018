/**
 * @author jrsimo
 *
 */

package com.jrsimo.di;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ContadorMejorado extends JFrame implements ActionListener{

	JLabel lblContador;
	JTextField tfContador;
	JButton botonSuma;
	JButton botonResta;
	JButton botonReset;
	
	public ContadorMejorado() {
		iniciarGUI();
	}

	public void iniciarGUI() {
		setLayout(null);
		
		// Creo la etiqueta "Contador"
		lblContador = new JLabel("Contador: ");
	
		// Creo el campo de texto para visualizar el contador
		tfContador = new JTextField(20);
		tfContador.setText("0");
		
		// Creo los botones
		botonSuma = new JButton("+");
		botonResta = new JButton("-");
		botonReset = new JButton("Reset");
		
		// Indico el lugar de los componentes que voy a poner en la ventana
		lblContador.setBounds(10, 10, 60, 30);
		tfContador.setBounds(70, 10, 100, 30);
		botonSuma.setBounds(180, 10, 50, 30);
		botonResta.setBounds(240, 10, 50, 30);
		botonReset.setBounds(300, 10, 80, 30);
		
		// Añado los componentes a la ventana
		add(lblContador);
		add(tfContador);
		add(botonSuma);
		add(botonResta);
		add(botonReset);

		botonSuma.addActionListener(this);
		botonSuma.setActionCommand("botonSuma");
		
		botonResta.addActionListener(this);
		botonResta.setActionCommand("botonResta");
		
		botonReset.addActionListener(this);
		botonReset.setActionCommand("botonReset");
		
		setSize(400,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	@Override
	public void actionPerformed (ActionEvent evento) {
	
		String textoActual = tfContador.getText();
		int contador = Integer.parseInt(textoActual);
		
		if(evento.getActionCommand().equals("botonSuma"))
		{
			contador++;	
		}
		else if(evento.getActionCommand().equals("botonResta"))
		{
			contador--;
			
			if(contador < 0) 
				contador = 0;	// No puede tener valores negativos el contador
		}
		else if(evento.getActionCommand().equals("botonReset"))
		{
			contador = 0;
		}
		
		tfContador.setText(contador+"");		

	}

	public static void main(String[] args) {

		new ContadorMejorado();
	}

}
