package com.msi.project.evolution.gui;

import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.msi.project.evolution.listener.CreationListener;

public class PrinterWindow extends JPanel {
	private MainWindow mainWindow ;
	private JPanel mainPanel;
	private JTextField referenceImprimante;
	private JComboBox<String> marqueImprimante;

	
	public PrinterWindow(MainWindow mw){
		mainWindow = mw ;
		initializeGUI();
	}


	private void initializeGUI() {
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3,2));
		
		/* Initialisation des variables de classe */
		referenceImprimante = new JTextField();
		String[] marquesImprimante  = { "CANON", "HP", "EPSON", "BROTHER","SAMSUNG"};
		Arrays.sort(marquesImprimante);
		marqueImprimante = new JComboBox<>(marquesImprimante);
		
		/* Création des labels */
		JLabel labelReference = new JLabel("Réference :");
		JLabel labelMarque = new JLabel("Marque");
		
		
		/* Création des boutons */
		JButton btnValider = new JButton("Valider");
		JButton btnAnnuler = new JButton("Annuler");
		
		/* Listeners */
		CreationListener crLs = new CreationListener(mainWindow);
		
		btnValider.addActionListener(crLs);
		btnValider.setActionCommand("CreatePrinter");
		
		btnAnnuler.addActionListener(crLs);
		
		/* Ajout des éléments graphiques */
		mainPanel.add(labelReference);
		mainPanel.add(referenceImprimante);
		mainPanel.add(labelMarque);
		mainPanel.add(marqueImprimante);


		
		mainPanel.add(btnValider);
		mainPanel.add(btnAnnuler);
		
		
		this.add(mainPanel);
				
		
	}
	
}	
