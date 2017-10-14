package by.cmd;

public class MainL {
	private static Mobile [] mobiles = new Mobile[3]; 
		

	

	public static void main(String[] args) {
		mobiles[0] = new Mobile(1234567, "IPhone");
		mobiles[1] = new Mobile(1275667, "Sumsung");
		mobiles[2] = new Mobile(1234134, "Nokia");
		for (Mobile m: mobiles){
			System.out.println(m.getNumber()+"  "+m.getName());
			
			
		}
	

	}

}
