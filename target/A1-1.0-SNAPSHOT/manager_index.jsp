<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<jsp:include page="/WEB-INF/head.jsp"/>
<body>
<form>
    <div class="container d-flex flex-column min-vh-100 justify-content-center align-items-center">
        <div class="card">
            <h5 class="card-header">Welcome, Poll Manager!</h5>
            <div class="card-body">
                <h5 class="card-title">Please select from the following list of actions:</h5>
                <a href="PollCreation.jsp" class="btn btn-outline-primary">
                    Create a
                    Poll
                </a>
                <a href="PollServlet?type=g" class="btn btn-outline-primary">Run a
                    Poll
                </a>
                <a href="PollServlet" class="btn btn-outline-primary">
                    Close a
                    Poll
                </a>
                <a href="PollServlet" class="btn btn-outline-primary">
                    Release a
                    Poll
                </a>
                <a href="PollServlet" class="btn btn-outline-primary">
                    Unrelease
                    a Poll
                </a>
                <a href="PollServlet" class="btn btn-outline-primary">
                    Update a
                    Poll
                </a>
            </div>
        </div>
    </div>
</form>
<hr>
<jsp:include page="/WEB-INF/footer.jsp"/>
</body>
</html>