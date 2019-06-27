$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:AskGanesha1.feature");
formatter.feature({
  "name": "Verify the functionality of AskGanesha Love site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the appearence and functionality of Love Link on AskGanesha Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    }
  ]
});
formatter.step({
  "name": "I see the Love Link",
  "keyword": "Given "
});
formatter.match({
  "location": "AskGanesha_Steps.I_see_the_Love_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Love Link",
  "keyword": "When "
});
formatter.match({
  "location": "AskGanesha_Steps.I_click_on_the_Love_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I confirm that the Love page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AskGanesha_Steps.I_confirm_that_the_Love_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:AskGanesha2.feature");
formatter.feature({
  "name": "Verify the functionality of AskGanesha site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the user has landed correctly on the Landing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Second"
    }
  ]
});
formatter.step({
  "name": "I see the GaneshJee Image",
  "keyword": "Given "
});
formatter.match({
  "location": "AskGanesha_Steps.I_see_the_GaneshJee_Image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify various elements on AskGanesha Landing Page",
  "keyword": "When "
});
formatter.match({
  "location": "AskGanesha_Steps.I_verify_various_elements_on_AskGanesha_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I confirm that user has reached the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "AskGanesha_Steps.I_confirm_that_user_has_reached_the_home_page()"
});
formatter.result({
  "status": "passed"
});
});