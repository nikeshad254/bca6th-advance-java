<%@ page import="java.util.Date" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Session Data</h1>
    <%
        Date lastAccessed = (Date) session.getAttribute("lastAccessed");
    %>
    <% if(lastAccessed == null){ %>
    <p>This is your first visit.</p>
    <% }else{ %>
    <p>Your last access was: <%= lastAccessed %></p>
    <% } %>
</body>
</html>
