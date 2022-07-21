package szakdolgozat.gui;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;


public class Gui {
	
		
	public static void main(String args[]) {
		
		//ProgressBar demo = new ProgressBar();
		
		new MyFrame();
		//LaunchPage launchPage= new LaunchPage();
		//	new LaunchPage();
		
		ArrayList<Projekt> projektek = new ArrayList<>();
		try 
		{
			System.setProperty("file.encoding", "UTF8");
			FileReader fajl = new FileReader("projekt.txt");
			BufferedReader br = new BufferedReader(fajl);
			String sor = null;
			
			while((sor=br.readLine()) != null) {
				String[] darabok = sor.split(";");
				String projektId= darabok[0];
				String indulasi_muv_ido = darabok[1];
				String befejezesi_muv_ido = darabok[2];
				String eroforras = darabok[3];
				
				//peldanyositas
			//	Projekt k = new Projekt(projektId,indulasi_muv_ido,eroforras);
				//projektek.add(k);
			}
			br.close();
		}
		
		catch(IOException e)
		{	
			System.out.println("Sikertlen beolvasas" + e);
	}
		
		
			System.out.println("projektek");
		//for (int =0; i< projektek.size(); i++)
	}
	
}






