
public class MainL {
	public static MainWindow window; 

	public static void main(String[] args) {
		window = new MainWindow();
		for(int i=0; i<10; i++){
			window.addElement("Hello World!"+i);
		}
		
		//window.removeElement(3);
	}

}
