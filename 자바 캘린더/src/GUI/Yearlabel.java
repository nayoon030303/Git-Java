package GUI;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Yearlabel extends JLabel{
	public Yearlabel(String title) {
		
		setText(title);
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(new Font("함초롬돋움", Font.BOLD, 30));
		setBounds(295, 0, 164, 53);
		
	}

}
