import javax.swing.JFrame;

public class traning7_8_2 {
	public static void main(String args[]){
		Reader r = new Reader("Калькулятор");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(200, 220);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}
