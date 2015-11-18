package com.msi.project.evolution.gui;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class SearchWindow extends JPanel 
{
	private MainWindow mainWindow ;
	private JPanel mainPanel;
	private JComboBox<String> reference ;
	private JComboBox<String> user;
	private JComboBox<String> disqueDur;
	private JComboBox<String> memoireVive;
	private JComboBox<String> ecran ;
	private JComboBox<String> local;
	private JComboBox<String> printer;
	private JSplitPane resultSet;

	public SearchWindow(MainWindow mw)
	{
		mainWindow = mw ;
		initializeGUI();
	}
	
	private void initializeGUI() 
	{
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(12,2));
		
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
		String[] printerStrings = { "CAN345", "HP869I", "EPS124", "BRO345","SAM019"};
		printer = new JComboBox<String>(printerStrings);
		
		final String[] configWorkstation = {
				"Poste : PST96AST; Utilisateur : Jean Naimard; Disque Dur : 128 Go; Mémoire Vive : 1 Go; Ecran : EK876GT; Local : A4; Imprimante : CAN345;",
				"Poste : PST50ERV; Utilisateur : Alan Turing; Disque Dur : 256 Go; Mémoire Vive : 2 Go; Ecran : HK750PL; Local : B2; Imprimante : HP869I;",
				"Poste : PST23GIL; Utilisateur : Alex Terieur; Disque Dur : 512 Go; Mémoire Vive : 4 Go; Ecran : CD056RH; Local : C9; Imprimante : EPS124;",
				"Poste : PST456VOS; Utilisateur : Sarah Connor; Disque Dur : 1 To; Mémoire Vive : 8 Go; Ecran : NH959MG; Local : K14; Imprimante : BRO345;",
				"Poste : PST13NOV; Utilisateur : John Rambo; Disque Dur : 2 To; Mémoire Vive : 16 Go; Ecran : DF047NB; Local : E21; Imprimante : SAM019;"};
		
		/* Initialisation des variables de classe pour la visualisation de la recherche */
		JComponent leftComponent = new JList<String>(posteString);
		final JComponent rightComponent = new JTextArea();
		resultSet = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftComponent, rightComponent);
		
		/* Création des labels */
		JLabel labelReference = new JLabel("Référence du poste : ");
		JLabel labelUser = new JLabel("Utilisateur :");
		JLabel LabelDisqueDur = new JLabel("Capacité du disque dur :");
		JLabel labelRam = new JLabel("Mémoire vive allouée :");
		JLabel labelEcran = new JLabel("Ecran associé :");
		JLabel labelPrinter = new JLabel("Imprimante associée :");
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
		mainPanel.add(labelPrinter);
		mainPanel.add(printer);
		
		mainPanel.add(btnRechercher);
		mainPanel.add(btnAnnuler);

		mainPanel.add(resultSet);
		
		this.add(mainPanel);
		
		leftComponent.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent evt)
			{
				JList leftComponent = (JList)evt.getSource();
				
				if(evt.getClickCount()==1)
				{
					int index = leftComponent.locationToIndex(evt.getPoint());
					System.out.println(configWorkstation[index]); 
					((JTextArea) rightComponent).append(configWorkstation[index]);
				}
			}
		});
	}
}