import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class MainWindow extends JFrame {
	private LessListModel model;
	private JList<String> list;
	private JButton remove_btn;
	private JButton btnAdd;

	public MainWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setResizable(false);
		
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 300, 430);
		getContentPane().add(scrollPane);
		
		model = new LessListModel();
		
		list = new JList<String>(model);
		scrollPane.setViewportView(list);
		
		remove_btn = new JButton("Remove");
		remove_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	model.removeElements(list.getSelectedValue());
				System.out.println(list.getSelectedValuesList());
				List<String> objects = list.getSelectedValuesList();
				for(String s: objects){
					model.removeElements(s);
				}
				
				list.clearSelection();
				list.updateUI();
			}
		});
		remove_btn.setBounds(320, 10, 91, 23);
		getContentPane().add(remove_btn);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = JOptionPane.showInputDialog("Enter your string here:");
				model.addElements(s);
				list.updateUI();
			}
		});
		btnAdd.setBounds(320, 44, 91, 23);
		getContentPane().add(btnAdd);
		
		setVisible(true);
		list.updateUI();
	}
	
	public void addElement(String s){
		model.addElements(s);
		list.updateUI();
	}
	
	public void removeElement(int index){
		model.removeElements(index);
	}
	
//	public void updateUI(){
//		list.updateUI();
//	}
}
