package com.msi.project.evolution.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.msi.project.evolution.gui.AboutWindow;
import com.msi.project.evolution.gui.LocalWindow;
import com.msi.project.evolution.gui.MainWindow;
import com.msi.project.evolution.gui.PrinterWindow;
import com.msi.project.evolution.gui.ScreenWindow;
import com.msi.project.evolution.gui.SearchWindow;
import com.msi.project.evolution.gui.UserWindow;
import com.msi.project.evolution.gui.WorkstationWindow;


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
			this.window.setMainPanel(new UserWindow(window));
			break ;
		case "CreateLocal":
			this.window.setMainPanel(new LocalWindow(window));			
			break ;
		case "CreateScreen":
			this.window.setMainPanel(new ScreenWindow(window));			
			break ;
		case "CreatePrinter":
			this.window.setMainPanel(new PrinterWindow(window));			
			break ;
		case "CreatePoste":
			this.window.setMainPanel(new WorkstationWindow(window));			
			break ;
		case "SearchUser":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de chercher un utilisateur", "Info", JOptionPane.INFORMATION_MESSAGE);
			break ;
		case "SearchPoste":
			this.window.setMainPanel(new SearchWindow(window));			
			break ;
		case "SearchLocal":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de chercher un local", "Info", JOptionPane.INFORMATION_MESSAGE);
			break ;
		case "SearchPrinter":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de chercher un écran", "Info", JOptionPane.INFORMATION_MESSAGE);
			break ;
		case "SearchScreen":
			jop1.showMessageDialog(window.getMainPanel(), "Vous avez choisi de chercher une imprimante", "Info", JOptionPane.INFORMATION_MESSAGE);
			break ;
		case "About":
			JFrame about = new AboutWindow();
			about.setVisible(true);
			break;
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
