package Features.steps;

import java.util.HashMap;
import java.util.Map;

import com.rtharayil.feedback.FeedbackTemplate;

public class FeedbackSurvey {
	final private int DEFAULT_RATING =5;
	private FeedbackTemplate feedbackTemplate;
	private Map<String,Integer> SurveyEntrys;
	private String speakerName;
	private String picturePath;
	private String topic;
	private String FeedbackSurveyName;
	
	public String getFeedbackSurveyName(){
		return FeedbackSurveyName;
	}
	public void setTemaplate(FeedbackTemplate feedbackTemplate) {
		this.feedbackTemplate =feedbackTemplate;
		SurveyEntrys=new HashMap<String, Integer>();
		initSurveyEntrys();
		
	}
	private void initSurveyEntrys(){
		SurveyEntrys.clear();
		for(String feild : feedbackTemplate.getFeilds()){
			SurveyEntrys.put(feild, DEFAULT_RATING);
		}
	}
	public void setSpeakerName(String name) {
		speakerName = name;
		
	}
	public void setSpeakerPic(String imagePath) {
		picturePath = imagePath;
		
	}
	public void setTopic(String topic) {
		this.topic =topic;
	}
	public void create() {
		
		FeedbackSurveyName = feedbackTemplate.Name() + ", session by " +speakerName;
		
	}

}
