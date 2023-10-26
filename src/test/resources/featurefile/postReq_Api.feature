Feature: Post Order Details API

  @Api
  Scenario Outline: Add Student Details using  Post Api Request
    Given user should have the base URL "<base_URL>"
    When user creates post request with "/api/studentsDetails" endpoint
    Then user should get a status code as "200" in response
    Examples:
     | base_URL                      |
     | https://thetestingworlapi.com |

      
      