package szakdolgozat.gui;

import javax.swing.JFrame;

public class Help {
	
	JFrame frame =new JFrame ();

	//label = new JLabel("ddgd");
		
	Help(){
		
		
		//label.setBounds(0, 0, 100, 50);
		//label.setFront(new Front(null, Font.PLAIN, 25));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		System.out.printf("%tH\n", java.util.Calendar.getInstance());
		
		
	}

}
