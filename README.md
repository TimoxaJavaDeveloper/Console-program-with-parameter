public String Console_Program = "Registration with number, mail, password verification";

public String infoProgram(){

public String info = "This program checks the registration data received from the user.

What the program does initially:
1. It asks for a name
2. Welcomes the user
3. Asks to enter data such as: number, mail, password and password confirmation.
4. processes the answers.

How processing occurs:
1. Number:
Checks the length first.
Country code check
Checks the operator or city where the number was created, depending on the country, and if everything is correct, it returns a value (true).
The program finds out about the number: country, operator or city where the number was created.

2. Mail:
Checking for length. 
Checking for last characters e.g. @gmail.com
And if everything is correct it returns(true).

3. Password:
But there everything is logical, we write, check on the length that was not less than 8 characters and do additional check with the re-entry of the password.
And if everything is correct it returns (true).


And at the end of it completes a method that looks at all boolean parameters, and if all are correct, then displays message about completed registration, and if something is wrong, it shows error and input errors.

This is my first job, don't judge. See you all later 😄";

return info;
}
