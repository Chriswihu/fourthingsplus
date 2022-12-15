<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<t:fourthingsplus>
    <jsp:attribute name="header">
         Add item
    </jsp:attribute>

    <jsp:body>

        <h3>Welcome to the Add Page ${sessionScope.user.username}</h3>

        <form method="post">
        <p>Please add items to your list</p>
            <div class="form-outline mb-4">
                <div class="row">
                    <div class="col">
                        <input name="name" placeholder="New item" class="form-control" id="name" type="text">
                    </div>
                    <div class="col">
                        <button class="btn btn-outline-secondary" formaction="additem" name="item_id"> Add </button>
                    </div>
                </div>
            </div>
        </form>

    </jsp:body>

</t:fourthingsplus>