import java.util.Formatter;
//import java.util.Scanner;


public class mainL {
	static Formatter x;
	//static Scanner scn;
	static ReaderL r = new ReaderL();
	public static void main(String args[]){
		
		try{
			x = new Formatter("res//1.txt");
			r.ScanL("������� ��� ���?");
			int a = (int)Double.parseDouble(r.b1);			
			r.ScanL("��� ��� �����?");
			String b = r.b1;
			r.ScanL("��� �� ������?");
			String c = r.b1;
			
		/*	scn = new Scanner(System.in);
			System.out.println("������� ��� ���?");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("��� ��� �����?");
			String b = scn.next();
			
			System.out.println("��� �� ������?");
			String c = scn.next();
		*/
			x.format("���� ����� %s, ��� %d ���(����), � ���� � ������ %s", b, a, c);
		    x.close();
			
			
		}catch(Exception e){};
		
	}

}
