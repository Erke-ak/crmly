$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/activityStream/mainPage.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@main_page"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in \"hr\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Subtitles of Activity Stream",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@main_page"
    },
    {
      "name": "@subtitles"
    }
  ]
});
formatter.step({
  "name": "User verified that following subtitles are displayed for Activity Stream",
  "rows": [
    {
      "cells": [
        "Activity Stream"
      ]
    },
    {
      "cells": [
        "Tasks"
      ]
    },
    {
      "cells": [
        "Chat and Calls"
      ]
    },
    {
      "cells": [
        "Workgroups"
      ]
    },
    {
      "cells": [
        "Drive"
      ]
    },
    {
      "cells": [
        "Calendar 9"
      ]
    },
    {
      "cells": [
        "Mail"
      ]
    },
    {
      "cells": [
        "Contact Center"
      ]
    },
    {
      "cells": [
        "Time and Reports"
      ]
    },
    {
      "cells": [
        "Employees"
      ]
    },
    {
      "cells": [
        "Services"
      ]
    },
    {
      "cells": [
        "Company"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MainPageStepDefinitions.user_verified_that_following_subtitles_are_displayed_for_Activity_Stream(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});