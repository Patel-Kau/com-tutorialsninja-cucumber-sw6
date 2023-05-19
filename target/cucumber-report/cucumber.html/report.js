$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("accountloginpage.feature");
formatter.feature({
  "line": 1,
  "name": "Account login Page Test",
  "description": "",
  "id": "account-login-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5241890800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verify user should navigate to the login page successfully",
  "description": "",
  "id": "account-login-page-test;verify-user-should-navigate-to-the-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on My account tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on account option \"Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Verify the text \"Returning Customer\" on Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.userIsOnTheHomepage()"
});
formatter.result({
  "duration": 72285000,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginPageSteps.userClickOnMyAccountTab()"
});
formatter.result({
  "duration": 1140418900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 30
    }
  ],
  "location": "AccountLoginPageSteps.userClickOnAccountOption(String)"
});
formatter.result({
  "duration": 480556300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Returning Customer",
      "offset": 17
    }
  ],
  "location": "AccountLoginPageSteps.verifyTheTextOnLoginPage(String)"
});
formatter.result({
  "duration": 54194000,
  "status": "passed"
});
formatter.uri("accountregisterpage.feature");
formatter.feature({
  "line": 1,
  "name": "Account Register Page Test",
  "description": "",
  "id": "account-register-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4387023400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user should navigate to login page successfully",
  "description": "",
  "id": "account-register-page-test;verify-user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on My account tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on account option \"Register\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the text \"Register Account\" on register page",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.userIsOnTheHomepage()"
});
formatter.result({
  "duration": 21100,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginPageSteps.userClickOnMyAccountTab()"
});
formatter.result({
  "duration": 1087174700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 30
    }
  ],
  "location": "AccountLoginPageSteps.userClickOnAccountOption(String)"
});
formatter.result({
  "duration": 21085053900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register Account",
      "offset": 17
    }
  ],
  "location": "AccountRegisterPageTestSteps.verifyTheTextOnRegisterPage(String)"
});
formatter.result({
  "duration": 41877500,
  "status": "passed"
});
formatter.uri("laptopsandnotebookspage.feature");
formatter.feature({
  "line": 1,
  "name": "Laptops and Notebooks Page Test",
  "description": "",
  "id": "laptops-and-notebooks-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4313793700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify product price display High to Low successfully",
  "description": "",
  "id": "laptops-and-notebooks-page-test;verify-product-price-display-high-to-low-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user select currency \"£Pound Sterling\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User mouse hover on Laptops And Notebooks Link And Click",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User select menu option \"Show AllLaptops \u0026 Notebooks\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user select sort by option \"Price (High \u003e Low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify all product shorted in price (High \u003e Low) order",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.userIsOnTheHomepage()"
});
formatter.result({
  "duration": 22700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£Pound Sterling",
      "offset": 22
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.userSelectCurrency(String)"
});
formatter.result({
  "duration": 1861036500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.userMouseHoverOnLaptopsAndNotebooksLinkAndClick()"
});
formatter.result({
  "duration": 178283200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show AllLaptops \u0026 Notebooks",
      "offset": 25
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.userSelectMenuOption(String)"
});
formatter.result({
  "duration": 2246557800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 28
    }
  ],
  "location": "LaptopsAndNotebooksTestSteps.userSelectSortByOption(String)"
});
formatter.result({
  "duration": 475449300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.verifyAllProductShortedInPriceHighLowOrder()"
});
formatter.result({
  "duration": 22600,
  "status": "passed"
});
formatter.uri("topmenu.feature");
formatter.feature({
  "line": 1,
  "name": "Top Menu Test",
  "description": "",
  "id": "top-menu-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4164678800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify user should navigate to desktops page successfully",
  "description": "",
  "id": "top-menu-test;verify-user-should-navigate-to-desktops-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Mouse hover on DesktopsMenu Tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Select Menu \"Show AllDesktops\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the text \"Desktops\" on desktop page",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.userIsOnTheHomepage()"
});
formatter.result({
  "duration": 25400,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.mouseHoverOnDesktopsMenuTabAndClick()"
});
formatter.result({
  "duration": 160894300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show AllDesktops",
      "offset": 13
    }
  ],
  "location": "TopMenuSteps.selectMenu(String)"
});
formatter.result({
  "duration": 1933580600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Desktops",
      "offset": 17
    }
  ],
  "location": "TopMenuSteps.verifyTheTextOnDesktopPage(String)"
});
formatter.result({
  "duration": 29720000,
  "status": "passed"
});
});