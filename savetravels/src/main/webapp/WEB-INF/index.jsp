<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Save Travels</h1>
<table>
<thead>
	<tr>
	<td>Expense Name</td>
	<td>Vendor</td>
	<td>Amount</td>
	<td>Description</td>
	</tr>
</thead>
<tbody>
	<tr>
	<c:forEach var="eachExpense" items="${expenseService.allExpenses()}">
		<td>
		 <c:out value="${eachExpense.expenseName}"/>
		</td>
		<td>
		 <c:out value="${eachExpense.vendor}"/>
		</td>
		<td>
		 <c:out value="${eachExpense.amount}"/>
		</td>
		<td>
		 <c:out value="${eachExpense.description}"/>
		</td>
	</c:forEach>
	</tr>
</tbody>
</table>

	<form:form action="/expenses" method="post" modelAttribute="expense">
    <p>
        <form:label path="expenseName">Expense Name</form:label>
        <form:errors path="expenseName"/>
        <form:input path="expenseName"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>     
        <form:input type="number" path="amount"/>
    </p>    
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>