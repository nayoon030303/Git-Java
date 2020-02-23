package Left;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import DB.SetGet;

public class RestL extends JPanel {
	
	private JLabel lb; 
	private JLabel inlb;
	private SetGet setsum = new SetGet();
	
	public RestL(int year,int month) {
		setBounds(25, 161, 258, 60);
		setBackground(Color.white);
		setLayout(null);
		setVisible(true);
		
		lb = new JLabel("Rest ½Ã°£:");
		lb.setBounds(0,12,113,36);
		lb.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(lb);
		
		inlb = new JLabel(setsum.restData(year, month));
		inlb.setBounds(109,12,91,36);
		inlb.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(inlb);
	}
}
