$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSky.feature");
formatter.feature({
  "line": 1,
  "name": "Timeline",
  "description": "",
  "id": "timeline",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "timeline;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on DarkSky home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I verify timeline is displayed with 2 hours increment",
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
});