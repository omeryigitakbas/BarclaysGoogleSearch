$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/10054730/barclays/BarclaysSearchBDDFramework/src/main/java/Features/google_search.feature");
formatter.feature({
  "line": 1,
  "name": "Google search",
  "description": "As Barclays employee\r\nI want to search for Barclays keyword on google search\r\nSo That https://www.barclays.co.uk/ is the first result on results page",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Search for Barclays on google.com",
  "description": "",
  "id": "google-search;search-for-barclays-on-google.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have chrome browser opened",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I go to https://www.google.com/",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I type Barclays into search bar",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I hit search",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "https://www.barclays.co.uk/ is first url on search results page",
  "keyword": "Then "
});
formatter.match({
  "location": "BarclaysSearchSteps.open_chrome_browser()"
});
formatter.result({
  "duration": 2535762763,
  "status": "passed"
});
formatter.match({
  "location": "BarclaysSearchSteps.go_to_google()"
});
formatter.result({
  "duration": 1949346126,
  "status": "passed"
});
formatter.match({
  "location": "BarclaysSearchSteps.type_barclays_into_search_bar()"
});
formatter.result({
  "duration": 146651070,
  "status": "passed"
});
formatter.match({
  "location": "BarclaysSearchSteps.click_search()"
});
formatter.result({
  "duration": 2616632219,
  "status": "passed"
});
formatter.match({
  "location": "BarclaysSearchSteps.compare_first_url_on_search_results_page()"
});
formatter.result({
  "duration": 919010451,
  "status": "passed"
});
});