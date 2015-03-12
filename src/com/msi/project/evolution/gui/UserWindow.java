package com.msi.project.evolution.gui;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserWindow extends JFrame {
	private JPanel mainPanel;
	private JTextField nom;
	private JTextField prenom;
	private JTextField UserID;
	private JTextField serviceInfo;

	
	public UserWindow() {
		initializeGUI();
		this.setResizable(false);
	}


	private void initializeGUI() {
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		JLabel labelNom = new JLabel("Nom");
		JLabel labelPrenom = new JLabel("Prénom");
		JLabel labelUserID = new JLabel("UserID");
		JLabel labelServiceInfo = new JLabel("Membre du service informatique");
	}
}
