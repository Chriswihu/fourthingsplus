<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="../error.jsp" isErrorPage="false" %>

<t:fourthingsplus>
    <jsp:attribute name="header">
         Edit item
    </jsp:attribute>

    <jsp:body>

        <h2>Welcome to the Edit Page ${sessionScope.user.username}</h2>

        <form method="post">
            <h3>Please edit your item</h3>
            <input type="text" name="name" value="${requestScope.item.name}"/>
            <button formaction="updateitem" name="item_id" value="${requestScope.item.id}">
                Update Item
            </button>
        </form>

    </jsp:body>

</t:fourthingsplus>