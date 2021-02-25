<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
 charset=ISO-8859-1">
<title>MENJACNICA TEST</title>
</head>
<body>
<h1>MENJACNICA TEST PAGE</h1>
${poruka}

<form action="/MyApp/Menjacnica/postMenjacnicaTest" method="post">
<input type="text" name="prvoPolje"/>
<input type="text" name="drugoPolje"/>
<button type="submit">SUBMIT</button>
</form>
</body>
</html>