<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<!--
    Author: Adam Faherty
    Date: 01/30/2018
-->

<html lang="en">
    <c:set var="title" value="SalesCenter - HOME" scope="request" />

    <c:import url="jsp/head.jsp"/>

    <body>


        <a href="/user">USER DASHBOARD</a>

        <!--include bootstrap -->
        <c:import url="jsp/bootstrap.jsp" />
    </body>

    <c:import url="jsp/footer.jsp" />
</html>
