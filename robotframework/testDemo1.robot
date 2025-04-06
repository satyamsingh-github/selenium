*** Settings ***
Documentation     Test login functionality using external variables
Library           SeleniumLibrary
Library           Collections
Resource          resource.robot

Test Setup        Open Browser To Login Page
#Test Teardown     Close Browser

*** Test Cases ***

Login With Incorrect Credentials
    Input Username And Password    ${incorrect_user}    ${incorrect_pass}
    Click Login Button
    Wait Until Element Is Visible    css:.alert-danger
    Page Should Contain    Incorrect username/password.

Login With Correct Credentials
    Input Username And Password    ${username}    ${password}
    Click Login Button
    Wait Until Element Is Visible    css:.my-4
    Verify Card Titles in the shop page

*** Keywords ***
Open Browser To Login Page
    Open Browser    ${login_url}    chrome
    Maximize Browser Window

Input Username And Password
    [Arguments]    ${user}    ${pwd}
    Input Text    id=username    ${user}
    Input Text    id=password    ${pwd}

Click Login Button
    Click Button    id=signInBtn
    
Verify Card Titles in the shop page
    @{expected_list}=    Create List    iphone X    Samsung Note 8    Nokia Edge    Blackberry
    ${elements} =  Get WebElements    css:.card-title
    @{actual_list}=    Create List

    FOR  ${item}   IN    @{elements}
             log to console     ${item.text}
             Append To List     ${actual_list}    ${item.text}
    END    
    
    Lists Should Be Equal    ${actual_list}     ${expected_list}
