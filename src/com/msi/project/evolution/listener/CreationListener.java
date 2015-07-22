package com.msi.project.evolution.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.msi.project.evolution.gui.LocalWindow;
import com.msi.project.evolution.gui.MainPanel;
import com.msi.project.evolution.gui.MainWindow;
import com.msi.project.evolution.gui.PrinterWindow;
import com.msi.project.evolution.gui.ScreenWindow;
import com.msi.project.evolution.gui.UserWindow;
import com.msi.project.evolution.gui.WorkstationWindow;

public class CreationListener implements ActionListener{

	/** Main window **/
	private MainWindow window ;
	
	public CreationListener(MainWindow w){
		this.window = w ;
	}
	
	public void actionPerformed(ActionEvent e) {
		String choix = e.getActionCommand();
		JOptionPane jop1 = new JOptionPane();
		
		// En fonction du choix du menu
		switch (choix) {
		case "CreateUser":
			jop1.showMessageDialog(window.getMainPanel(), "Utilisateur créé avec succès !", "Info", JOptionPane.INFORMATION_MESSAGE);
			break ;
		case "CreateLocal":
			jop1.showMessageDialog(window.getMainPanel(), "Local créé avec succès !", "Info", JOptionPane.INFORMATION_MESSAGE);
			break ;
		case "CreateScreen":
			jop1.showMessageDialog(window.getMainPanel(), "Ecran créé avec succès !", "Info", JOptionPane.INFORMATION_MESSAGE);
			break ;
		case "CreatePrinter":
			jop1.showMessageDialog(window.getMainPanel(), "Imprimante créée avec succès !", "Info", JOptionPane.INFORMATION_MESSAGE);
			break ;
		case "CreatePoste":
			jop1.showMessageDialog(window.getMainPanel(), "Poste créé avec succès !", "Info", JOptionPane.INFORMATION_MESSAGE);
			break ;
		}
		
		this.window.setMainPanel(new MainPanel(window));			

		
	}

}
