package by.cmd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelListener;

public class MainWindow extends JFrame {
	private JTable table;
	private PetsonModal model;

	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(640, 480);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 500, 430);
		getContentPane().add(scrollPane);
		
		model = new PetsonModal();
		table = new JTable(model);
		
		
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Person person = new Person();
				person.setName(JOptionPane.showInputDialog("Enter name: "));
				person.setSername(JOptionPane.showInputDialog("Enter surname: "));
				MainL.persons.add(person);
				table.updateUI();
			}
		});
		btnAdd.setBounds(533, 11, 91, 23);
		getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow()==-1||MainL.persons.size()<=0){return;}
//				MainL.persons.remove(table.getSelectedRow());
//				MainL.persons.remove(table.getSelect);
				model.removeTableModelListener((TableModelListener) table.getSelectionModel());
//				System.out.println(table.getSelectionModel().clearSelection());
//				System.out.println(table.getSelectedRow());
//				System.out.println(table.getSelectedRowCount());
//				System.out.println(table.getSelectedRows().toString());
//				ListSelectionModel objects = table.getSelectionModel();
//				objects.removeListSelectionListener(table);
//				MainL.persons.remove(table.getSelectionModel());
//				int a=table.getSelectedRow();
//				int b=table.getSelectedRowCount();
//				System.out.println(a);
//				System.out.println(b);
//				for(int i=a;i<a+b;i++){
//					System.out.println(i);
////					MainL.persons.remove(a);
//					
//				}
				table.updateUI();
//				System.out.println(objects);
//				int objectsI = table.getSelectionModel().getSelectionMode();
//				System.out.println(objectsI);
//				ArrayList<int> objects = table.getSelectionModel();
////				List<Person> objects = (List<Person>) table.getSelectionModel();
//				for(i=objects[1]; s: objects){
//					MainL.persons.remove(objects);
//					table.updateUI();
//				}
				table.updateUI();
				table.clearSelection();
			}
		});
		btnRemove.setBounds(533, 45, 91, 23);
		getContentPane().add(btnRemove);
		
		
		
		setVisible(true);
	}
}
