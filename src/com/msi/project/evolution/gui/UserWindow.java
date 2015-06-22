package com.msi.project.evolution.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserWindow extends JPanel {
	private MainWindow mainWindow ;
	private JPanel mainPanel;
	private JTextField nom;
	private JTextField prenom;
	private JTextField userID;
	private JCheckBox serviceInfo;

	
	public UserWindow(MainWindow mw){
		mainWindow = mw ;
		initializeGUI();
	}


	private void initializeGUI() {
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(5,2));
		
		/* Initialisation des variables de classe */
		nom = new JTextField();
		prenom = new JTextField();
		userID = new JTextField();
		serviceInfo = new JCheckBox();
		
		/* Création des labels */
		JLabel labelNom = new JLabel("Nom");
		JLabel labelPrenom = new JLabel("Prénom");
		JLabel labelUserID = new JLabel("UserID");
		JLabel labelServiceInfo = new JLabel("Membre du service informatique");
		
		/* Création des boutons */
		JButton btnValider = new JButton("Valider");
		JButton btnAnnuler = new JButton("Annuler");
		
		/* Ajout des éléments graphiques */
		mainPanel.add(labelNom);
		mainPanel.add(nom);
		mainPanel.add(labelPrenom);
		mainPanel.add(prenom);
		mainPanel.add(labelUserID);
		mainPanel.add(userID);
		mainPanel.add(labelServiceInfo);
		mainPanel.add(serviceInfo);
		
		mainPanel.add(btnValider);
		mainPanel.add(btnAnnuler);
		
		
		this.add(mainPanel);
				
		
	}
	
	
}
