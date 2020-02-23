package GUINewFTT;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Study extends JPanel{
	
	private JLabel lbstudy = new JLabel();
	private JTextField jTStudy = new JTextField();
	private int study;
	
	public Study() {
	
		setLayout(null);
		setBounds(53,110,178,84);
		setBackground(new Color(241,236,247));
		
		lbstudy.setText("Study");
		lbstudy.setHorizontalAlignment(SwingConstants.LEFT);
		lbstudy.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lbstudy.setBounds(0, 0, 77, 39);
		add(lbstudy);
		
		
		jTStudy.setText(0+"");
		jTStudy.setFont(new Font("굴림", Font.PLAIN, 20));//study입력
		jTStudy.setBounds(0, 38, 116, 34);
		
		add(jTStudy);
	}
	
	public int getStudy() {
		study = Integer.parseInt(jTStudy.getText());//값을 넣ㅇㄴ다
		return study;
	}
	public void setStudy(int study) {//데이터 불러오기
		jTStudy.setText(study+"");
	}
}
