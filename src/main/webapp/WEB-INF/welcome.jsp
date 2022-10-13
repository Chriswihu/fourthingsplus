<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:fourthingsplus>
    <jsp:attribute name="header">
         Welcome to the logged in area
    </jsp:attribute>

    <jsp:body>

        <h2>Welcome ${sessionScope.user.username}</h2>

        <h3>Doing</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Item</th>
                <th>Action</th>
            </tr>
            </thead>
            <c:forEach var="item" items="${requestScope.itemList}">
                <c:if test="${item.done == false}">
                    <tr>
                        <td>${item.name} (${item.created})</td>
                        <td>
                            <form action="done" method="post">
                                <input type="hidden" name="id" value="${item.id}"/>
                                <input type="submit" value="Done"/>
                            </form>
                        </td>
                    </tr>
                </c:if>
            </c:forEach>
        </table>

        <h3>Done - left in the dust</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Item</th>
                <th>Action</th>
            </tr>
            </thead>
            <c:forEach var="item" items="${requestScope.itemList}">
                <c:if test="${item.done == true}">
                    <tr>
                        <td>${item.name} (${item.created})</td>
                        <td>Undone</td>
                    </tr>
                </c:if>
            </c:forEach>
        </table>


<%--        <c:if test="${sessionScope.user != null}">--%>
<%--            <p>You are logged in with the role of "${sessionScope.user.role}".</p>--%>
<%--        </c:if>--%>

        <c:if test="${sessionScope.user == null}">
            <p>You are not logged in yet. You can do it here: <a
                    href="../login.jsp">Login</a></p>
        </c:if>

    </jsp:body>

</t:fourthingsplus>