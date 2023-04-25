package view;

import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import controller.ScoreController;
import controller.quizController;
import model.quizModel;

public class Score extends JFrame{
	
	private JPanel contentPane;
	private JLabel scoreLabel;
	private quizModel qm;
	private quizController qc;
//	private Score score;
	
	

	

	public Score(String results) {
//		this.score = new Score();
//		this.qc = new quizController();
//		this.qm = new quizModel(qc.results());
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\Dell\\Downloads\\BTLJava-main\\BTLJava-main\\src\\view\\logoQuiz.png");
		Image i = imageIcon.getImage();
		Image new_img = i.getScaledInstance(400, 91, Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(new_img);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1142, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(76, 26, 66));
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(76, 26, 66));
		panel_1.add(panel, BorderLayout.SOUTH);
		
		scoreLabel = new JLabel("0");
		scoreLabel.setForeground(new Color(255, 255, 255));
		scoreLabel.setFont(new Font("Gabriola",  Font.BOLD, 40));
		scoreLabel.setText(results);
		scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(scoreLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(76, 26, 66));
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel jlabel_2 = new JLabel("Your score:");
		jlabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel_2.setFont(new Font("Gabriola", Font.BOLD, 65));
		jlabel_2.setForeground(new Color(255, 255, 255));
		panel_3.add(jlabel_2, BorderLayout.SOUTH);
		
		JLabel jlabel_3 = new JLabel("");
		jlabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel_3.setIcon(imageIcon);
		panel_3.add(jlabel_3, BorderLayout.CENTER);
		
		JLabel jlabel_4 = new JLabel("");
		panel_3.add(jlabel_4, BorderLayout.NORTH);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(76, 26, 66));
		contentPane.add(panel_2);
		
		ActionListener rs = new ScoreController(this);
		JButton jbutton = new JButton("Reset");
		jbutton.addActionListener(rs);
		jbutton.setBackground(new Color(0, 201, 133));
		jbutton.setForeground(Color.white);
		jbutton.setFont(new Font("Sitka Text", Font.BOLD, 35));
		jbutton.setFocusable(false);
		panel_2.add(jbutton);
		
		
		this.add(panel_2);
		this.setTitle("Quiz Game");
		this.setLocation(250, 130);
		this.setSize(1000, 600);
		
		this.setVisible(true);
	}
	
	
	public Score(quizModel qm, quizController qc){
	this.qm = qm;
	this.qc = qc;
//	this.score = score;
}


	public void setTextScore(String yourScore) {
		this.scoreLabel.setText(yourScore);
	}
}
