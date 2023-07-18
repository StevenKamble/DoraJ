<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h1>Welcome to My Website!</h1>
    <p>
        Today is <%= new java.util.Date() %>
        <% out.print("welcome to jsp"); 
            int c=10+20;
        %>  
        <%= c%>
    </p>
</body>
</html>
