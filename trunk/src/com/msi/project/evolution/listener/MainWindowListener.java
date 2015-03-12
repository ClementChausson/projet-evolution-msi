package com.msi.project.evolution.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.msi.project.evolution.gui.MainWindow;


public class MainWindowListener implements ActionListener{

	/** Main window **/
	private MainWindow window ;
	
	public MainWindowListener(MainWindow w){
		this.window = w ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String choix = e.getActionCommand();
		JOptionPane jop1 = new JOptionPane();
		
		// En fonction du choix du menu
		switch (choix) {
		case "CreateUser":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de créer un utlisateur", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "CreateLocal":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de créer un local", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "CreateScreen":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de créer un écran", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "CreatePrinter":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de créer une imprimante", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "CreatePoste":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de créer un poste", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "SearchUser":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de chercher un utlisateur", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "SearchPoste":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de chercher un poste", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "SearchLocal":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de chercher un local", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "SearchPrinter":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de chercher un écran", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "SearchScreen":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de chercher une imprimante", "Info", JOptionPane.INFORMATION_MESSAGE);
		case "Exit":
			Object[] options = { "Oui", "Non" };
			int rep = JOptionPane.showOptionDialog(window.getMainPanel(), "Souhaitez vous réellement fermer l'application ?", "Quitter l'application",
			JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
			null, options, options[0]);
			if (rep == 0){
				System.exit(0);
			}
		default :
		}
		
	}

}
