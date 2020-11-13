# BankAccountMgtViaSMS

# Overview
The application is designed to handle user requests and to basically perform some functions like getting account balance of the user, transfer funds to another account and getting total amount transferred to a specific account. The user has a mobile device which is registered with the bank and given specific ID and stored in the bank database. User can send SMS like SEND-amount-accountName, TOTAL-SENT-accountName, and BALANCE. These SMS requests goes to twilio like service and from there our application will receive request which will have the information of the SMS the account holder sent along with information of the deviceId of the account holder. DeviceId of the account holder is utilized to find the account of the user in the database and perform the transaction based on the SMS request of the user.
We will develop the application in an agile process and utilize version control system Git to effective manage releases. In the first iteration of the development we will release version 1 and in the second iteration we will release version 2 and in the third iteration we will release version 3 of our application which will have all the features described below.

# Version1:
Develop API to manage ‘SEND-amount-accountName’ feature.
This API will send back success or failure of the request.
# Version2:
Develop API to manage ‘TOTAL-SENT-accountName’ feature.
This API will send back success or failure of the request along with the total amount sent to particular user.
# Version3:
Develop API to manage ‘BALANCE’ feature.
This API will send back success or failure of the request along with current balance of the user.

All the above versions are managed, developed and released using Git version control by following Git flow. 
Git flow is designed to effectively manage multiple versions of the application, their releases, promote hot fixes and their merges to develop branches. We create feature branches to develop each of the above features. After each feature development, we merge this feature branch to develop. When it is time for release, we branch out a release branch from develop and name it based on the year/month/week. For example, our release branch name could be 20.10.400, 20 for year, 10 for October month and 400 for 4th week. After the release branch deployed in production, we merge this release branch to master branch, which will have all the commits from inception of the project to current deployed branch in production. If there any bugs found in prod, we create hot fix branch from our release branch and promote the fix to that branch and merge the branch to release. After the deployment of the hotfix, we perform merge to master and develop branches to get our hotfix into current develop branch and also master.

# Tools utilized to develop the application:
•	Java 8 as Programming Language
•	SpringBoot as web application development framework 
•	EclipseIDE – Integrated development environment for developing the application
•	Apache Maven – For building the application
•	Junit – For developing and running tests on the application
•	Git – for version control and GitHub as source code repository
