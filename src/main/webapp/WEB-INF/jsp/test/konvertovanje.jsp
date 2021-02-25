<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html;
 charset=ISO-8859-1">
<title>Konvertovanje</title>
</head>
<body>
<form action="/MyApp/Menjacnica/konvertujValutu" method="post">
<select name="izValute" class="form-select">
  <option selected>Izaberi iz koje valute</option>
  <c:forEach var="valuta" items="${listaValuta}">
  <option value="${valuta}">${valuta}</option>
  </c:forEach>
</select>
<select name="uValutu" class="form-select">
    <option selected>Izaberi u koju valutu</option>
    <c:forEach var="valuta" items="${listaValuta}">
        <option value="${valuta}">${valuta}</option>
    </c:forEach>
</select>
<div class="input-group flex-nowrap">
    <span class="input-group-text" id="addon-wrapping">@</span>
    <input name="kolicina" type="text" class="form-control" placeholder="Unesi kolicinu" aria-label="Username" aria-describedby="addon-wrapping">
</div>
<h1>${rezultat}</h1>

<button type="submit">Izracunaj</button>
</form>
</body>
</html>