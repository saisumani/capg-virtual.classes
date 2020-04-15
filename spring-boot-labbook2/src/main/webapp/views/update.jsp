<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Trainee Info</h2>
      <br>
     <form action="update" method="post" >
     <table border="3">
        <tr><td>Trainee Id</td><td><input type="number" name="traineeId" placeholder="${trainee.traineeId }" required="required"></td></tr>
        <tr><td>Trainee Name</td><td><input type="text" name="traineeName" placeholder="${trainee.traineeName }" required="required"></td></tr>
        <tr><td>Trainee Location</td><td><input type="text" name="traineeLocation" placeholder="${trainee.traineeLocation }" required="required"></td></tr>
        <tr><td>Trainee Domain</td><td><input type="text" name="traineeDomain" placeholder="${trainee.traineeDomain }" required="required"></td></tr>
        <tr><td><button type="submit">Modify</button></td></tr>
    </table>
    </form>
</body>
</html>