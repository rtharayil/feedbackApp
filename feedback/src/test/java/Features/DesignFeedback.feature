Feature: Design a new Feedback template for an event
  As an event organiser 
  I would want to design a new feedback template for an event 
  In order to easily create a feedback form .

  Scenario: Create an empty feedback template for an event
    Given The organiser inputs Event name "Agile Coffee Talk "
    When the event Organizer request for new feed back template
    Then a new empty feedback template is created titled "Agile Coffee Talk "

  Scenario: Insert a feedback field into an empty feedback template
    Given An empty feedback template named "Agile Coffee Talk " is created
    When organiser inputs feedback field "Knowledge of a the trainer"
    Then a new feedback field should be created in the feedback template with the title "Knowledge of a the trainer"

  Scenario: Insert a feedback field to a non-empty feedback template
    Given An empty feedback template named "Agile Coffee Talk " is created
    And organizer inserts three fields in the feedback template
    When organiser inputs feedback field "Quality of the session"
    Then a new feedback field should be created in the feedback template with the title "Quality of the session"
