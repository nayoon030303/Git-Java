package GUINewFTT;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import DB.SetGet;

public class Jpanel extends JPanel{
	private Week week;
	private Study study;
	private Rest rest;
	private Feeling feeling;
	private AddSchedule adsch;
	private SetGet setget;
	private SaveBtn save;
	private Delete delete;
	private SetGet saDe;
	
	private int year, month,  day;
	
	public Jpanel(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
		setBounds(0, 0, 825, 550);//panel
		setLayout(null);
		setBackground(new Color(241,236,247));
		
		week = new Week(year, month, day);//week panel
		add(week);
		
	
		study = new Study();
		
		
		rest = new Rest();
		
		
		feeling = new Feeling();
		
		
		adsch = new AddSchedule();
		
		
		save = new SaveBtn();
		
		delete = new Delete();
		
		
		add(study);
		add(rest);
		add(feeling);
		add(adsch);
		add(save);

		//저장되어있던 데이터가 있나 없나 확인 후 있으면 불러오기
		SetGet get = new SetGet(year, month, day,0,0,"null","null","null","null","null" );
		get.getData();
		
		if(year == get.getYear() && month == get.getMonth() && day == get.getDay()) {
			study.setStudy(get.getStudy());
			add(study);
			rest.setRest(get.getRest());
			add(rest);
			feeling.setFeeling(get.getFeeling());
			add(feeling);
			adsch.setS1(get.getS1());
			adsch.setS2(get.getS2());
			adsch.setS3(get.getS3());
			adsch.setS4(get.getS4());
			add(adsch);
			add(delete);
			
		}
		
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// save버튼 눌렀을때 Data 전송
				saDe = new SetGet(year, month, day, study.getStudy(), rest.getRest(), feeling.getFeeling(), adsch.getS1(),adsch.getS2(), adsch.getS3(),adsch.getS4());
				saDe.setData();
				JOptionPane a = new JOptionPane();
				a.showMessageDialog(null,"저장되었습니다" );
			}
		});
		
		delete .addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				// save버튼 눌렀을때 Data 전송
				saDe  = new SetGet(year, month, day, study.getStudy(), rest.getRest(), feeling.getFeeling(), adsch.getS1(),adsch.getS2(), adsch.getS3(),adsch.getS4());
				saDe.delect(year, month,day);
				JOptionPane a = new JOptionPane();
				a.showMessageDialog(null,"삭제되었습니다." );
			}
		});
		
		
		
	}
}
