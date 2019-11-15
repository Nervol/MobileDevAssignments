# MobileDevAssignments
------
# Assignment 1
1.При запуске программы появляется Login layout с пустыми полями ввода логина и пароля пользователя:
![alt text](https://sun9-34.userapi.com/c855120/v855120405/1686e5/PLbrUsO1Kuo.jpg)

2.После ввода значений при нажатии кнопки «LOGIN» выполняется метод setOnClickListener(), создается массив пользователей, в цикле проверяется соответствие введенного логина и пароля. 

3.Если совпадение через if (editTextUsername.getText().toString().equals(usersArray.get(i).getLogin()) &&
editTextPassword.getText().toString().equals(usersArray.get(i).getPassword())) найдено, то создается intent, принимающий в себя 
имя и идентификатор аватарки пользователя и запускается другое activity, содержащее в себе User’s layout.
![alt text](https://sun9-49.userapi.com/c855120/v855120405/1686f3/0NlCXq-pjkw.jpg)
![alt text](https://sun9-32.userapi.com/c855120/v855120405/1686fa/HTCshdJQFUQ.jpg)

4.Полученные из intent-а данные используются для добавления в текстовое поле имени пользователя «Hello, имя_пользователя!» и вывода его аватарки.
В случае, если введенные данные окажутся неверными или не совпадут ни с одним из пользователей, то с помощью Toast.makeText (всплывающее сообщение) выведется сообщение об ошибке и перехода на иное activity не произойдет.

![alt text](https://sun9-54.userapi.com/c855120/v855120405/1686ec/OI5_G_LkmY4.jpg)

Еще примеры:

![alt text](https://sun9-19.userapi.com/c855120/v855120405/16870f/lAc9uEJg-Ec.jpg)
![alt text](https://sun9-37.userapi.com/c855120/v855120405/168701/EiJbL_Tw3RI.jpg)
![alt text](https://sun9-35.userapi.com/c855120/v855120405/168708/PX_ssw37tII.jpg)
