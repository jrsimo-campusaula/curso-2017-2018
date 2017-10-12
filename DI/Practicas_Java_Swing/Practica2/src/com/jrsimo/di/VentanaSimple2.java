/**
 * @author jrsimo
 *
 */
package com.jrsimo.di;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class VentanaSimple2 extends JFrame {

	public VentanaSimple2() {
		iniciarGUI();
	}
	
	public void iniciarGUI() {
		setTitle("VentanaSimple2: Jose Ramon Simó");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension d = toolkit.getScreenSize();
		setSize(d.width/2, d.height/2);
		int puntoMedio =( d.width-d.width/2)/2;
		setLocation(puntoMedio,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] arg) {
		new VentanaSimple2();

	}
}