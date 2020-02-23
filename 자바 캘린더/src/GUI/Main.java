package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import GUINewFTT.Feeling;
import GUINewFTT.Rest;
import Left.FeelingL;
import Left.Leftpanel;
import Left.RestL;
import Left.StudyL;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Main {

	private JFrame frame;
	private JPanel jpanel;
	private Monthlabel mlabel;
	private Yearlabel ylabel;
	private BtnR btnR;
	private BtnL btnL;
	private ButtonD btnD;
	private Leftpanel lpanel;
	private StudyL s1 ;
	private RestL r1;
	private FeelingL f1;
	
	private Counter counter = new Counter();
	Calendar cal = Calendar.getInstance();//Calendar Instance 얻어옴
	int month_N = cal.get(Calendar.MONTH);
	int year = cal.get(Calendar.YEAR);//시작:2019년
	int month = month_N+1;
	private JLabel img1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Test3");
		frame.setBounds(100, 100, 1042, 670);//윈도우 크기
		
		
		jpanel = new JPanel();
		jpanel.setLayout(null);
		jpanel.setBackground(new Color(218,203,232));

		
		frame.setLocationRelativeTo(null);
	
		
		Weekpanel panel = new Weekpanel(); //WeekPanel
		jpanel.add(panel);
		//panel.setVisible(true);
		
		
		
		lpanel = new Leftpanel(year, month_N);//Leftpanel
		jpanel.add(lpanel);
		
		JLabel lblNewLabel = new JLabel("~Today");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 30));
		lblNewLabel.setBounds(14, 12, 210, 79);
		lpanel.add(lblNewLabel);
		
		
		
		
	
		ylabel = new Yearlabel(year+"");//Year label
		jpanel.add(ylabel);
		
		
	
		mlabel = new Monthlabel(month+"");	//Month label
		jpanel.add(mlabel);
	
		
		btnR = new BtnR();//M +오른쪽
		jpanel.add(btnR);
		
		
		btnL = new BtnL();//M - 왼쪽
		jpanel.add(btnL);
		
		btnL.addActionListener(counter);//action event
		btnR.addActionListener(counter);
	
		
		img1 = new JLabel(""); //이미지
		img1.setFont(new Font("휴먼가는샘체", Font.PLAIN, 15));
		img1.setBounds(24, 29, 88, 79);
		jpanel.add(img1);
		img1.setIcon(new ImageIcon("img/u1.png"));
		
		
		btnD = new ButtonD(year, month_N);//버튼 패널
		btnD.setBounds(10, 188, 722, 435);
		jpanel.add(btnD);
		
		
		frame.getContentPane().add(jpanel);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class Counter implements ActionListener {//날짜 왔다갔다
		//JPanel newPanel = new JPanel();

		@Override
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource().equals(btnL)){
				month--;
				if(month<1) {
					month=12;
					year-=1;
					ylabel.setText(year+"");
				}
				mlabel.setText(month+"");
				
				btnD.setVisible(false);
													
				btnD = new ButtonD(year, month-1);
				jpanel.add(btnD);
			}
			if(event.getSource().equals(btnR)) {
				month++;
				if(month>12) {
					month = 1;
					year+=1;
					ylabel.setText(year+"");
					
				}
				mlabel.setText(month+"");
				
				btnD.setVisible(false);
				
				btnD = new ButtonD(year, month-1);
				jpanel.add(btnD);
				
			}
			
		}
		
	}
}
	