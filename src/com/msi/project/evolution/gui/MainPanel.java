package com.msi.project.evolution.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	private MainWindow mainWindow ;
	private JPanel mainPanel;

	
	public MainPanel(MainWindow mw){
		mainWindow = mw ;
		
		initializeGUI();
	}

	private void initializeGUI() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3,1));
	
		// Image de bienvenue
		JLabel bienvenue = new JLabel(new ImageIcon("resources/bienvenue.jpg"));
		
		// Images CESI et PMI
		JPanel imgs = new JPanel(new GridLayout(1,2));
		imgs.add(new JLabel(new ImageIcon("resources/logoCesi.png")));
		imgs.add(new JLabel(new ImageIcon("resources/PMI.jpeg")));

		//Texte explicatif
		JPanel txtExplicatif = new JPanel();
		txtExplicatif.add(new JLabel("Pour accéder aux fonctions de l'application merci de bien vouloir utiliser le menu \"Fichier\". ",JLabel.CENTER));
		
		// AJout des parties
		mainPanel.add(bienvenue);
		mainPanel.add(imgs);
		mainPanel.add(txtExplicatif);
		
		
		this.add(mainPanel);
	}

}
