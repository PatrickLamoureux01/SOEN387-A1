<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.a1.Poll" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page session="true" %>

<% Poll p = null;
    if (request.getAttribute("poll") != null) {
        p = (Poll) request.getAttribute("poll");
    }
%>
<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<jsp:include page="/WEB-INF/head.jsp"/>
<body>

<form>
    <div class="container d-flex flex-column min-vh-100 justify-content-center align-items-center">
        <div class="card">
            <h5 class="card-header">Welcome, Poll Manager!</h5>
            <div class="card-body">
                <%
                    if (request.getAttribute("poll") == null) { %>
                        <h5 class="card-title">There is no poll currently running.</h5>
                <%
                    } else { %>
                        <h5 class="card-title">Current Poll: ${poll.name}</h5>
                   <%
                    }
                %>
                <p class="card-text">Please select from the following list of actions:</p>
                <a href="PollCreation.jsp" class="btn btn-outline-primary">
                    Create a
                    Poll
                </a>
                <a href="PollServlet?type=run" class="btn btn-outline-primary">Run a
                    Poll
                </a>
                <a href="PollServlet?type=close" class="btn btn-outline-primary">
                    Close a
                    Poll
                </a>
                <a href="PollServlet?type=release" class="btn btn-outline-primary">
                    Release a
                    Poll
                </a>
                <a href="PollServlet?type=unrelease" class="btn btn-outline-primary">
                    Unrelease
                    a Poll
                </a>
                <a href="PollServlet?type=update" class="btn btn-outline-primary">
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