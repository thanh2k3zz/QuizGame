package model;

public class quizModel {
	private String[] questions = {
			"What color is your dog?",
			"Java is the best language?",
			"How to become a Java developer?"
		};

	public quizModel() {
		// TODO Auto-generated constructor stub
		this.results = "1";
	}

	private String[][] options = {
				{"Yellow", "Red", "White", "Black"},
				{"No", "Yes", "Right", "I don't know"},
				{"Find leader", "Don't sleep", "Study", "No way"}
		};
		
	private String[] answers = {
				"C",
				"D",
				"A",
				
		};
	
	private int total_questions = questions.length;
	private int index;
	private String results;
	private int correct_guesses = 0;
	
	public quizModel(String results) {
		this.results = results;
	}
	
	public String getResults() {
		System.out.println("ham get: " + results);
		return results;
	}
	public void setResults(String results) {
		this.results = results;
		this.getResults();
	}
	public int getCorrect_guesses() {
		return correct_guesses;
	}
	public void setCorrect_guesses(int correct_guesses) {
		this.correct_guesses = correct_guesses;
	}
	public String[] getQuestions() {
		return questions;
	}
	public void setQuestions(String[] questions) {
		this.questions = questions;
	}
	public String[][] getOptions() {
		return options;
	}
	public void setOptions(String[][] options) {
		this.options = options;
	}
	public String[] getAnswers() {
		return answers;
	}
	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	public int getTotal_questions() {
		return total_questions;
	}
	public void setTotal_questions(int total_questions) {
		this.total_questions = total_questions;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	
	public void increaseIndex() {
		index++;
	}
	
	public void increaseCorrect() {
		correct_guesses++;
	}
	
	
	
	
}
