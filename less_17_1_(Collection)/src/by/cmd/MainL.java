package by.cmd;

public class MainL {
	private static String[][] mobiles = {
		{"IPhone", "1234567"},
		{"IPhone", "1234567"},
		{"IPhone", "1234567"}
	};

	public static void main(String[] args) {
		for (int i=0;i<mobiles.length;i++){
			for (int k=0;k<mobiles[i].length;k++){
				System.out.println(mobiles[i][k]+"  ");
			
			}
			System.out.println();
		}
	

	}

}
