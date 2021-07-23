package injectlist;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	
	private int questionId;
	private String bestfriends;
	private List<String> answerinlist;
	private Set<String> answerinset;
	private Map<Integer,String> answerinmap;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getBestfriends() {
		return bestfriends;
	}
	public void setBestfriends(String bestfriends) {
		this.bestfriends = bestfriends;
	}
	public List<String> getAnswerinlist() {
		return answerinlist;
	}
	public void setAnswerinlist(List<String> answerinlist) {
		this.answerinlist = answerinlist;
	}
	public Set<String> getAnswerinset() {
		return answerinset;
	}
	public void setAnswerinset(Set<String> answerinset) {
		this.answerinset = answerinset;
	}
	public Map<Integer, String> getAnswerinmap() {
		return answerinmap;
	}
	public void setAnswerinmap(Map<Integer, String> answerinmap) {
		this.answerinmap = answerinmap;
	}
	
	public void listofmyfriends()
	{
		System.out.println("Question ID\n"+getQuestionId() +"\n"+
	
				"Question\n "+getBestfriends()+"\n"+
				"Answers in the List format \n"+ answerinlist+"\n"+
				"Answers in the Set format \n"+ answerinset+"\n"+
				"Answers in the Map format \n"+ answerinmap+"\n");
					}

}
