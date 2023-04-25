
package view;

import java.awt.*;
import java.awt.event.ActionEvent;
//import org.jdesktop.swingx.JXButton;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.quizController;
import model.quizModel;

public class quizView extends JFrame{
	private quizModel qm;
//	private quizController qc;
	private Score score;
	private JLabel timeLabel;
    private JPanel questionPanel;
    private JPanel buttonPanel; 
    public JLabel questionLabel;
    public JPanel timerPanel;
    private JLabel numberLabel;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
//    private quizController qc;
    

	
	public quizView(){
		this.qm = new quizModel();
//		this.score = new Score();
//		this.qc = new quizController(qm);
		
//		Thanh thoi gian
		timerPanel = new JPanel(new BorderLayout());
		timeLabel = new JLabel("00:00", SwingConstants.CENTER);
        timeLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 24));
        timeLabel.setForeground(new Color(255, 255, 255));
        timeLabel.setPreferredSize(new Dimension(this.getWidth(), 50));
        timeLabel.setBackground(new Color(70, 26, 66));
        timeLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        timeLabel.setOpaque(true);
        timerPanel.add(timeLabel);
        
        
        
		
//      Khung cau hoi
        questionPanel = new JPanel();
        questionPanel.setPreferredSize(new Dimension(this.getWidth(), 200));
        questionPanel.setBackground(new Color(70, 26, 66));
        questionLabel = new JLabel();
        questionLabel.setForeground(new Color(255, 255, 255));
        questionLabel.setFont(new Font("Gabriola",  Font.BOLD, 40));
        questionLabel.setText(this.qm.getQuestions()[0]);
//        questionLabel.setText("Hello");
        questionPanel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
//        questionPanel.setHorizontalAlignment(SwingConstants.CENTER);
        questionPanel.add(questionLabel);
//        questionPanel.add(numberLabel);
        
        // Tạo panel nút
        buttonPanel = new JPanel(new GridLayout(2, 2, 30, 30));
        buttonPanel.setPreferredSize(new Dimension(this.getWidth(), 300));
        buttonPanel.setBackground(new Color(70, 26, 66));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        
        ActionListener ac = new quizController(this, qm, score);
        
        
        
        
        JButton button1 = new JButton("A");
        button1.addActionListener(ac);
        button1.setLayout(new BorderLayout());
        button1.setBackground(new Color(255, 118, 117));
        button1.setFont(new Font("Gabriola" , Font.BOLD, 24));
        label1 = new JLabel();
        label1.setFont(new Font("Gabriola",  Font.BOLD, 24));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setText(this.qm.getOptions()[0][0]);
        button1.add(label1, BorderLayout.SOUTH);
        button1.setFocusable(false);
        buttonPanel.add(button1);

        JButton button2 = new JButton("B");
        button2.addActionListener(ac);
        button2.setLayout(new BorderLayout());
        button2.setFont(new Font("Gabriola" , Font.BOLD, 24));
        button2.setBackground(new Color(255, 159, 67));
        label2 = new JLabel();
        label2.setFont(new Font("Gabriola",  Font.BOLD, 24));
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setText(this.qm.getOptions()[0][1]);
        button2.add(label2, BorderLayout.SOUTH);
        button2.setFocusable(false);
        buttonPanel.add(button2);

        JButton button3 = new JButton("C");
        button3.addActionListener(ac);
        button3.setLayout(new BorderLayout());
        button3.setFont(new Font("Gabriola" , Font.BOLD, 24));
        button3.setBackground(new Color(255, 205, 86));
        label3 = new JLabel();
        label3.setFont(new Font( "Gabriola",  Font.BOLD, 24));
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setText(this.qm.getOptions()[0][2]);
        button3.add(label3, BorderLayout.SOUTH);
        button3.setFocusable(false);
        buttonPanel.add(button3);

        JButton button4 = new JButton("D");
        button4.addActionListener(ac);
        button4.setLayout(new BorderLayout());
        button4.setFont(new Font("Gabriola" , Font.BOLD, 24));
        button4.setBackground(new Color(75, 192, 192));
        label4 = new JLabel();
        label4.setFont(new Font("Gabriola",  Font.BOLD, 24));
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setText(this.qm.getOptions()[0][3]);
        button4.add(label4, BorderLayout.SOUTH);
        button4.setFocusable(false);
        buttonPanel.add(button4);
		
		
		
		
		this.setTitle("Quiz Game");
		this.setSize(1000, 600);
		this.getContentPane().setBackground(new Color(78, 10, 75));
		
		this.add(buttonPanel, BorderLayout.SOUTH);
		this.add(questionPanel, BorderLayout.CENTER);
		this.add(timerPanel, BorderLayout.NORTH);
		
		
		this.setLocation(250, 130);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		
		this.setVisible(true);
		
	}
	
	public void move() {
		
	}
	
	
	
	public JLabel getQuestionLabel() {
		return questionLabel;
	}




	public void setQuestionLabel(JLabel questionLabel) {
		this.questionLabel = questionLabel;
	}
	
	public void setTextQuestion(String newQuestion) {
		this.questionLabel.setText(newQuestion);
	}
	
	public void setTextLabelA(String labelA) {
		this.label1.setText(labelA);
	}
	
	public void setTextLabelB(String labelB) {
		this.label2.setText(labelB);
	}
	
	public void setTextLabelC(String labelC) {
		this.label3.setText(labelC);
	}
	
	public void setTextLabelD(String labelD) {
		this.label4.setText(labelD);
	}
	
	public void setBackgroundA(int a, int b, int c) {
		this.button1.setBackground(new Color(a,b,c));
	}
	
	public void setBackgroundB(int a, int b, int c) {
		this.button2.setBackground(new Color(a,b,c));
	}
	
	public void setBackgroundC(int a, int b, int c) {
		this.button3.setBackground(new Color(a,b,c));
	}
	
	public void setBackgroundD(int a, int b, int c) {
		this.button4.setBackground(new Color(a,b,c));
	}
	
	
//	public void setColorButtonA(int color) {
//		this.button1.setBackground(new Color(color));
//	}
//	
//	public void setTextLabelB(String labelB) {
//		this.label2.setText(labelB);
//	}
//	
//	public void setTextLabelC(String labelC) {
//		this.label3.setText(labelC);
//	}
//	
//	public void setTextLabelD(String labelD) {
//		this.label4.setText(labelD);
//	}




	public JLabel getLabel1() {
		return label1;
	}




	public void setLabel1(JLabel label1) {
		this.label1 = label1;
	}




	public JLabel getLabel2() {
		return label2;
	}




	public void setLabel2(JLabel label2) {
		this.label2 = label2;
	}




	public JLabel getLabel3() {
		return label3;
	}




	public void setLabel3(JLabel label3) {
		this.label3 = label3;
	}




	public JLabel getLabel4() {
		return label4;
	}




	public void setLabel4(JLabel label4) {
		this.label4 = label4;
	}




	public JButton getButton1() {
		return button1;
	}




	public void setButton1(JButton button1) {
		this.button1 = button1;
	}




	public JButton getButton2() {
		return button2;
	}




	public void setButton2(JButton button2) {
		this.button2 = button2;
	}




	public JButton getButton3() {
		return button3;
	}




	public void setButton3(JButton button3) {
		this.button3 = button3;
	}




	public JButton getButton4() {
		return button4;
	}




	public void setButton4(JButton button4) {
		this.button4 = button4;
	}




	public void results() {
		System.out.println("End");
	}
	

}

