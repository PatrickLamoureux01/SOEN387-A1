<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<jsp:include page="/WEB-INF/head.jsp" />
<body>
<form method="POST" action="${pageContext.request.contextPath}/PollServlet">
    <label>Poll name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label>Question:</label>
    <input type="text" id="question" name="question"><br><br>
    <label>Choices:</label>
    <input type="text" id="choices" name="choices"><br><br>
    <input type="submit" name="PollUp" value="PollUp">
</form>
<jsp:include page="/WEB-INF/footer.jsp" />
</body>
</html>