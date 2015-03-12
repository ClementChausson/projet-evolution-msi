package com.msi.project.evolution.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.msi.project.evolution.listener.MainWindowListener;



public class MainWindow extends JFrame {
	private JPanel mainPanel;

	
	public MainWindow() {
		super("Code CENTRAL");
		initializeGUI();
		this.setResizable(false);
	}


	private void initializeGUI() {
		mainPanel = new MainPanel(this);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		
		/**
		 *  Création des menus et sous menus
		 */
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("Fichier");
		
		JMenu createSubMenu = new JMenu("Créer");
		JMenuItem userItem = new JMenuItem("Utilisateur");
		JMenuItem localItem = new JMenuItem("Local");
		JMenuItem screenItem = new JMenuItem("Ecran");
		JMenuItem printerItem = new JMenuItem("Imprimante");
		JMenuItem posteItem = new JMenuItem("Poste");
		createSubMenu.add(userItem);
		createSubMenu.add(localItem);
		createSubMenu.add(screenItem);
		createSubMenu.add(printerItem);
		createSubMenu.add(posteItem);

		
		JMenu searchSubMenu = new JMenu("Rechercher");
		JMenuItem userSearchItem = new JMenuItem("Utilisateur");
		JMenuItem localSearchItem = new JMenuItem("Local");
		JMenuItem screenSearchItem = new JMenuItem("Ecran");
		JMenuItem printerSearchItem = new JMenuItem("Imprimante");
		JMenuItem posteSearchItem = new JMenuItem("Imprimante");

		searchSubMenu.add(userSearchItem);
		searchSubMenu.add(localSearchItem);
		searchSubMenu.add(screenSearchItem);
		searchSubMenu.add(printerSearchItem);
		searchSubMenu.add(posteSearchItem);

		
		JMenuItem quitterMenuItem = new JMenuItem("Quitter");
		
		fileMenu.add(createSubMenu);
		fileMenu.add(searchSubMenu);
		fileMenu.add(quitterMenuItem);

		JMenu aProposMenu = new JMenu("?");
		JMenuItem aProposMenuItem = new JMenuItem("A propos...");
		
		aProposMenu.add(aProposMenuItem);
		
		menuBar.add(fileMenu);
		menuBar.add(aProposMenu);
		setJMenuBar(menuBar);
		
		
		/**
		 * Ajout des listeners
		 */
		MainWindowListener mWL = new MainWindowListener(this);
		
		userItem.addActionListener(mWL);
		userItem.setActionCommand("CreateUser");
		
		localItem.addActionListener(mWL);
		localItem.setActionCommand("CreateLocal");
		
		screenItem.addActionListener(mWL);
		screenItem.setActionCommand("CreateScreen");
		
		printerItem.addActionListener(mWL);
		printerItem.setActionCommand("CreatePrinter");
		
		posteItem.addActionListener(mWL);
		posteItem.setActionCommand("CreatePoste");
		
		userSearchItem.addActionListener(mWL);
		userSearchItem.setActionCommand("SearchUser");
		
		localSearchItem.addActionListener(mWL);
		localSearchItem.setActionCommand("SearchLocal");
		
		screenSearchItem.addActionListener(mWL);
		screenSearchItem.setActionCommand("SearchScreen");
		
		printerSearchItem.addActionListener(mWL);
		printerSearchItem.setActionCommand("SearchPrinter");
		
		printerSearchItem.addActionListener(mWL);
		printerSearchItem.setActionCommand("SearchPoste");
		
		quitterMenuItem.addActionListener(mWL);
		quitterMenuItem.setActionCommand("Exit");
		
		/**
		 * Affichage de la fenêtre
		 */
		this.pack();
		setResizable(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(1100, 600);
		centerWindow();
	}

	private void centerWindow() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}


	public JPanel getMainPanel() {
		return mainPanel;
	}


	public void setMainPanel(JPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	
	
}
