package Left;

import java.awt.Color;import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import DB.SetGet;
import GUI.ButtonD;

public class StudyL extends JPanel{
	
	private JLabel lb;
	private JLabel inlb;
	private SetGet setsum = new SetGet();
	
	public StudyL(int year, int month) {
		setBounds(25,92,258,60);
		setBackground(Color.white);
		setVisible(true);
		setLayout(null);
		
		lb = new JLabel("Study ½Ã°£:");
		lb.setBounds(0,12,113,36);
		lb.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(lb);
		

		inlb = new JLabel(setsum.studyData(year, month));//year°ú monthÀÏ¶§ study
		inlb.setBounds(109,12,91,36);
		inlb.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(inlb);
		
	}
}
