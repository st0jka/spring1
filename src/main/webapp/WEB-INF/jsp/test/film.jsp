<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html;
 charset=ISO-8859-1">
<title>Start Spring MVC</title>
</head>
<body>
<form action="postFilm" method="post">
<input type="text" name="naziv" placeholder="naziv"/>
<input type="text" name="zanr" placeholder="zanr"/>
<input type="text" name="trajanje" placeholder="trajanje"/>
<button>Submit</button>
</form>
<form action="deleteFilm" method="post">
<input type="hidden">
<c:forEach items="${listaFilmova}" var="film">
    <input type="hidden" value="${film.idFilm}" name="idFilm"/>

    <h1>${film.naslov}<br></h1>
    <button type="submit">Obrisi</button>
    <button onclick="myFunction('${film.idFilm}','${film.naslov}','${film.zanr}','${film.trajanje}')" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">Pregled</button>

</c:forEach>
</form>
<form action="updateFilmPost" method="post">
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Update</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <input Type="hidden" name="idFilm" id="idFilm"/>
        <input Type="text" name="naslov" id="naslov"/>
        <input Type="text" name="zanr" id="zanr"/>
        <input Type="text" name="trajanje" id="trajanje"/>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</form>
<script>
function myFunction(idFilm, naslov, zanr, trajanje) {
document.getElementById("idFilm").value = idFilm;
document.getElementById("naslov").value = naslov;
document.getElementById("zanr").value = zanr;
document.getElementById("trajanje").value = trajanje;
}
</script>
</body>
</html>