package onlineExamPortal;

public interface Question {
	
	public abstract int getQuestionNumber(); 
	
	public abstract String getQuestion();
	
	public abstract void setQuestionNumber(int questionNumber) ;
	
	public abstract void setQuestion(String question);
		
}
