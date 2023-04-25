package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import model.quizModel;
import view.HomePage;
import view.Score;

public class ScoreController implements ActionListener {
	private Score sc;
	private quizModel qm;
	

	public ScoreController() {
//		this.sc = 0;
	}
	
	public ScoreController(Score sc) {
		this.sc = sc;
	}

	public void show() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String rs = e.getActionCommand();
		
		if(rs == "Reset") {
			sc.dispose();
			new HomePage();
		}
		
	}

}
