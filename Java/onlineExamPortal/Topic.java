package onlineExamPortal;

import java.util.ArrayList;

class Topic{

	String topicName;
	
	ArrayList<Question> questions;

	public Topic(String topicName, ArrayList<Question> questions ) {
		super();
		this.topicName = topicName;
		this.questions = questions;
	}

	public String getTopicName() {
		return topicName;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	
	

	
}
