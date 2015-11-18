package com.msi.project.evolution.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class SearchWindow extends JPanel {
	private MainWindow mainWindow ;
	private JPanel mainPanel;
	private JComboBox<String> reference ;
	private JComboBox<String> user;
	private JComboBox<String> disqueDur;
	private JComboBox<String> memoireVive;
	private JComboBox<String> ecran ;
	private JComboBox<String> local;
	private JList<String> listeResultat;
	private JTextArea detailResultat;
	private JSplitPane resultSet;

	public SearchWindow(MainWindow mw){
		mainWindow = mw ;
		initializeGUI();
	}
	
	
	private void initializeGUI() {
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(10,2));
		
		/* Initialisation des variables de classe */
		String[] posteString =  { "PST96AST", "PST50ERV", "PST23GIL", "PST456VOS", "PST13NOV" };
		reference = new JComboBox<String>(posteString);
		String[] nomsUsers = { "Jean Naimard" , "Alan Turing", "Alex Terieur", "Sarah Connor", "John Rambo"};
		user = new JComboBox<String>(nomsUsers);
		String[] disqueDursStrings = { "128 Go", "256 Go", "512 Go", "1 To", "2 To" };
		disqueDur = new JComboBox<String>(disqueDursStrings);
		String[] ramStrings = { "1 Go", "2 Go", "4 Go", "8 Go", "16 Go" };
		memoireVive = new JComboBox<String>(ramStrings);
		String[] ecranStrings = { "EK876GT", "HK750PL", "CD056RH", "NH959MG", "DF047NB" };
		ecran = new JComboBox<String>(ecranStrings);
		String[] localStrings = { "A4", "B2", "C9", "K14", "E21" };
		local = new JComboBox<String>(localStrings);
		
		/* Initialisation des variables de classe pour la visualisation de la recherche */
		JComponent leftComponent = new JList<String>(posteString);
		JComponent rightComponent = new JTextArea();
		resultSet = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftComponent, rightComponent);
		/*
JComponent topComponent = new JButton("Top Button");
JComponent bottomComponent = new JButton("Bottom Button");
JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topComponent, bottomComponent);*/
		
		/* Création des labels */
		JLabel labelReference = new JLabel("Référence : ");
		JLabel labelUser = new JLabel("Utilisateur :");
		JLabel LabelDisqueDur = new JLabel("Capacité du disque dur :");
		JLabel labelRam = new JLabel("Mémoire vive allouée :");
		JLabel labelEcran = new JLabel("Ecran associé");
		JLabel labelLocal = new JLabel("Emplacement du poste : ");
		
		/* Création des boutons */
		JButton btnRechercher = new JButton("Rechercher");
		JButton btnAnnuler = new JButton("Annuler");
		
		/* Ajout des éléments graphiques */
		mainPanel.add(labelReference);
		mainPanel.add(reference);
		mainPanel.add(labelUser);
		mainPanel.add(user);
		mainPanel.add(LabelDisqueDur);
		mainPanel.add(disqueDur);
		mainPanel.add(labelRam);
		mainPanel.add(memoireVive);
		mainPanel.add(labelEcran);
		mainPanel.add(ecran);
		mainPanel.add(labelLocal);
		mainPanel.add(local);
		
		mainPanel.add(btnRechercher);
		mainPanel.add(btnAnnuler);

		mainPanel.add(resultSet);
		
		this.add(mainPanel);
		
	}

}