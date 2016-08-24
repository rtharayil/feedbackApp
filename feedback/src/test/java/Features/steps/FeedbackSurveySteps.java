package Features.steps;



import java.util.List;

import org.junit.Assert;

import Features.support.KnowsTheDomain;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class FeedbackSurveySteps {
	private KnowsTheDomain helper;

	public FeedbackSurveySteps(KnowsTheDomain helper){
		this.helper=helper;
	}
	
	private void prepareFeedbackTempalte(String name, List<String> feilds){
	helper.getFeedbackTemplate().setName(name);
		for(String feild : feilds){
			helper.getFeedbackTemplate().insertFeedbackField(feild);
		}
	}
	@Given("^the feedback template \"(.*?)\" with fields$")
	public void the_feedback_template_with_fields(String name, List<String> feilds) throws Throwable {
		prepareFeedbackTempalte(name,feilds);
		helper.getFeedbackSurvey().setTemaplate(helper.getFeedbackTemplate());
	}



	@When("^the event organiser updates speaker name \"(.*?)\" , image \"(.*?)\" and topic \"(.*?)\"$")
	public void the_event_organiser_updates_speaker_name_image_and_topic(String name, String imagePath, String topic) throws Throwable {
		FeedbackSurvey feedbackSurvey = helper.getFeedbackSurvey();
		feedbackSurvey.setSpeakerName(name);
		feedbackSurvey.setSpeakerPic(imagePath);
		feedbackSurvey.setTopic(topic);
		feedbackSurvey.create();
	}

	@Then("^the feedback survey should be created with name \"(.*?)\"$")
	public void the_feedback_survey_should_be_created_with_name(String arg1) throws Throwable {
	    Assert.assertEquals(arg1, helper.getFeedbackSurvey().getFeedbackSurveyName());
	}

	@Given("^a feedback survey has been initiated using the \"(.*?)\" template$")
	public void a_feedback_survey_has_been_initiated_using_the_template(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^Participant has updated her details and rating as$")
	public void participant_has_updated_her_details_and_rating_as(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Given("^submits the survey entry$")
	public void submits_the_survey_entry() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the survey entry should be saved$")
	public void the_survey_entry_should_be_saved() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
