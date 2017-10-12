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

public class ConvertidorCelsius extends JFrame implements ActionListener{

	JTextField tfValorCelsius;
	JLabel lblCelsius;
	JLabel lblValorNuevo;
	JLabel lblFahrenheit;
	JButton btnConvertir;
	
	public ConvertidorCelsius() {
		iniciarGUI();
	}

	public void iniciarGUI() {
		setLayout(null);
		
		tfValorCelsius= new JTextField("0");
		lblCelsius = new JLabel("Celsius");
		lblValorNuevo = new JLabel("32");
		lblFahrenheit = new JLabel("Fahrenheit");
		btnConvertir = new JButton("Convertir");
		
		tfValorCelsius.setBounds(10, 10, 90, 30);
		lblCelsius.setBounds(160, 10, 60, 30);
		btnConvertir.setBounds(10, 50, 90, 30);
		lblValorNuevo.setBounds(120,50,40,30);
		lblFahrenheit.setBounds(160,50,60,30);
		
		add(tfValorCelsius);
		add(lblCelsius);
		add(btnConvertir);
		add(lblValorNuevo);
		add(lblFahrenheit);

		btnConvertir.addActionListener(this);
		
		setSize(300,150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	@Override
	public void actionPerformed (ActionEvent evento) {
	
		String strCelsius = tfValorCelsius.getText();
		int valorCelsius = Integer.parseInt(strCelsius);
		
		double valorFahrenheit = valorCelsius*9/5 + 32;
		lblValorNuevo.setText(valorFahrenheit+"");	
	}

	public static void main(String[] args) {
		new ConvertidorCelsius();
	}

}