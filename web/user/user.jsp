<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Adam Faherty
  Date: 1/30/2018
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <c:set var="title" value="SalesCenter - Dashboard" scope="request" />

    <c:import url="../jsp/head.jsp"/>
    <body>

        <c:import url="../jsp/navbar.jsp"/>


        <!--include bootstrap -->
        <c:import url="../jsp/bootstrap.jsp" />
    </body>

    <c:import url="../jsp/footer.jsp" />
</html>
