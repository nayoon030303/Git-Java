package GUINewFTT;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import DB.SetGet;

public class Week extends JPanel{
	JLabel yearL = new JLabel();
	JLabel monthL = new JLabel();
	JLabel dayL = new JLabel();

	public Week(int year, int month,int day) {
		
		setLayout(null);
		setBounds(253,12,261,55);
		setBackground(new Color(241,236,247));
		
		yearL.setText(year+".");
		yearL.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		yearL.setHorizontalAlignment(SwingConstants.CENTER);
		yearL.setBounds(10,0,131,53);
		add(yearL);
		
		monthL.setText(month+1+".");
		monthL.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, 30));
		monthL.setHorizontalAlignment(SwingConstants.CENTER);
		monthL.setBounds(75,0,131,53);
		add(monthL);
		
		
		dayL.setText(day+"");
		dayL.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		dayL.setHorizontalAlignment(SwingConstants.CENTER);
		dayL.setBounds(116,0,131,53);
		add(dayL);
		
		
		
	}
}
