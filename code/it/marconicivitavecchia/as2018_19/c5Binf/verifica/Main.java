package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe
		super.setSize(400,700);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();

		// TODO Creare la stringa HTML per il wireframe
		
		// TODO Convertire lo StringBuilder in String
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println(htmlText);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

