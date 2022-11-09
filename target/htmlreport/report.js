$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/new_signup.feature");
formatter.feature({
  "name": "Sign up to elearning website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sign up to elearning website through valid details",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to elearning application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitionclass.user_navigates_to_elearning_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Sign up button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitionclass.user_clicks_on_Sign_up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the valid user details and click on Register",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionclass.user_enters_the_valid_user_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sign up done successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitionclass.sign_up_done_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/sendmail.feature");
formatter.feature({
  "name": "Login to elearning website and send email",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to elearning website through valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to elearning application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitionclass.user_navigates_to_elearning_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitionclass.user_enters_the_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionclass.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is successfully logged into elearning website",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitionclass.user_is_successfully_logged_into_elearning_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Inbox and compose an email",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionclass.user_clicks_on_Inbox_and_compose_an_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Send Message button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionclass.user_click_on_Send_Message_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to send message successfully.",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionclass.user_is_able_to_send_message_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});