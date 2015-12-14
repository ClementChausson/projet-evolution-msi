package com.msi.project.evolution.gui;

import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.msi.project.evolution.listener.CreationListener;

public class ScreenWindow extends JPanel {
	private MainWindow mainWindow ;
	private JPanel mainPanel;
	private JTextField referenceEcran;
	private JComboBox<String> marqueEcran;

	
	public ScreenWindow(MainWindow mw){
		mainWindow = mw ;
		initializeGUI();
	}


	private void initializeGUI() {
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3,2));
		
		/* Initialisation des variables de classe */
		referenceEcran = new JTextField();
		String[] marquesEcran  = { "DELL", "HP", "ASUS", "ACER", "APPLE", "LG", "SAMSUNG","IIYAMA" };
		Arrays.sort(marquesEcran);
		marqueEcran = new JComboBox<>(marquesEcran);
		
		/* Création des labels */
		JLabel labelReference = new JLabel("Réference :");
		JLabel labelMarque = new JLabel("Marque");
		
		
		/* Création des boutons */
		JButton btnValider = new JButton("Valider");
		JButton btnAnnuler = new JButton("Annuler");
		
		/* Listeners */
		CreationListener crLs = new CreationListener(mainWindow);
		
		btnValider.addActionListener(crLs);
		btnValider.setActionCommand("CreateScreen");
		
		btnAnnuler.addActionListener(crLs);
		
		/* Ajout des éléments graphiques */
		mainPanel.add(labelReference);
		mainPanel.add(referenceEcran);
		mainPanel.add(labelMarque);
		mainPanel.add(marqueEcran);


		
		mainPanel.add(btnValider);
		mainPanel.add(btnAnnuler);
		
		
		this.add(mainPanel);
				
		
	}
	
	
}