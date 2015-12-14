package com.msi.project.evolution.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.msi.project.evolution.listener.CreationListener;

public class LocalWindow extends JPanel {
	private MainWindow mainWindow ;
	private JPanel mainPanel;
	private JTextField nomBatiment;
	private JTextField adresseBatiment;
	private JTextArea descriptionBatiment;

	
	public LocalWindow(MainWindow mw){
		mainWindow = mw ;
		initializeGUI();
	}


	private void initializeGUI() {
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(4,2));
		
		/* Initialisation des variables de classe */
		nomBatiment = new JTextField();
		adresseBatiment = new JTextField();
		descriptionBatiment = new JTextArea();
		
		/* Création des labels */
		JLabel labelNom = new JLabel("Nom du batiment");
		JLabel labelAdresse = new JLabel("Adresse");
		JLabel labelDescription = new JLabel("Description");
		
		
		/* Création des boutons */
		JButton btnValider = new JButton("Valider");
		JButton btnAnnuler = new JButton("Annuler");
		
		/* Listeners */
		CreationListener crLs = new CreationListener(mainWindow);
		
		btnValider.addActionListener(crLs);
		btnValider.setActionCommand("CreateLocal");
		
		btnAnnuler.addActionListener(crLs);
		
		/* Ajout des éléments graphiques */
		mainPanel.add(labelNom);
		mainPanel.add(nomBatiment);
		mainPanel.add(labelAdresse);
		mainPanel.add(adresseBatiment);
		mainPanel.add(labelDescription);
		mainPanel.add(descriptionBatiment);

		
		mainPanel.add(btnValider);
		mainPanel.add(btnAnnuler);
		
		
		this.add(mainPanel);
				
		
	}
	
	
}

