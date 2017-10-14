package by.cmd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainL {
	private static ArrayList<Profile> profiles = new ArrayList<Profile>();
	static SerializationDeserialization sd = new SerializationDeserialization();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		profiles = (ArrayList<Profile>) sd.deserData("profiles");
		System.out.println(profiles.size());
		Profile profile = new Profile();
		profile.setName(JOptionPane.showInputDialog(null, "Введите ваше имя"));
		profile.setSurname(JOptionPane.showInputDialog(null, "Введите вашe фамилию"));
		profiles.add(profile);
		for(Profile p : profiles){
			System.out.println(p.getName()+" "+ p.getSurname());
		}
		System.out.println(profiles.size());
		sd.serData("profiles", profiles);
		
	
	}
/*
	private static void serData(String file_name, Object obj) {
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

	private static Object deserData(String file_name) {
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
	}*/

} 
