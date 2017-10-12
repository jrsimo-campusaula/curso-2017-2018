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

public class Contador extends JFrame implements ActionListener{

	JLabel lblContador;
	JTextField tfContador;
	JButton botonSuma;
	
	public Contador() {
		iniciarGUI();
	}

	public void iniciarGUI() {
		setLayout(null);

		lblContador = new JLabel("Contador: ");
		tfContador = new JTextField(20);
		tfContador.setText("0");
		botonSuma = new JButton("+");
		
		lblContador.setBounds(10, 10, 60, 20);
		tfContador.setBounds(100, 10, 60, 20);
		botonSuma.setBounds(180, 10, 60, 20);
		add(lblContador);
		add(tfContador);
		add(botonSuma);
		botonSuma.addActionListener(this);
		
		botonSuma.setActionCommand("btnSuma");
		
		setSize(600,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	@Override
	public void actionPerformed (ActionEvent evento) {
	
		String s = tfContador.getText();
		int n = Integer.parseInt(s);
		
		tfContador.setText(n+1+"");		
	}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Contador();
	}
*/
}
