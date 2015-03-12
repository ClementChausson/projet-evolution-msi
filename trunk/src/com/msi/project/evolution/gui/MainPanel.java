package com.msi.project.evolution.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	private MainWindow mainWindow ;
	
	public MainPanel(MainWindow mw){
		mainWindow = mw ;
		
		setLayout(new BorderLayout());
	}

}
