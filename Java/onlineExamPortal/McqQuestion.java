package onlineExamPortal;

import java.util.HashMap;
import java.util.Iterator;

class McqQuestion implements Question{
	protected int questionNumber = 0;
	protected String question = " ";
	
	HashMap<Integer, String> options = new HashMap<Integer, String>();
	
	public McqQuestion(int questionNumber, String question) {
		super();
		// TODO Auto-generated constructor stub
		this.questionNumber = questionNumber;
		this.question = question;
		options.put(1, "opt 1");
		options.put(2, "opt 2");
		options.put(3, "opt 3");
		options.put(4, "opt 4");
		
	}
	
	@Override
	public String toString() {
		System.out.println(questionNumber + ". " + question);
		for (HashMap.Entry<Integer, String> o : options.entrySet()) {
		    Integer key = o.getKey();
		    String value = o.getValue();
		    System.out.println(key + ") " +value);
		}
		System.out.println("\n");
		return ".";
	}

	@Override
	public int getQuestionNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setQuestionNumber(int questionNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setQuestion(String question) {
		// TODO Auto-generated method stub
		
	}
}

