# birthdays-kata

## Exercise

Send a greetings email to all employees whose birthday is a given date loading them from a given repository, it is given as example a InMemoryDbClient, but **is not possible to modify this class to complete the exercise**.

The greetings email contains the following text:

```
Subject: Happy birthday!

Happy birthday, dear John!
with the first name of the employee substituted for “John”
```

## Goals
The goal of this exercise is to come up with a solution that is
### Testable
we should be able to test the internal application logic with no need to ever send a real email.
### Flexible
We anticipate that the data source in the future could change from a in memory db to a relational database, or perhaps a web service. We also anticipate that the email service could soon be replaced with a service that sends greetings through SMS or some other social network.
### Well-designed
Separate clearly the business logic from the infrastructure.

