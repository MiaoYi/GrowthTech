<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring 3 MVC Series - Contact Manager</title>
</head>
<body>
<h2>Customer information</h2>
<form:form method="post" action="/customer">
 
    <table>
    <tr>
        <td><form:label path="customerId">Customer ID</form:label></td>
        <td><form:input path="customerId" /></td> 
    </tr>
    <tr>
        <td><form:label path="customerName">Name</form:label></td>
        <td><form:input path="customerName" /></td>
    </tr>
    <tr>
        <td><form:label path="customerAge">Age</form:label></td>
        <td><form:input path="customerAge" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Customer"/>
        </td>
    </tr>
</table>  
     
</form:form>
</body>
</html>