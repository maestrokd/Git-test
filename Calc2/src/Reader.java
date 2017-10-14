import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame {
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;	
	JTextField t1;
	double firstNumber, secondNumber, result;
	String a, b, operation;
	eHandler handler = new eHandler();
	
	public Reader(String s){
		super(s);
		setLayout(new FlowLayout());
		b0 = new JButton("  0  ");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b10 = new JButton("  =  ");
		b11 = new JButton("+");
		b12 = new JButton("-");
		b13 = new JButton("*");
		b14 = new JButton("/");
		b15 = new JButton("+-");
		b16 = new JButton("C");
		b17 = new JButton(".");
		b18 = new JButton("?");
		t1 = new JTextField(15);		
		
		add(t1);
		add(b16);
		add(b18);
		add(b15);
		add(b14);
		add(b7);
		add(b8);
		add(b9);
		add(b13);
		add(b4);
		add(b5);
		add(b6);
		add(b12);
		add(b1);
		add(b2);
		add(b3);
		add(b11);
		add(b0);
		add(b17);
		add(b10);
		
		b0.addActionListener(handler);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b10.addActionListener(handler);
		b11.addActionListener(handler);
		b12.addActionListener(handler);
		b13.addActionListener(handler);
		b14.addActionListener(handler);
		b15.addActionListener(handler);
		b16.addActionListener(handler);
		b17.addActionListener(handler);
		b18.addActionListener(handler);		
	}
	
	public class eHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			try{				
				if(e.getSource() == b0){
					t1.setText(t1.getText() + "0");					
				}
				if(e.getSource() == b1){
					t1.setText(t1.getText() + "1");					
				}
				if(e.getSource() == b2){
					t1.setText(t1.getText() + "2");					
				}
				if(e.getSource() == b3){
					t1.setText(t1.getText() + "3");					
				}
				if(e.getSource() == b4){
					t1.setText(t1.getText() + "4");					
				}
				if(e.getSource() == b5){
					t1.setText(t1.getText() + "5");					
				}
				if(e.getSource() == b6){
					t1.setText(t1.getText() + "6");					
				}
				if(e.getSource() == b7){
					t1.setText(t1.getText() + "7");					
				}
				if(e.getSource() == b8){
					t1.setText(t1.getText() + "8");					
				}
				if(e.getSource() == b9){
					t1.setText(t1.getText() + "9");					
				}
				if(e.getSource() == b10){
					OperationClass operationC = new OperationClass();
					secondNumber = Double.parseDouble(t1.getText());
					switch (operation){
					case "+":
						result = operationC.addition(firstNumber, secondNumber);
						if (result - (int)result != 0) t1.setText(Double.toString(result));
						else t1.setText(Integer.toString((int)result));						
						break;
					case "-":
						result = operationC.subtraction(firstNumber, secondNumber);
						if (result - (int)result != 0) t1.setText(Double.toString(result));
						else t1.setText(Integer.toString((int)result));
						break;
					case "*":
						result =  operationC.multiplication(firstNumber, secondNumber);
						if (result - (int)result != 0) t1.setText(Double.toString(result));
						else t1.setText(Integer.toString((int)result));
						break;
					case "/":
						result =  operationC.division(firstNumber, secondNumber);
						if (result - (int)result != 0) t1.setText(Double.toString(result));
						else t1.setText(Integer.toString((int)result));
						break;
					}										
				}
				if(e.getSource() == b11){
					firstNumber = Double.parseDouble(t1.getText());
					operation = "+";
					t1.setText("");
				}
				if(e.getSource() == b12){
					firstNumber = Double.parseDouble(t1.getText());
					operation = "-";
					t1.setText("");
				}
				if(e.getSource() == b13){
					firstNumber = Double.parseDouble(t1.getText());
					operation = "*";
					t1.setText("");
				}
				if(e.getSource() == b14){
					firstNumber = Double.parseDouble(t1.getText());
					operation = "/";
					t1.setText("");
				}
				if(e.getSource() == b15){
					firstNumber = Double.parseDouble(t1.getText())*(-1);
					if (firstNumber - (int)firstNumber != 0) t1.setText(Double.toString(firstNumber));
					else t1.setText(Integer.toString((int)firstNumber));				
				}
				if(e.getSource() == b16){
					t1.setText("");				
				}
				if(e.getSource() == b17){
					t1.setText(t1.getText() + ".");		
				}
				if(e.getSource() == b18){					
				}	
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "¬ведите в поле число");}			
		}		
	}	
}
