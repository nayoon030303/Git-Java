package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Weekpanel extends JPanel{
	public Weekpanel(){
		//¿ùÈ­¼ö¸ñ±ÝÅäÀÏ
		
		setBackground(new Color(218,203,232));
		setBounds(0, 123, 739, 53);
		setLayout(null);
		
	
		
		JLabel dayS = new JLabel("SUN");
		//dayS.setOpaque(true);
		//dayS.setBackground(new Color(234,226,241));
		dayS.setFont(new Font("±¼¸²", Font.BOLD , 20));
		dayS.setHorizontalAlignment(SwingConstants.CENTER);
		dayS.setBounds(40, 12, 70, 33);
		add(dayS);
		
		JLabel dayM = new JLabel("MON");
		//dayM.setOpaque(true);
		//dayM.setBackground(new Color(234,226,241));
		dayM.setFont(new Font("±¼¸²", Font.BOLD , 20));
		dayM.setHorizontalAlignment(SwingConstants.CENTER);
		dayM.setBounds(140, 12, 70, 33);
		add(dayM);
		
		JLabel dayT = new JLabel("TUE");
		//dayT.setOpaque(true);
		//dayT.setBackground(new Color(234,226,241));
		dayT.setFont(new Font("±¼¸²", Font.BOLD , 20));
		dayT.setHorizontalAlignment(SwingConstants.CENTER);
		dayT.setBounds(240, 12, 70, 33);
		add(dayT);
		
		JLabel dayW = new JLabel("WED");
		///dayW.setOpaque(true);
		//dayW.setBackground(new Color(234,226,241));
		dayW.setFont(new Font("±¼¸²", Font.BOLD, 20));
		dayW.setHorizontalAlignment(SwingConstants.CENTER);
		dayW.setBounds(343, 12, 70, 33);
		add(dayW);
		
		JLabel dayTh = new JLabel("THU");
		//dayTh.setOpaque(true);
		//dayTh.setBackground(new Color(234,226,241));
		dayTh.setFont(new Font("±¼¸²", Font.BOLD, 20));
		dayTh.setHorizontalAlignment(SwingConstants.CENTER);
		dayTh.setBounds(443, 12, 70, 33);
		add(dayTh);
		
		JLabel dayF = new JLabel("FRI");
		//dayF.setOpaque(true);
		//dayF.setBackground(new Color(234,226,241));
		dayF.setFont(new Font("±¼¸²", Font.BOLD , 20));
		dayF.setHorizontalAlignment(SwingConstants.CENTER);
		dayF.setBounds(544, 12, 70, 33);
		add(dayF);
		
		
		JLabel daySa = new JLabel("SAT");
		//daySa.setOpaque(true);
		//daySa.setBackground(new Color(234,226,241));
		daySa.setForeground(new Color(0, 51, 255));
		daySa.setFont(new Font("±¼¸²", Font.BOLD , 20));
		daySa.setHorizontalAlignment(SwingConstants.CENTER);
		daySa.setBounds(647, 12, 70, 33);
		add(daySa);
	}
	
}
