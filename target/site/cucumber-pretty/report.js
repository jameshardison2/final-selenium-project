$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Hotels_SearchResultsPage.feature");
formatter.feature({
  "line": 2,
  "name": "Search Results",
  "description": "",
  "id": "search-results",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@searchResults"
    }
  ]
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Verify user can only view the result by selected property class",
  "description": "",
  "id": "search-results;verify-user-can-only-view-the-result-by-selected-property-class",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@searchResults2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I select property class \u003cstars\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify system displays only \u003cstars\u003e hotels on search result",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "search-results;verify-user-can-only-view-the-result-by-selected-property-class;",
  "rows": [
    {
      "cells": [
        "stars"
      ],
      "line": 19,
      "id": "search-results;verify-user-can-only-view-the-result-by-selected-property-class;;1"
    },
    {
      "cells": [
        "5 stars"
      ],
      "line": 20,
      "id": "search-results;verify-user-can-only-view-the-result-by-selected-property-class;;2"
    },
    {
      "cells": [
        "4 stars"
      ],
      "line": 21,
      "id": "search-results;verify-user-can-only-view-the-result-by-selected-property-class;;3"
    },
    {
      "cells": [
        "3 stars"
      ],
      "line": 22,
      "id": "search-results;verify-user-can-only-view-the-result-by-selected-property-class;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 240231610023,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsSD_ResultsBySelectedPropertyClass.iAmOnLandingPageHotels()"
});
formatter.result({
  "duration": 88935725655,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Owners-MacBook-Pro.local\u0027, ip: \u002710.242.7.224\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u00271.8.0_232\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/ts/swc6t7k15_s...}, goog:chromeOptions: {debuggerAddress: localhost:50862}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e13ee26f73cddaa07ebdb8bc7d2155d7\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat framework.webPages.BasePage.clickOn(BasePage.java:22)\n\tat framework.webPages.Hotels_LandingPage.clickOnSearchButton(Hotels_LandingPage.java:18)\n\tat stepdefinition.HotelsSD_ResultsBySelectedPropertyClass.iAmOnLandingPageHotels(HotelsSD_ResultsBySelectedPropertyClass.java:28)\n\tat ✽.Given I am on default locations search result screen(Hotels_SearchResultsPage.feature:5)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify user can only view the result by selected property class",
  "description": "",
  "id": "search-results;verify-user-can-only-view-the-result-by-selected-property-class;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@searchResults"
    },
    {
      "line": 13,
      "name": "@searchResults2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I select property class 5 stars",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify system displays only 5 stars hotels on search result",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5 stars",
      "offset": 24
    }
  ],
  "location": "HotelsSD_ResultsBySelectedPropertyClass.clickOnFiveStars(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5 stars",
      "offset": 30
    }
  ],
  "location": "HotelsSD_ResultsBySelectedPropertyClass.verifyStars(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 12585894520,
  "status": "passed"
});
formatter.before({
  "duration": 45543195236,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsSD_ResultsBySelectedPropertyClass.iAmOnLandingPageHotels()"
});
formatter.result({
  "duration": 16664654471,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify user can only view the result by selected property class",
  "description": "",
  "id": "search-results;verify-user-can-only-view-the-result-by-selected-property-class;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@searchResults"
    },
    {
      "line": 13,
      "name": "@searchResults2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I select property class 4 stars",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify system displays only 4 stars hotels on search result",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4 stars",
      "offset": 24
    }
  ],
  "location": "HotelsSD_ResultsBySelectedPropertyClass.clickOnFiveStars(String)"
});
formatter.result({
  "duration": 106256438,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4 stars",
      "offset": 30
    }
  ],
  "location": "HotelsSD_ResultsBySelectedPropertyClass.verifyStars(String)"
});
formatter.result({
  "duration": 17835370883,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027additional-info\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Owners-MacBook-Pro.local\u0027, ip: \u002710.242.7.224\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u00271.8.0_232\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/ts/swc6t7k15_s...}, goog:chromeOptions: {debuggerAddress: localhost:51042}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 8987087c31fe5e5458e3e829e1e3238a\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027additional-info\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat stepdefinition.HotelsSD_ResultsBySelectedPropertyClass.verifyStars(HotelsSD_ResultsBySelectedPropertyClass.java:50)\n\tat ✽.Then I verify system displays only 4 stars hotels on search result(Hotels_SearchResultsPage.feature:16)\n",
  "status": "failed"
});
formatter.after({
  "duration": 915443607,
  "status": "passed"
});
formatter.before({
  "duration": 9495727252,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsSD_ResultsBySelectedPropertyClass.iAmOnLandingPageHotels()"
});
formatter.result({
  "duration": 18195129768,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Owners-MacBook-Pro.local\u0027, ip: \u002710.242.7.224\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u00271.8.0_232\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/ts/swc6t7k15_s...}, goog:chromeOptions: {debuggerAddress: localhost:51189}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 008a202bc9afe8c61907153f40ac450d\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat framework.webPages.BasePage.clickOn(BasePage.java:22)\n\tat framework.webPages.Hotels_LandingPage.clickOnSearchButton(Hotels_LandingPage.java:18)\n\tat stepdefinition.HotelsSD_ResultsBySelectedPropertyClass.iAmOnLandingPageHotels(HotelsSD_ResultsBySelectedPropertyClass.java:28)\n\tat ✽.Given I am on default locations search result screen(Hotels_SearchResultsPage.feature:5)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify user can only view the result by selected property class",
  "description": "",
  "id": "search-results;verify-user-can-only-view-the-result-by-selected-property-class;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@searchResults"
    },
    {
      "line": 13,
      "name": "@searchResults2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I select property class 3 stars",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I verify system displays only 3 stars hotels on search result",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3 stars",
      "offset": 24
    }
  ],
  "location": "HotelsSD_ResultsBySelectedPropertyClass.clickOnFiveStars(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3 stars",
      "offset": 30
    }
  ],
  "location": "HotelsSD_ResultsBySelectedPropertyClass.verifyStars(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 974358416,
  "status": "passed"
});
});