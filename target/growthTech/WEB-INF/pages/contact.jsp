<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring 3 MVC Series - Contact Manager</title>
</head>
<body>
<h2>Contact Manager</h2>
<form:form method="post" action="addContact" modelAttribute="contact" enctype="multipart/form-data">
 
    <table>
    <tr>
        <td><form:label path="firstname">First Name</form:label></td>
        <td><form:input path="firstname" /></td> 
    </tr>
    <tr>
        <td><form:label path="lastname">Last Name</form:label></td>
        <td><form:input path="lastname" /></td>
    </tr>
    <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="telephone">Telephone</form:label></td>
        <td><form:input path="telephone" /></td>
    </tr>
    
    <tr>
        <td><form:label path="photo">Photo</form:label></td>
        <td><input path="photo" type="file" name="photo"></input></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Contact"/>
        </td>
    </tr>
</table>  
     
</form:form>
</body>
</html>