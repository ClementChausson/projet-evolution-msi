package com.msi.project.evolution.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import com.msi.project.evolution.listener.CreationListener;

public class SearchWindow extends JPanel 
{
	private MainWindow mainWindow ;
	private JPanel mainPanel;
	private JPanel panelSplitPane ;
	private JComboBox<String> reference ;
	private JComboBox<String> user;
	private JComboBox<String> disqueDur;
	private JComboBox<String> memoireVive;
	private JComboBox<String> ecran ;
	private JComboBox<String> local;
	private JComboBox<String> printer;
	private JSplitPane resultSet;
	private JComponent leftComponent ;
	private JComponent rightComponent ;

	public SearchWindow(MainWindow mw)
	{
		mainWindow = mw ;
		initializeGUI();
	}
	
	private void initializeGUI() 
	{
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		/* Création des JPanels intermédiaires */
		JPanel panelLabels = new JPanel(new GridLayout(7,2));
		JPanel panelButtons = new JPanel (new GridLayout(1,2));
		panelSplitPane = new JPanel(new BorderLayout());
		
		/* Initialisation des variables de classe */
		String[] posteString =  { "-","PST96AST", "PST50ERV", "PST23GIL", "PST456VOS", "PST13NOV" };
		reference = new JComboBox<String>(posteString);
		String[] nomsUsers = { "-","Jean Naimard" , "Alan Turing", "Alex Terieur", "Sarah Connor", "John Rambo"};
		user = new JComboBox<String>(nomsUsers);
		String[] disqueDursStrings = { "-","128 Go", "256 Go", "512 Go", "1 To", "2 To" };
		disqueDur = new JComboBox<String>(disqueDursStrings);
		String[] ramStrings = { "-","1 Go", "2 Go", "4 Go", "8 Go", "16 Go" };
		memoireVive = new JComboBox<String>(ramStrings);
		String[] ecranStrings = { "-","EK876GT", "HK750PL", "CD056RH", "NH959MG", "DF047NB" };
		ecran = new JComboBox<String>(ecranStrings);
		String[] localStrings = { "-","A4", "B2", "C9", "K14", "E21" };
		local = new JComboBox<String>(localStrings);
		String[] printerStrings = { "-","CAN345", "HP869I", "EPS124", "BRO345","SAM019"};
		printer = new JComboBox<String>(printerStrings);
		
		final String[] configWorkstation = {
				"Poste : PST96AST" + '\n' + '\r' +  "Utilisateur : Jean Naimard"+ '\n' + '\r' + "Disque Dur : 128 Go"+ '\n' + '\r' + "Mémoire Vive : 1 Go"+ '\n' + '\r' + "Ecran : EK876GT"+ '\n' + '\r' + "Local : A4"+ '\n' + '\r' + "Imprimante : CAN345",
				"Poste : PST50ERV"+ '\n' + '\r' + "Utilisateur : Alan Turing"+ '\n' + '\r' + "Disque Dur : 256 Go"+ '\n' + '\r' + "Mémoire Vive : 2 Go"+ '\n' + '\r' +"Ecran : HK750PL"+ '\n' + '\r' + "Local : B2"+ '\n' + '\r' + "Imprimante : HP869I",
				"Poste : PST23GIL"+ '\n' + '\r' + "Utilisateur : Alex Terieur"+ '\n' + '\r' + "Disque Dur : 512 Go"+ '\n' + '\r' + "Mémoire Vive : 4 Go"+ '\n' + '\r' + "Ecran : CD056RH"+ '\n' + '\r' + "Local : C9"+ '\n' + '\r' + "Imprimante : EPS124",
				"Poste : PST456VOS"+ '\n' + '\r' + "Utilisateur : Sarah Connor"+ '\n' + '\r' + "Disque Dur : 1 To"+ '\n' + '\r' + "Mémoire Vive : 8 Go"+ '\n' + '\r' + "Ecran : NH959MG"+ '\n' + '\r' + "Local : K14"+ '\n' + '\r' + "Imprimante : BRO345",
				"Poste : PST13NOV"+ '\n' + '\r' + "Utilisateur : John Rambo"+ '\n' + '\r' + "Disque Dur : 2 To"+ '\n' + '\r' + "Mémoire Vive : 16 Go"+ '\n' + '\r' + "Ecran : DF047NB"+ '\n' + '\r' + "Local : E21"+ '\n' + '\r' + "Imprimante : SAM019"};
		
		/* Initialisation des variables de classe pour la visualisation de la recherche */
		final String[] postesExistants =  { "PST96AST", "PST50ERV", "PST23GIL", "PST456VOS", "PST13NOV" };
		leftComponent = new JList<String>(postesExistants);
		rightComponent = new JTextArea();
		resultSet = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftComponent, rightComponent);
		resultSet.setPreferredSize(new  Dimension(300, 200));
		resultSet.setEnabled( false );
		panelSplitPane.add(resultSet);
		
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
		
		/* Listeners */
		CreationListener crLs = new CreationListener(mainWindow);
		
		btnAnnuler.addActionListener(crLs);
		
		/* Ajout des éléments graphiques */
		panelLabels.add(labelReference);
		panelLabels.add(reference);
		panelLabels.add(labelUser);
		panelLabels.add(user);
		panelLabels.add(LabelDisqueDur);
		panelLabels.add(disqueDur);
		panelLabels.add(labelRam);
		panelLabels.add(memoireVive);
		panelLabels.add(labelEcran);
		panelLabels.add(ecran);
		panelLabels.add(labelLocal);
		panelLabels.add(local);
		panelLabels.add(labelPrinter);
		panelLabels.add(printer);
		
		panelButtons.add(btnRechercher);
		panelButtons.add(btnAnnuler);
		
		mainPanel.add(panelLabels);
		mainPanel.add(panelButtons);
		
		this.add(mainPanel);
		
		btnRechercher.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent evt)
			{
				mainPanel.add(panelSplitPane);
				mainPanel.revalidate();
				mainPanel.repaint();

				
			}
		});
		
		leftComponent.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent evt)
			{
				JList leftComponent = (JList)evt.getSource();
				
				if(evt.getClickCount()==1)
				{
					int index = leftComponent.locationToIndex(evt.getPoint());
					((JTextArea) rightComponent).setText(configWorkstation[index]);
				}
			}
		});
	}
}