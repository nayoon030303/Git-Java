package Left;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import DB.SetGet;

public class FeelingL extends JPanel{
	
	private JLabel lb;
	private JLabel happy;
	private JLabel soso;
	private JLabel angry;	
	private JLabel sad;
	
	private JLabel iha;
	private JLabel iso;
	private JLabel ian;
	private JLabel isad;
	private SetGet sumF = new SetGet();

	public FeelingL(int year, int month ) {
		setBounds(23,230,255,251);
		setBackground(Color.white);
		setVisible(true);
		setLayout(null);
		

		lb = new JLabel("Feeling ÇÕ°è");
		lb.setBounds(0,12,113,36);
		lb.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(lb);
		
		happy = new JLabel("Happy :");
		happy.setBounds(5, 60, 113, 36);
		happy.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(happy);
		
		soso = new JLabel("Soso :");
		soso.setBounds(5, 108, 113, 36);
		soso.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(soso);
		
		angry = new JLabel("Angry :");
		angry .setBounds(5, 156, 113, 36);
		angry .setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(angry);
		
		sad = new JLabel("Sad :");
		sad.setBounds(5, 204, 113, 36);
		sad .setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(sad);
		
		
		//in
		iha = new JLabel(sumF.FeelData(year, month, "Happy"));
		iha.setBounds(100, 60, 81, 36);
		iha .setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(iha);
		
		iso = new JLabel(sumF.FeelData(year, month, "Soso"));
		iso.setBounds(100, 108, 81, 36);
		iso .setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(iso);
		
		ian = new JLabel(sumF.FeelData(year, month, "Angry"));
		ian.setBounds(100, 158, 81, 36);
		ian .setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(ian);
		
		isad = new JLabel(sumF.FeelData(year, month, "Sad"));
		isad.setBounds(100, 206, 81, 36);
		isad .setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		add(isad);
	}
}
