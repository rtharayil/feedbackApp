Feature: Gather feedback from participants
  As an event organiser 
  I would want to collect feedback form my participants
  In order to understand areas of improvements

  Scenario: Initiate a new feedback survey
    Given the feedback template "Agile Coffee Talk" with fields
      | "Knowledge of the trainer" |
      | "Quality of the session"   |    
    When the event organiser updates speaker name "Sam" , image "sam.png" and topic "How to do someting when you know nothing"
    Then the feedback survey should be created with name "Agile Coffee Talk, session by Sam"

  Scenario: participants updating survey entry
    Given a feedback survey has been initiated using the "Agile Coffee Talk" template
    And Participant has updated her details and rating as
      | "Name"                     | "Jane"          |
      | "Email"                    | "Jane@jane.com" |
      | "Knowledge of the trainer" | "6"             |
      | "Quality of the session"   | "7"             |
    And submits the survey entry
    Then the survey entry should be saved

