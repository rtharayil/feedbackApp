package Features.support;

import com.rtharayil.feedback.FeedbackTemplate;

import Features.steps.FeedbackSurvey;



public class KnowsTheDomain {

	private FeedbackTemplate feedbackTemplate;
	private FeedbackSurvey feedbackSurvey;
	public FeedbackTemplate getFeedbackTemplate(){
		
		if (feedbackTemplate == null){
			feedbackTemplate = new FeedbackTemplate();
		}

		return feedbackTemplate;
	}
	public FeedbackSurvey getFeedbackSurvey(){
		if (feedbackSurvey == null){
			feedbackSurvey = new FeedbackSurvey();
		}
		return feedbackSurvey;
	}
	
	
}
