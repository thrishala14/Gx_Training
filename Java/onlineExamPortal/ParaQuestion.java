package onlineExamPortal;


class ParaQuestion implements Question{
	protected int questionNumber = 0;
	protected String question = " ";
	
	private String answer = " ";
	
	public ParaQuestion(int questionNumber, String question) {
		super();
		this.questionNumber = questionNumber;
		this.question = question;
		// TODO Auto-generated constructor stub
		answer = "answer for " +questionNumber;
		
		
	}
	
	@Override
	public String toString() {
		System.out.println(questionNumber + ". " + question);
		System.out.println("Ans.) " + answer);
		System.out.println("\n");
		return null;
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



