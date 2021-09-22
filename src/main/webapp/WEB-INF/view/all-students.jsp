<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Student</h2>
<br>



<table>

<tr>
    <th>Name</th>
    <th>Mark</th>

</tr>

<c:forEach var="stud" items="${allStuds}">

    <c:url var="updateButton" value="/updateInfo">
        <c:param name="studId" value="${stud.id}"/>
    </c:url>

    <c:url var="deleteButton" value="/deleteStudent">
        <c:param name="studId" value="${stud.id}"/>
    </c:url>



    <tr>
        <td>${stud.name}</td>

        <td>${stud.mark}</td>
        <td>
            <input type="button" value="Update"
            onclick="window.location.href='${updateButton}'"/>

            <input type="button" value="Delete"
            onclick="window.location.href='${deleteButton}'"/>
        </td>


    </tr>


</c:forEach>


</table>

<br>

<input type="button" value="Add"
       onclick="window.location.href='addNewStudent'"/>





</body>





</html>