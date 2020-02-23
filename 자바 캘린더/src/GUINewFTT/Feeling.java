package GUINewFTT;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Feeling extends JPanel{
	
	private JLabel lbFeeling = new JLabel();
	private JComboBox<String> comF;
	private JLabel lbSetF = new JLabel();
	private String Date[] = {"Happy","Soso","Angry","Sad"};
	private String feeling;


	public Feeling() {
		
		setBounds(53, 362, 220, 84);
		setLayout(null);
		setBackground(new Color(241,236,247));
		
		lbFeeling.setText("Feeling");
		lbFeeling.setHorizontalAlignment(SwingConstants.LEFT);
		lbFeeling.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lbFeeling.setBounds(0, 0, 125, 39);
		add(lbFeeling);
		
		comF = new JComboBox(Date);//combo ¹Ú½º ¼±ÅÃ
		comF.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		comF.setBounds(102, 11, 104, 24);
		add(comF);
		comF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				feeling = comF.getSelectedItem().toString();
				lbSetF.setText(feeling);
			}
		});
		
		lbSetF.setBounds(10,45,77, 39);
		lbSetF.setFont(new Font("±¼¸²",Font.PLAIN,20));
		setVisible(true);
		add(lbSetF);
	}
	public String getFeeling() {
		return feeling;
	}
	public void setFeeling(String f) {
		lbSetF.setText(f);
	}
}
