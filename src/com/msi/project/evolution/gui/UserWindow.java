package com.msi.project.evolution.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.msi.project.evolution.listener.CreationListener;

public class UserWindow extends JPanel {
	private MainWindow mainWindow ;
	private JPanel mainPanel;
	private JTextField nom;
	private JTextField prenom;
	private JTextField userID;
	private JCheckBox serviceInfo;
	private JComboBox<String> local;

	
	public UserWindow(MainWindow mw){
		mainWindow = mw ;
		initializeGUI();
	}


	private void initializeGUI() {
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(6,2));
		
		/* Initialisation des variables de classe */
		nom = new JTextField();
		prenom = new JTextField();
		userID = new JTextField();
		serviceInfo = new JCheckBox();
		String[] localStrings = { "A4", "B2", "C9", "K14", "E21" };
		local = new JComboBox<>(localStrings);
		
		/* Création des labels */
		JLabel labelNom = new JLabel("Nom");
		JLabel labelPrenom = new JLabel("Prénom");
		JLabel labelUserID = new JLabel("UserID");
		JLabel labelLocal = new JLabel("Local");
		JLabel labelServiceInfo = new JLabel("Membre du service informatique");
		
		/* Création des boutons */
		JButton btnValider = new JButton("Valider");
		JButton btnAnnuler = new JButton("Annuler");
		
		/* Listeners */
		CreationListener crLs = new CreationListener(mainWindow);
		
		btnValider.addActionListener(crLs);
		btnValider.setActionCommand("CreateUser");
		
		btnAnnuler.addActionListener(crLs);
		
		/* Ajout des éléments graphiques */
		mainPanel.add(labelNom);
		mainPanel.add(nom);
		mainPanel.add(labelPrenom);
		mainPanel.add(prenom);
		mainPanel.add(labelUserID);
		mainPanel.add(userID);
		mainPanel.add(labelLocal);
		mainPanel.add(local);
		mainPanel.add(labelServiceInfo);
		mainPanel.add(serviceInfo);
		
		mainPanel.add(btnValider);
		mainPanel.add(btnAnnuler);
		
		
		this.add(mainPanel);
				
		
	}
	
	
}
