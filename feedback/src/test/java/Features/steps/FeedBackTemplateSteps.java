package Features.steps;

import org.junit.Assert;

import Features.support.KnowsTheDomain;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeedBackTemplateSteps {
	private KnowsTheDomain helper;
	
	private String eventName;
	
	public FeedBackTemplateSteps(KnowsTheDomain helper){
		this.helper=helper;
	}

	@Given("^The organiser inputs Event name \"(.*?)\"$")
	public void the_organiser_inputs_Event_name(String name) throws Throwable {
		eventName = name;
	}

	
	@When("^the event Organizer request for new feed back template$")
	public void the_event_Organizer_request_for_new_feed_back_template() throws Throwable {
		
		helper.getFeedbackTemplate().setName(eventName);
	}

	@Then("^a new empty feedback template is created titled \"(.*?)\"$")
	public void a_new_empty_feedback_template_is_created_titled(String name) throws Throwable {
		Assert.assertEquals(name, helper.getFeedbackTemplate().Name());
		Assert.assertTrue(helper.getFeedbackTemplate().isFeedbackTemplateEmpty());
		}

	@Given("^An empty feedback template named \"(.*?)\" is created$")
	public void an_empty_feedback_template_named_is_created(String name) throws Throwable {
	    this.the_organiser_inputs_Event_name(name);
	    this.the_event_Organizer_request_for_new_feed_back_template();
		this.a_new_empty_feedback_template_is_created_titled(name);
	}

	@When("^organiser inputs feedback field \"(.*?)\"$")
	public void organiser_inputs_feedback_field(String fieldTitle) throws Throwable {
		helper.getFeedbackTemplate().insertFeedbackField(fieldTitle);
	}

	@Then("^a new feedback field should be created in the feedback template with the title \"(.*?)\"$")
	public void a_new_feedback_field_should_be_created_in_the_feedback_template_with_the_title(String arg1) throws Throwable {
		Assert.assertEquals(arg1, helper.getFeedbackTemplate().getLastFeedbackFeild());
	}

	@Given("^organizer inserts three fields in the feedback template$")
	public void organizer_inserts_three_fields_in_the_feedback_template() throws Throwable {
		helper.getFeedbackTemplate().insertFeedbackField("Quality of the sessions");

		helper.getFeedbackTemplate().insertFeedbackField("Knowledge of the training ");
		helper.getFeedbackTemplate().insertFeedbackField("Training room infra" );
	}
	
	


}
