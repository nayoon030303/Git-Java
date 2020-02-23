package GUINewFTT;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Rest extends JPanel {
	
	private JLabel lbRest = new JLabel();
	private JTextField jTRest = new JTextField();
	private int rest;
	
	
	public Rest() {
		
		setLayout(null);
		setBounds(53,240,178,84);
		setBackground(new Color(241,236,247));
		
		lbRest.setText("Rest");
		lbRest.setHorizontalAlignment(SwingConstants.LEFT);
		lbRest.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lbRest.setBounds(0, 0, 77, 39);
		add(lbRest);
		
		
		jTRest.setText(0+"");
		jTRest.setFont(new Font("±¼¸²", Font.PLAIN, 20));//restÀÔ·Â
		jTRest.setBounds(0, 38, 116, 34);
		
		add(jTRest);
	}
	public int getRest() {
		rest = Integer.parseInt(jTRest.getText());
		return rest;
	}
	public void setRest(int rest) {
		jTRest.setText(rest+"");
	}
}
