package com.msi.project.evolution.gui;

import java.awt.BorderLayout;

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
		mainPanel.setLayout(new BorderLayout());
	
		mainPanel.add(new JLabel("Bienvenue"));

		this.add(mainPanel);
	}

}
