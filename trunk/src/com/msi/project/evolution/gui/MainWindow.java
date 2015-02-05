package com.msi.project.evolution.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;



public class MainWindow extends JFrame {
	private JPanel mainPanel;

	
	public MainWindow() {
		super("Code CENTRAL");
		initializeGUI();
		this.setResizable(false);
	}


	private void initializeGUI() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		this.pack();
		setResizable(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(800, 500);
		centerWindow();
	}

	private void centerWindow() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
}
