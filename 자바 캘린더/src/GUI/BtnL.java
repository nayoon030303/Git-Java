package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class BtnL extends JButton{
	public BtnL(){
		
		setText("<");
		setForeground(Color.BLACK);
		setBackground(new Color(218,203,232));
		setEnabled(true);
		setFont(new Font("±¼¸²", Font.BOLD, 27));
		setBounds(126, 64, 105, 47);
		setBorderPainted(false);
		
	}
}
