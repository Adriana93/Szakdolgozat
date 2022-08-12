package szakdolgozat.gui;

import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import ProjektPlanning.RandomNumbers;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;
import java.util.Calendar;


public class Gui {
	
		
	public static void main(String args[]) {
		System.out.printf("%tH\n", java.util.Calendar.getInstance());
		
	

	/*	EventQueue.invokeLater(new Runnable()  {
				public void run() {
			try {
			Gui frame = new Gui();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};*/
		ManufactoringSystem msystem = new ManufactoringSystem();
		Simulation sim = new Simulation();
		
		
		new MyFrame();
	
			System.out.println(Simulation.create_and_load_job_data( 0, 0));
			//System.out.println("projektek");
		//for (int =0; i< projektek.size(); i++)
			//System.out.println(Tjob.NR);
		//	System.out.println(Tjob.NJ);
			//Create_job_data frame = new MyFrame;
	
	
	/*public Create_job_data() {
		 return true;
}*/
}

}



