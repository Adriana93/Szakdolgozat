package szakdolgozat.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;


public class Algorithm extends JFrame implements ActionListener{

	JFrame frame =new JFrame ();
/*	DefaultListModel<String> AlgModel = new DefaultListModel<String>();
	JList<String> AlgoritmusList = new JList<String>(AlgModel);
	JScrollPane scrollPane1 = new JScrollPane(AlgoritmusList);*/
	
	
	JList Algbox;
	JScrollPane listaPane = new JScrollPane(Algbox);
	Algorithm() {
		
		frame.setTitle("Algoritmusok gyûjteménye"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		//frame.setVisible(true);
        
		
		String[] lista = {"Johnson algoritmus", "Dannenberg", "Szomszédségkeresõ", "Palmer", "ötödik", "hatodik", "hetedik", "nyolcadik"};
		Algbox = new JList(lista);
	     listaPane.setBounds(100, 100, 100, 100);
		add(listaPane);				
 
		//setSize(800,600);
		setVisible(true);
		
		//scrollPane1.setPreferredSize(new Dimension(100, 200));
		/*AlgModel.addElement("");
		AlgModel.addElement("Dannenberg");
		AlgModel.addElement("Szomszédségkeresõ");
		AlgModel.addElement("Palmer");*/
 
		add(listaPane);
		add(Algbox);
		pack();
	//	setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
