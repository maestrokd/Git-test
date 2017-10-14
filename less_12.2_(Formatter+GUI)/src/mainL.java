import java.util.Formatter;
//import java.util.Scanner;


public class mainL {
	static Formatter x;
	//static Scanner scn;
	static ReaderL r = new ReaderL();
	public static void main(String args[]){
		
		try{
			x = new Formatter("res//1.txt");
			r.ScanL("Сколько вам лет?");
			int a = (int)Double.parseDouble(r.b1);			
			r.ScanL("Как вас зовут?");
			String b = r.b1;
			r.ScanL("Где вы живете?");
			String c = r.b1;
			
		/*	scn = new Scanner(System.in);
			System.out.println("Сколько вам лет?");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("Как вас зовут?");
			String b = scn.next();
			
			System.out.println("Где вы живете?");
			String c = scn.next();
		*/
			x.format("Меня зовут %s, мне %d лет(года), я живу в городе %s", b, a, c);
		    x.close();
			
			
		}catch(Exception e){};
		
	}

}
