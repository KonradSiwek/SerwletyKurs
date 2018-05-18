<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pierwsze JSP</title>
</head>
<body>
<h1>Druga strona JSP</h1>
<p>Zwykły tekst</p>

<h2>Expression Language</h2>
<p>Wynik dodawania: ${3 + 2}</p>
<%-- To nie zadziała, bo w EL nie wpisuje się dowolnego kodu Javy
<p>Wynik dodawania: ${LocalTime.now()}</p>
--%>

<jsp:useBean id="zegar" class="serwlety.Zegar"/>
<p>Teraz jest godzina: ${zegar.czas}</p>

</body>
</html>


