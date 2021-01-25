$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/protectiveinsurance/changepointreporting/HomePage.feature");
formatter.feature({
  "line": 3,
  "name": "HomePage Verification",
  "description": "I want to use this template for my feature file",
  "id": "homepage-verification",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@HomePage"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Verify changepoint application HomePage",
  "description": "",
  "id": "homepage-verification;verify-changepoint-application-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@HomePage"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User open BROWSER",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User navigates to URL",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Page title should be \"Changepoint Reporting\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});