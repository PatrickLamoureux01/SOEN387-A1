<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<jsp:include page="/WEB-INF/head.jsp" />
<body>
<form method="POST" action="${pageContext.request.contextPath}/ManagerServlet">
<button type="button" onclick="location.href = 'PollCreation.jsp';" name="CreatePoll">Create a Poll</button>
<button type="button" onclick="location.href = 'run_poll.jsp';" name="RunPoll">Run a Poll</button>
<button type="button" onclick="location.href = 'close_poll.jsp';" name="ClosePoll">Close a Poll</button>
<button type="button" onclick="location.href = 'release_poll.jsp';" name="RePoll">Release a Poll</button>
<button type="button" onclick="location.href = 'unrelease_poll.jsp';" name="UnPoll">Unrelease a Poll</button>
<button type="button" onclick="location.href = 'update_poll.jsp';" name="UpPoll">Update a Poll</button>
<hr>
</form>
<jsp:include page="/WEB-INF/footer.jsp" />
</body>
</html>