<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xss Page</title>
</head>
<body>
    <form name="searchForm" action="xss.htm" method="post">
        Search keyword <input type="text" name="search" id="search" /> <input type="submit" name="submit" />
    </form>
    ${result}
</body>
</html>
