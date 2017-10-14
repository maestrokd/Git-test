package by.cmd;
import javax.swing.JFrame;

public class MainL {
	
		public static void main(String[] args) {
		Reader rd =new Reader("Add contact");
		rd.setVisible(true);
		rd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rd.setSize(200, 300);
		rd.setResizable(false);
		rd.setLocationRelativeTo(null);
		
	}

}
