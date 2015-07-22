package com.msi.project.evolution.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WorkstationWindow extends JPanel {
	private MainWindow mainWindow ;
	private JPanel mainPanel;
	private JTextField reference ;
	private JComboBox<String>  user;
	private JComboBox<String> disqueDur;
	private JComboBox<String> memoireVive;
	private JComboBox<String> ecran ;
	private JComboBox<String> local;

	
	public WorkstationWindow(MainWindow mw){
		mainWindow = mw ;
		initializeGUI();
	}


	private void initializeGUI() {
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(7,2));
		
		/* Initialisation des variables de classe */
		reference = new JTextField();
		String[] nomsUsers = { "Jean Naimard" , "Alan Turing", "Alex Terieur", "Sarah Connor", "John Rambo"};
		user = new JComboBox<String>(nomsUsers);
		String[] disqueDursStrings = { "128 Go", "256 Go", "512 Go", "1 To", "2 To" };
		disqueDur = new JComboBox<>(disqueDursStrings);
		String[] ramStrings = { "1 Go", "2 Go", "4 Go", "8 Go", "16 Go" };
		memoireVive = new JComboBox<>(ramStrings);
		String[] ecranStrings = { "EK876GT", "HK750PL", "CD056RH", "NH959MG", "DF047NB" };
		ecran = new JComboBox<>(ecranStrings);
		String[] localStrings = { "A4", "B2", "C9", "K14", "E21" };
		local = new JComboBox<>(localStrings);
		
		/* Création des labels */
		JLabel labelReference = new JLabel("Référence : ");
		JLabel labelUser = new JLabel("Utilisateur :");
		JLabel LabelDisqueDur = new JLabel("Capacité du disque dur :");
		JLabel labelRam = new JLabel("Mémoire vive allouée :");
		JLabel labelEcran = new JLabel("Ecran associé");
		JLabel labelLocal = new JLabel("Emplacement du poste : ");
		
		/* Création des boutons */
		JButton btnValider = new JButton("Valider");
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
		
		mainPanel.add(btnValider);
		mainPanel.add(btnAnnuler);
		
		
		this.add(mainPanel);
				
		
	}
	
	
}

