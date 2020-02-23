
package GUINewFTT;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddSchedule extends JPanel {
	
	private JButton addBtn; 
	private JTextField textf;
	private JLabel jla[];
	
	private String sch[] = new String[4];
	private int i=0;
	private int j=0;
	
	public AddSchedule() {
		setBounds(336, 89,446, 402);//panel
		setLayout(null);
		setBackground(new Color(241,236,247));
		
		addBtn= new JButton("add");//추가 버튼
		addBtn.setBounds(323,12, 105, 27);
		addBtn.setBackground(new Color(203,190,211));
		add(addBtn);
		
		textf = new JTextField();//추가 field
		textf.setFont(new Font("굴림", Font.PLAIN, 20));
		textf.setBounds(10,51,418,78);
		add(textf);
		
		jla= new JLabel[4];
		
		for(int i=0; i<4; i++) {//체크 박스 4개 생성  && 삭제 버튼 생성
			jla[i] = new JLabel("");
			jla[i].setBounds(10,150+(i*63),342,56);
			jla[i].setFont(new Font("굴림", Font.PLAIN, 20));
			jla[i].setBackground(new Color(241,236,247));
			jla[i].setVisible(false);
			add(jla[i]);	
			
		}
		
addBtn.addActionListener(new ActionListener() {//add 버튼을 눌렀을때
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력값이 있을때만 실행
				String str = textf.getText();
				String[] jstr = new String[4];
				jstr[0] = jla[0].getText();
				jstr[1] = jla[1].getText();
				jstr[2] = jla[2].getText();
				jstr[3] = jla[3].getText();
			
				if(jstr[0].length() != 0) {
					i=i+1;
				} 
				if(jstr[1].length() != 0) {
					i=0;
					i=i+2;
				}
				if(jstr[2].length() != 0) {
					i=0;
					i=i+3;
				}
				if(jstr[3].length() != 0) {
					i=0;
					i=i+4;
				}
				
				
				if(str.length() != 0) {
					if(i<4) {
						sch[i]= str;
						jla[i].setText((i+1)+". "+str);
						jla[i].setVisible(true);
						textf.setText("");
					}else {
						textf.setText("최대 4개 입니다.");
					}
				}else {
					textf.setText("");
				}
				
			}
		});//end action add
	}
	public String getS1() {
		return sch[0];
		
	}
	public String getS2() {
		return sch[1];
		
	}
	public String getS3() {
		return sch[2];
		
	}
	public String getS4() {
		return sch[3];
		
	}
	public void setS1(String s1) {
		if(s1.equals("null")) {
			jla[0].setVisible(false);
		}else {
			jla[0].setText("1. "+s1);
			jla[0].setVisible(true);
		}
	
	}
	public void setS2(String s2) {
		if(s2.equals("null")) {
			jla[1].setVisible(false);
		}else {
			jla[1].setText("2. "+s2);
			jla[1].setVisible(true);
		}
		
	}
	public void setS3(String s3) {
		if(s3.equals("null")) {
			jla[2].setVisible(false);
		}else {
			jla[2].setText("3. "+s3);
			jla[2].setVisible(true);
		}
		
	}
	public void setS4(String s4) {
		if(s4.equals("null")) {
			jla[3].setVisible(false);
		}else {
			jla[3].setText("4. "+s4);
			jla[3].setVisible(true);
		}
		
	}
}
