package controller;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.Timer;

import model.quizModel;
import view.HomePage;
import view.Score;
import view.quizView;

public class quizController implements ActionListener {
	private quizView qv;
	private quizModel qm;
	private HomePage home;
	private Score score;
	
//	
//	public quizController() {
//		
//	}
	
	
	public quizController(quizView quizView, quizModel qm, Score score) {
		this.qv = quizView;
		this.qm = qm;
		this.score = score;
	}
	
	
	public quizController(quizView qv) {
		this.qv = qv;
	}
	
	public quizController (quizModel qm) {
		this.qm = qm;
	}
	
	public quizController(Score score) {
		this.score = score;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		
		
//		if (e.getActionCommand() == "Play") {
//            // Chuyển đến trang content
//            home.setVisible(false);;
//            qv.setVisible(false);
//        }
//		
//		
		String sc = e.getActionCommand();
////		
//		
		for (String[] row : this.qm.getOptions()) {
		    for (String value : row) {
		        System.out.print(value + " ");
		    }
		    System.out.println();
		}
		
		
		
		if (sc == this.qm.getAnswers()[this.qm.getIndex()]) {
			this.qm.increaseCorrect();
		}
		
		this.results();
		
		
//		this.score.setTextScore((int)(this.qm.getCorrect_guesses()/(double)this.qm.getTotal_questions())*100);
		
		displayAnswer(sc);
	}
	
	public void nextQuestion() {
		if(this.qm.getIndex() >= this.qm.getTotal_questions()) {
			qv.dispose();
			new Score(this.results());
		}else {
//			System.out.println("Index:  " + (this.qm.getIndex()));
			
			this.qv.setTextQuestion(this.qm.getQuestions()[this.qm.getIndex()]);
//			this.qv.setLabel1(new JLabel(this.qm.getQuestions()[this.qm.getIndex() - 1]));
			this.qv.setTextLabelA(this.qm.getOptions()[this.qm.getIndex() ][0]);
			this.qv.setTextLabelB(this.qm.getOptions()[this.qm.getIndex() ][1]);
			this.qv.setTextLabelC(this.qm.getOptions()[this.qm.getIndex() ][2]);
			this.qv.setTextLabelD(this.qm.getOptions()[this.qm.getIndex() ][3]);			

		}
	}
	
	
	public String results() {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		String formattedNumber = decimalFormat.format((double)(this.qm.getCorrect_guesses()/(double)this.qm.getTotal_questions())*100);
		System.out.println(formattedNumber);
//		this.qm.setResults(formattedNumber);
		System.out.println(formattedNumber);
		return formattedNumber;
	}
	
public void displayAnswer(String sc) {
		
//		timer.stop();
//		this.qv.setEnabled(false);
//		buttonB.setEnabled(false);
//		buttonC.setEnabled(false);
//		buttonD.setEnabled(false); 
	
		
//		if(this.qm.getAnswers()[this.qm.getIndex()] != sc) {
//			this.qv.setBackgroundA(98, 195, 112);
//		}else {
//			this.qv.setBackgroundA(0, 201, 133);
//		}
//		
//		if(this.qm.getAnswers()[this.qm.getIndex()] != sc) {
//			this.qv.setBackgroundB(98, 195, 112);
//		}else {
//			this.qv.setBackgroundB(0, 201, 133);
//		}
//		
//		if(this.qm.getAnswers()[this.qm.getIndex()] != sc) {
//			this.qv.setBackgroundC(98, 195, 112);
//		}else {
//			this.qv.setBackgroundC(0, 201, 133);
//		}
//		
//		if(this.qm.getAnswers()[this.qm.getIndex()] != sc) {
//			this.qv.setBackgroundD(98, 195, 112);
//		}else {
//			this.qv.setBackgroundD(0, 201, 133);
//		}
		
		this.qm.increaseIndex();
		nextQuestion();
		
	}

}
