<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body>
<s:form action="tutorials/getTutorial">
<s:textfield label="ENTER THE LANGUAGE" key="language"/>
<s:submit />
</s:form>
<%-- 
<form method="post" action="tutorials/getTutorial.action">
<input id="language" name="language" />
<input type="submit"/>
</form> --%>
</body>
</html>