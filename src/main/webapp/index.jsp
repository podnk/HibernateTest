<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<html>
	<title>Домашняя страница</title>
<body>
	<h2>Добро пожаловать!</h2>

	<form action="selectPage" method="post">
		Логин: 	<input type="text" 		name="loginLog"/> <Br>
		Пароль: <input type="password" 	name="passwordLog"/> <Br>
				<input type="submit" 	name="enter" 	value="Войти"/>
				<input type="submit" 	name="register" value="Регистрация"/> <Br>
	</form>
	
</body>
</html>
