Feature: End to End Tests in Covid-19 API
Description: Functional testing of Covid-19 District wise Data API

Scenario: User should be able to view the District wise data
Given Data of all the Covid in the country
When I get the details of all states in India
Then Covid details should be displayed with status code 200
And Verify District data

Scenario: Verify the headers of Covid API
Given Data of all the Covid in the country
When I get the details of all states in India
Then Verify the headers and log the data



