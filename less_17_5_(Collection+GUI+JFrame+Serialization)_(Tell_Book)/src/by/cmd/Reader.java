package by.cmd;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Formatter;

import javax.swing.*;
import javax.swing.JOptionPane;

public class Reader extends JFrame {
	static SerializationDeserialization sd = new SerializationDeserialization();
	static Formatter x;
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	JButton b1, b2, b3;
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
		b3 = new JButton("Save to file");
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
		add(b3);
		b1.addActionListener(click);
		b2.addActionListener(click);
		b3.addActionListener(click);
	}
	public class eClick implements ActionListener{
		@SuppressWarnings("unchecked")
		public void actionPerformed(ActionEvent e) {
			try{
				mobiles = (ArrayList<Mobile>) sd.deserData("TellBook");
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
					x.close();
					t1.setText("");
					t2.setText("");
				}				
				if(e.getSource() == b3){
					x = new Formatter("res//TellBook.txt");
					for(Mobile m: mobiles){						
						x.format("Тел.: %d, Имя: %s\n",m.getNumber(), m.getName());					    
					}
					x.close();					
				}				
				sd.serData("TellBook", mobiles);
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "Введите в поле число");}
		}
	}
}
