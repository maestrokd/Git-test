package by.cmd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDeserialization {
	private static ArrayList<Profile> profiles = new ArrayList<Profile>();
	
	public Object deserData(String file_name) {
		Object retObject = null;
		try {
			FileInputStream fileIn = new FileInputStream(file_name+".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			retObject = in.readObject();
			fileIn.close();
			in.close();			
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Ошибка ввода/вывода");
			System.exit(2);
		} catch (ClassNotFoundException e) {
			System.out.println("Класс не найден");
			System.exit(3);
		}	
		return retObject;
	}
	public void serData(String file_name, Object obj) {
		try {
			FileOutputStream fileOut = new FileOutputStream(file_name+".ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			fileOut.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Ошибка ввода/вывода");
			System.exit(2);
		}
		
	}
	

}
