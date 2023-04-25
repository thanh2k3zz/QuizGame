package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.HomePage;
import view.quizView;

public class HomePageController implements ActionListener {
	private HomePage hp;
	private quizController qc;
	

	public HomePageController(HomePage hp) {
		this.hp = hp;
	}
	
	public HomePageController(HomePage hp, quizController qc) {
		this.hp = hp;
		this.qc = qc;
	}
	
	public void update() {
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		hp.dispose();
		new quizView();
		String sc = e.getActionCommand();
//			qc.nextQuestion();
		}
	}


