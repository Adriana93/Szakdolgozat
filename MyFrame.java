package szakdolgozat.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JButton ProjektAdatButton = new JButton();
	JButton EroforrasAdatButton = new JButton();
	JButton HelpButton = new JButton();
	JButton ExportButton = new JButton();
	JButton DiagramButton = new JButton();
	JButton ModellButton = new JButton();
	JButton TaskButton = new JButton();
	JButton AlgButton = new JButton();
	JButton GantButton = new JButton();
	
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu exitMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	JMenuItem editItem;
	
	MyFrame() {	
		
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
	    fileMenu = new JMenu("Fájl");
		editMenu = new JMenu("Szerkesztés");
		exitMenu = new JMenu("Kilépés");
		
		loadItem =new JMenuItem("Betöltés");
	     saveItem =new JMenuItem("Mentes");
		 exitItem =new JMenuItem("Bezárás");
		 editItem =new JMenuItem("Háttérszín");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		editItem.addActionListener(this);
		
		loadItem.setMnemonic(KeyEvent.VK_L); //l for load
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		exitMenu.add(exitItem);
		editMenu.add(editItem);
	
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(exitMenu);
		
				
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,140));
		this.add(textField);
		
		
		
		ProjektAdatButton.setBounds(50, 50, 150, 50);
		ProjektAdatButton.addActionListener(this);
		ProjektAdatButton.setText("Projekt adatok beolvasás");
		
		EroforrasAdatButton.setBounds(50, 100, 150, 50);
		EroforrasAdatButton.addActionListener(this);
		EroforrasAdatButton.setText("Erõforrás beolvasás");
		
		HelpButton.setBounds(50, 450, 150, 50);
		HelpButton.addActionListener(this);
		HelpButton.setText("Segítség!");
		
		ExportButton.setBounds(50, 400, 150, 50);
		ExportButton.addActionListener(this);
		ExportButton.setText("Exportálás!");
		
		DiagramButton.setBounds(50, 250, 150, 50);
		DiagramButton.addActionListener(this);
		DiagramButton.setText("Diagram!");
		
		ModellButton.setBounds(50, 150, 150, 50);
		ModellButton.addActionListener(this);
		ModellButton.setText("Modell");
		
		TaskButton.setBounds(50, 200, 150, 50);
		TaskButton.addActionListener(this);
		TaskButton.setText("Feladat");
		
		AlgButton.setBounds(50, 300, 150, 50);
		AlgButton.addActionListener(this);
		AlgButton.setText("Algoitmus");
		
		
		GantButton.setBounds(50, 350, 150, 50);
		GantButton.addActionListener(this);
		GantButton.setText("Gant");
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.red);
		panel4.setBackground(Color.yellow);
		panel5.setBackground(Color.magenta);
		
	//	
		//JFrame frame = new JFrame();
		this.setTitle("szakdolgozat"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //bezaras gomb
		this.setLayout(null);
		//frame.setResizable(false); //meretezes lathatosag 
		this.setSize(420,420);		//size
		//ImageIcon = new ImageIcon("logo.png"); // create ikon
		//frame.setIconImag(image.getImage());// change  icon of frame
		this.getContentPane().setBackground(new Color(100,100,100)); //hatterszin
		this.setVisible(true); //lathatato
		this.add(ProjektAdatButton);
		this.add(EroforrasAdatButton);
		this.add(ModellButton);
		this.add(TaskButton);		
		this.add(DiagramButton);		
		this.add(AlgButton);
		this.add(GantButton);
		this.add(ExportButton);
		this.add(HelpButton);
		
		panel1.setPreferredSize(new Dimension(100,100));
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.WEST);
	}
		
		@Override
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource() == loadItem) {
			 System.out.println("fájl betöltés");
		 }
		 
		 if(e.getSource() == saveItem) {
			 System.out.println("mentés");
		 }
		 if(e.getSource() == exitItem) {
			 System.exit(0);
		 }
		 
		 if(e.getSource() == ProjektAdatButton) { 
			 
			 JFileChooser fileChooser =new JFileChooser();
			 int response = fileChooser.showOpenDialog(null);
			// System.out.println(fileChooser.showOpenDialog(null));
			 
			 if(response ==JFileChooser.APPROVE_OPTION) { 
				 File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				 System.out.println(file);
				 ArrayList<Job> job = new ArrayList<>();
					try 
					{
						System.setProperty("file.encoding", "UTF8");
						FileReader fajl = new FileReader("manufactoringSystem.txt");
						BufferedReader br = new BufferedReader(fajl);
						String sor = null;
						
						while((sor=br.readLine()) != null) {
							String[] darabok = sor.split(";");
							String id = darabok[0];
							String ProcT = darabok[1];
							String SartT = darabok[2];
							String EndT = darabok[3];
							String date = darabok[4];
							
							System.out.println("beolvastam"); //mûködik
						//	System.out.println(id);  //mûködik
						//	System.out.println(ProcT);
						}
						br.close();
					}
					
					catch(IOException e1)
					{	
						System.out.println("Sikertlen beolvasas" + e1);
				}
			 }
		 }
		 
		 if(e.getSource() == EroforrasAdatButton) { 
			 
			 JFileChooser fileChooser =new JFileChooser();
			 int response = fileChooser.showOpenDialog(null);
			 
			 if(response == JFileChooser.APPROVE_OPTION) { 
				 File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				 ArrayList<Job> eroforras = new ArrayList<>();
					try 
					{
						System.setProperty("file.encoding", "UTF8");
						FileReader fajl = new FileReader("eroforrasok.txt");
						BufferedReader br = new BufferedReader(fajl);
						String sor = null;
						
						while((sor=br.readLine()) != null) {
							String[] darabok = sor.split(";");
							String id = darabok[0];
							String ProcT = darabok[1];
							String SartT = darabok[2];
							String EndT = darabok[3];
							String date = darabok[4];
							
							System.out.println("beolvastva "); //mûködik
						//	System.out.println(id);  //mûködik
						//	System.out.println(ProcT);
						}
						br.close();
					}
					
					catch(IOException e1)
					{	
						System.out.println("Sikertlen beolvasas" + e1);
				}
			 }
			 
		
			 }
			
		 
		 
 if(e.getSource() == ExportButton) { 
			 
			 JFileChooser fileChooser1 =new JFileChooser();
			 fileChooser1.setCurrentDirectory(new File("."));
			 int response = fileChooser1.showSaveDialog(null);
			 
			 if(response == JFileChooser.APPROVE_OPTION) { 
				 File file = new File(fileChooser1.getSelectedFile().getAbsolutePath());
				 System.out.println(file);
			 }
		 }
 
 if(e.getSource() == editItem) { 
	 
	 JColorChooser colorChooser =new JColorChooser();
	 
	 Color color = JColorChooser.showDialog(null, "Válassz egy szint", Color.gray);
	 
	 this.getContentPane().setBackground(color);
		 
	 }

 if(e.getSource() == HelpButton) { 
	 new Help();
	 		 
	 }

 if(e.getSource() == TaskButton) { 
	 new Scheduler();
	 		 
	 }
 if(e.getSource() == AlgButton) { 
	 new Algorithm();
	 		 
	 }
 	 }
		
		}
		
	
	



