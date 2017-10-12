/**
 * @author jrsimo
 *
 */
package com.jrsimo.di;

import javax.swing.JFrame;

public class VentanaSimple1 {
	
	public static void main(String[] arg) {
		JFrame f = new JFrame();
		f.setTitle("VentanaSimple1: Jose Ramon Simó");
		f.setSize(400, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		VentanaSimple1 ventanaSimple = new VentanaSimple1();
	}
}
