package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import GUINewFTT.MFrame;



public class ButtonD extends JPanel{
	
	int locationX=0;
	int width=66;
	int height=62;
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	int toYear;
	int toMonth;
	int toDay;
	
	

	//고치기
	 public ButtonD(int year, int month){
		
		setLayout(null);
		Calendar cal = Calendar.getInstance(); //Calendar 객체 얻어오기
		setBackground(new Color(218,203,232));
		setBounds(10,  188 , 722 , 435 );
		
		toYear =cal.get(Calendar.YEAR);
		toMonth = cal.get(Calendar.MONTH);
		toDay = cal.get(Calendar.DATE);
		
		
		cal.set(year,month,1);
		int endDate = cal.getActualMaximum(Calendar.DATE);//달의 마지막일 얻기
		int sDayNum = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일 얻어오기
		int sDay = sDayNum;
	
		JButton[] btn_day = new JButton[endDate];
		
		for(int i=1; i<sDayNum; i++) {
			locationX=((i*102));
		}
		for(int i=0; i<endDate; i++) {	//day배열 추가 및 위치조정
		
			 btn_day[i] = new JButton((i+1)+"");
			 btn_day[i].setBackground(new Color(218,203,232));
			 btn_day[i].setFont(new Font("굴림체", Font.BOLD, 20));
			 btn_day[i].setBorderPainted(false);
			 
			 if(sDay<8) {
				 btn_day[i].setBounds(locationX+(102*a)+30, 0, width, height);
				 a++;
			 }
			 else if(sDay>=8 && sDay<=14) {
				 btn_day[i].setBounds((102*b)+30, 87, width, height);
				 b++;
			 }
			 else if(sDay>=15 && sDay<=21) {
				 btn_day[i].setBounds((102*c)+30, 174, width, height);
				 c++;
			 }
			 else if(sDay>=22 && sDay<=28) {
				 btn_day[i].setBounds((102*d)+30, 261, width, height);
				 d++;
			 }
			 else if(sDay>=29 && sDay<=endDate+sDayNum) {
				 btn_day[i].setBounds((102*e)+30, 348, width, height);
				 e++;
			 }
		
			 
			if(sDay%7==0 ) {
				btn_day[i].setForeground(new Color(0,0,255));
			}
			if(sDay==1 || sDay == 8 || sDay == 15 || sDay == 22 || sDay == 29 ) {
				btn_day[i].setForeground(new Color(255,0,0));
			}
			
			
			String str1 = btn_day[i].getText();//오늘의 날짜
			 int today = Integer.parseInt(str1);
			 if(today==toDay && year==toYear && month ==toMonth ) {
				 btn_day[i].setBackground(new Color(234,226,241));
			 }
			
			
			
			
			 sDay++;
			add(btn_day[i]);
			String dayT= btn_day[i].getText();;
			int day = Integer.parseInt(dayT);
			
			btn_day[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// btn_day[i]를 눌렀을떼
			
					new MFrame(year, month, day);
				
				}
			});
		}
	
		
	}
	

		public int getToDay() {
			return toDay;
		}
}
