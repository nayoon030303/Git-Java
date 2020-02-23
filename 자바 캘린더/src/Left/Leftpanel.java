package Left;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import DB.SetGet;
import GUI.ButtonD;

public class Leftpanel extends JPanel{
	private StudyL st;
	private RestL rs;
	private FeelingL fl;
	private JButton re;
	private SetGet setsum = new SetGet();
	private ButtonD bt;
	private int d;
	
	private int nums;
	private String sumS;
	
	private int year;
	private int month;
	
	public Leftpanel(int year,int month) {
		//왼쪽의 패널 	label:rest study feeling
		this.year = year;
		this.month = month;
		
		setBounds(739, 0, 297, 635);
		setBackground(Color.white);
		setLayout(null);
		

		st = new StudyL(year,month);
		add(st);
		
		rs = new RestL(year,month);
		add(rs);
		
		fl = new FeelingL(year,month);
		add(fl);
		
		re= new JButton("");
		re.setBounds(213, 22, 60, 36);
		add(re);
		re.setBackground(Color.LIGHT_GRAY);
		re.setIcon(new ImageIcon("img/d1.png"));
		re.addActionListener(new ActionListener() {//새로고침
			public void actionPerformed(ActionEvent arg0) {

				st.setVisible(false);
				rs.setVisible(false);
				fl.setVisible(false);
				
				
				st = new StudyL(year, month);
				st.setVisible(true);
				rs = new RestL(year,month);
				rs.setVisible(true);
				fl = new FeelingL(year,month);
				fl.setVisible(true);
				
				add(st);
				add(rs);
				add(fl);
				
				
			}
		});
		
		
	}
}
