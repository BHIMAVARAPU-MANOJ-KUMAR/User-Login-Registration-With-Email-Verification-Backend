# User-Login-Registration-With-Email-Verification-Backend
SpringBoot Application to Develop a Complete Backend Application for User Login and Registration using Spring Boot including Email Verification Links.

User-Login-Registration-With-Email-Verification-Backend included maildev smtp server is a project that allows users to create and verify their accounts using email. It uses Spring Boot as the backend framework, and maildev as the SMTP server for sending and receiving emails.

Here is a brief description of how it works:

1. The user fills out a registration details (for testing purposes using POSTMAN Client) with their First Name, Last Name, Email, Password, and Role.
2. The backend application also creates a verification token with an expiration time and sends it to the user’s email address (for testing purposes) using MAILDEV Script (MailDev WebApp will listens on port http://0.0.0.0:1080 localhost and MailDev SMTP Server listens on port http://0.0.0.0:1025).
3. The user receives an email with a link to activate their account. The link contains the verification token as a query parameter.
4. The user clicks on the link and is redirected to a confirmation page. The backend application validates the token and activates the user’s account if it is valid and not expired.
5. The user can then log in with their email and password. The backend application checks the credentials and grants access if they are correct.
6. You need to install nodeJS Runtime Environment on your system to work. To install email verification package, use: npm install -g maildev.

                                                                          THANK YOU ..... !!
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
