package by.cmd;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Reader extends JFrame {
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	JButton b1, b2;
	JTextField t1, t2;
	JLabel l1, l2;
	int a;
	String b;
	eClick click = new eClick();
	
	public Reader (String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Save");
		b2 = new JButton("List");
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		l1 = new JLabel("Number:");
		l2 = new JLabel("Name:");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		b1.addActionListener(click);
		b2.addActionListener(click);
		
	}



	public class eClick implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
				if(e.getSource() == b1){					
					a = Integer.parseInt(t1.getText());
					b = t2.getText();
				
					mobiles.add(new Mobile(a, b));
					t1.setText("");
					t2.setText("");
				
					}
				if(e.getSource() == b2){
					for(Mobile m: mobiles){
						System.out.println(m.getNumber()+" "+m.getName());
					}
					t1.setText("");
					t2.setText("");
				}
				
				
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "¬ведите в поле число");}
		}
	}
}
