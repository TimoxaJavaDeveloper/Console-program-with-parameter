🖥 Eng:

public String Console_Program = "Registration with number, mail, password verification";

public String infoProgram(){

public String info = "This program checks the registration data received from the user.

What the program does first:

1. Requests a name
2. Welcomes the user
3. Asks for data such as: number, mail, password and password confirmation.
4. Processes the answers.

How the processing happens:

1. Number: 
First checks the length then checks the country code Checks the operator or city where the number was created, depending on the country, and if everything is correct, returns a value (true). The program finds out the following information about the number: country, operator or city where the number was created.

2. Mail: 
Checks the length. Checks if last characters are present, e.g. @gmail.com And if everything is correct, returns value (true).

3. Password: 
And here everything is logical: we write it and check its length to be not less than 8 symbols, and do additional check with reenter password. And if everything is correct, it returns (true).

And at the end it completes a method that looks at all boolean parameters, and if everything is correct, it outputs a message about completed registration, and if something is wrong, it outputs an error or input error.

This is my first project so don't judge it too harshly. See you later."

return info;
}

🖥 Rus:

public String Console_Program = "Регистрация с проверкой номера, почты, пароля";

public String infoProgram(){

public String info = "Эта программа проверяет регистрационные данные, полученные от пользователя.

Что делает программа вначале:

1. Запрашивает имя
2. Приветствует пользователя
3. Просит ввести данные, такие как: номер, почта, пароль и подтверждение пароля.
4. обрабатывает ответы.

Как происходит обработка:

1. Номер: 
Сначала проверяется длина потом проверка кода страны Проверяет оператора или город, где был создан номер, в зависимости от страны, и если все правильно, возвращает значение (true). Программа узнает о номере: страну, оператора или город, где был создан номер.

2. Почта: 
Проверка длины. Проверяет наличие последних символов, например, @gmail.com И если все правильно, возвращает значение (true).

3. Пароль: 
А вот тут все логично, пишем, проверяем на длину, чтобы было не менее 8 символов и делаем дополнительную проверку с повторным вводом пароля. И если все правильно, то возвращается (true).

И в конце завершает метод, который смотрит все булевы параметры, и если все правильно, то выводит сообщение о завершенной регистрации, а если что-то не так, то выводит ошибку или ошибку ввода.

Это мой первый проек так что не судите строго. Увидимся позже."

return info;
}
