package by.cmd;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MainWindow extends JFrame {

	private JPanel panel1;
	private JPanel panel2;
	private JTabbedPane tabbedPane;
	private JTextArea txtrEnterUrlHere;
	private JButton btnGetImage;
	private JButton btnGetFile;
	private Choice choice;
	private JButton btnView;
	private JLabel lblNewLabel;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmSaveImage;
	private JMenu mnOptions;
	private JMenuItem mntmExit;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JLabel imageLabel;

	public MainWindow(int width, int hieght){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(640, 480);
		getContentPane().setLayout(null);
		
		panel1 = new JPanel(null);
		panel2 = new JPanel(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 614, 409);
		getContentPane().add(tabbedPane);
		
		setResizable(false);
		tabbedPane.addTab("Tab 1", panel1);
		
		txtrEnterUrlHere = new JTextArea();
		txtrEnterUrlHere.setText("Enter URL here...");
		txtrEnterUrlHere.setBounds(10, 45, 589, 328);
		panel1.add(txtrEnterUrlHere);
		
		btnGetImage = new JButton("Get Image");
		btnGetImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.out.println(MainL.getImage());
					MainL.setImage(new URL(txtrEnterUrlHere.getText()));
					System.out.println(MainL.getImage());
				} catch (MalformedURLException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Invalid URL or no internet conneection");
				}
			}
		});
		btnGetImage.setBounds(10, 11, 91, 23);
		panel1.add(btnGetImage);
		
		btnGetFile = new JButton("Get File");
		btnGetFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chouser = new JFileChooser();
				int reply = chouser.showOpenDialog(null);
				if (reply == JFileChooser.APPROVE_OPTION){
					MainL.setImage(chouser.getSelectedFile());
				}
				
			}
		});
		btnGetFile.setBounds(498, 11, 91, 23);
		panel1.add(btnGetFile);
		tabbedPane.addTab("Tab 2", panel2);
		
		choice = new Choice();
		choice.setBounds(510, 14, 89, 20);
		panel2.add(choice);
		
		choice.add("png");
		choice.add("jpg");
		
		btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(MainL.getImage()==null){return;}
				imageLabel.setIcon(new ImageIcon(MainL.getImage()));
				imageLabel.updateUI();
			}
		});
		btnView.setBounds(10, 11, 91, 23);
		panel2.add(btnView);
		
		lblNewLabel = new JLabel("Format");
		lblNewLabel.setBounds(458, 14, 46, 14);
		panel2.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 589, 328);
		panel2.add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		imageLabel = new JLabel("");
		panel.add(imageLabel, BorderLayout.CENTER);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmSaveImage = new JMenuItem("Save Image");
		mntmSaveImage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chouser = new JFileChooser();
				int reply = chouser.showSaveDialog(null);
				if (reply == JFileChooser.APPROVE_OPTION){
					MainL.saveImage(chouser.getSelectedFile(), choice.getSelectedItem());
				}
			}
		});
		mnFile.add(mntmSaveImage);
		
		mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				// TODO Auto-generated method stub
				
			}
		});
		mnOptions.add(mntmExit);
		
		setVisible(true);
	}
}
