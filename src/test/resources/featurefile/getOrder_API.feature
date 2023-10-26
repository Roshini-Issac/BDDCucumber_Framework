Feature: Get details using Get Api request

@Api
 Scenario Outline: Get Student Details through get Request

    Given user should have the base URL "<base_URL>"
    When user fetches the records with "/api/studentsDetails/<Id>" endpoint
    Then user should get status code "200" in response

   Examples:
    | base_URL                     | Id |
    | https://testingworldapi.com  | 8343027   |