Feature: WiFi Troubleshooting for Fiber Internet Customers

  Background:
    Given the customer support representative has access to the service activation and configuration API
    And the customer support representative has access to the service test management API

  Scenario: Diagnose and resolve weak WiFi signal
    Given a customer with subscriber ID "SVTAL001" reports a weak WiFi signal
    When the support representative initiates a diagnostic test
    Then the service test API should return a test ID
    And the diagnostic result should indicate low WiFi signal strength
    When the support representative uses the configuration API to change the WiFi channel
    Then the configuration API should return a success response
    And the customer should report improved WiFi signal strength

