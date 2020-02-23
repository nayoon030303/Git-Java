package GUINewFTT;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import DB.Data;
import DB.SetGet;



public class MFrame extends JFrame{
	
	
	private Jpanel jpanel; 
	private Week week;
	private int year;
	private int month;
	private int day;
	
	public MFrame(int year, int month, int day) throws HeadlessException {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	
		setBounds(100, 100, 825, 550);//Frame
		dispose();
		getContentPane().setLayout(null);
	
		jpanel = new Jpanel(year, month, day);
		add(jpanel);
		
		setVisible(true);
	}

	

}
