package com.msi.project.evolution;

import java.awt.Frame;
import java.net.URL;


import com.msi.project.evolution.gui.MainWindow;
import com.msi.project.evolution.gui.SplashScreen;

public class Main {

	public static void main(String[] args) {
		URL imageURL = Main.class.getResource("/codeCENTRAL.jpg");
	    new SplashScreen(imageURL,new MainWindow(),2000);

	}

}
