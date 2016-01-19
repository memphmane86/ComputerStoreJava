package my.ComputerStore;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.swing.JButton;

import javax.swing.JList;

import javax.swing.DefaultListModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.xml.bind.annotation.*;

@XmlRootElement (name = "frame")
@XmlAccessorType (XmlAccessType.FIELD)
public class Frame extends JFrame {

	private JPanel contentPane;
	JButton deleteButton;
	JButton addButton;
	JList Left_list;
	JList Right_list;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		DefaultListModel<String>model=new DefaultListModel<>();	
		for(String item : new String[]{"Case", "MotherBoard" , "CPU" , "RAM" , "GPU" , "HDD" , "PSU"}){
			model.addElement(item);
			
			
			
		DefaultListModel<String>model1=new DefaultListModel<>();	
			
				
		JList <String>Left_list = new JList<>();
		Left_list.setModel(model);
		Left_list.setBounds(10, 32, 142, 338);
		Left_list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		
		contentPane.add(Left_list);
		
		JList<String> Right_list = new JList<>(new DefaultListModel<String>());	
		Right_list.setModel(model1);
		Right_list.setBounds(282, 32, 142, 328);
		contentPane.add(Right_list);
		Right_list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		mntmSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
			
				
									
					
					
				}
						
			}
		
		);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mnFile.add(mntmLoad);
		mntmLoad.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				System.exit(0);			
			}
		
		});
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		mntmExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				System.exit(0);			
			}
		
		});
		
		JButton addButton = new JButton(">>");
		addButton.setBounds(193, 128, 54, 33);
		contentPane.add(addButton);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i= 0;
				
				Object[] from = Left_list.getSelectedValues();
				
				for(i = 0; i< from.length; i++){
					model1.addElement((String) from[i]);
				}
				
			}
		});
		

		JButton deleteButton = new JButton("<<");
		deleteButton.setBounds(193, 184, 54, 33);
		contentPane.add(deleteButton);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = 0;
				
				Object[] to = Right_list.getSelectedValues();
				
				for(i = 0; i< to.length; i++)
				{
					model1.removeElement((String) to[i]);
				
				}
				
				
				}
			}
		);
		
		
		
		}
	}
}
