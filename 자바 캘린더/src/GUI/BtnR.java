package GUI;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnR extends JButton {
	public BtnR(){
		
		setText(">");
		setForeground(Color.BLACK);
		setBackground(new Color(218,203,232));
		
		setEnabled(true);
		setFont(new Font("±¼¸²", Font.BOLD, 27));
		setBounds(510, 64, 105, 47);
		setBorderPainted(false);
			
	}

	
	
}
