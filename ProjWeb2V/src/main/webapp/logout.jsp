<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
session.removeAttribute("user");
String url = response.encodeRedirectURL("/ProjWeb2V/Index.jsp");
response.setStatus(302);
response.setHeader("location", url);
%>