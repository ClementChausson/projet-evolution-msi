package com.msi.project.evolution.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class AboutWindow extends JFrame{
	private JPanel mainPanel;
	

	
	public AboutWindow(){
		super("A propos de Code CENTRAL");
		initializeGUI();
		this.setResizable(false);
	}

	private void initializeGUI() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 1));
		
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("resources/codeCENTRAL-about.jpg"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			mainPanel.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JPanel texte = new JPanel();
		texte.setLayout(new GridLayout(2, 1));
		texte.add(new JLabel ("BARRACO - CHAUSSON - DAPORTA - FLECHEUX",JLabel.CENTER));
		texte.add(new JLabel("Copyright 2014 - 2016",JLabel.CENTER));
		
		mainPanel.add(texte,BorderLayout.CENTER);
		
		
		/**
		 * Affichage de la fenêtre
		 */
		this.add(mainPanel);
		this.pack();
		setSize(400, 320);
		centerWindow();
		
	}
	
	private void centerWindow() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}

}
