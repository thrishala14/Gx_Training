package onlineExamPortal;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.ArrayList;

class Category {
String categoryName;
	
	ArrayList<Topic> topics;

	public Category(String categoryName, ArrayList<Topic> topics) {
		super();
		this.categoryName = categoryName;
		this.topics = topics;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void getTopics() {
		for(Topic t: topics) {
			System.out.println(t.getQuestions());
		}
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setTopics(ArrayList<Topic> topics) {
		this.topics = topics;
	}
}
