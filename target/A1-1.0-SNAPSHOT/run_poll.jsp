<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<jsp:include page="/WEB-INF/head.jsp" />
<body>
<form method="POST" action="${pageContext.request.contextPath}/PollServlet">
    <select name="pollsList" id="pollsList">
    </select>
    <input type="submit" name="PollStart" value="PollStart">
</form>
<jsp:include page="/WEB-INF/footer.jsp" />
</body>
</html>