package com.rtharayil.feedback;

import java.util.ArrayList;
import java.util.List;

public class FeedbackTemplate {

	private String eventName;
	private ArrayList<String> feedbackFields ;
	public FeedbackTemplate() {
		this.eventName = "null";
		feedbackFields = new ArrayList<String>();
	}
	public Boolean isFeedbackTemplateEmpty(){
		return feedbackFields.isEmpty();
	}
	public String Name(){
		return eventName;
	}
	public void insertFeedbackField(String fieldTitle) {
		
		String feedbackField = new String(fieldTitle);
		feedbackFields.add(feedbackField);
	}
	public String getLastFeedbackFeild() {
		return feedbackFields.get(feedbackFields.size()-1);
	}
	public void setName(String eventName2) {
		eventName = eventName2;
		
	}
	public List<String> getFeilds() {
		
		return feedbackFields;
	}
	

}
