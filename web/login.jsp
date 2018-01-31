<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

    <c:import url="jsp/head.jsp" />

    <body>

        <form action="j_security_check" method="post">
            <div class="form-group">
                <label for="j_username">User Name:</label>
                <input type="text" class="form-control" id="j_username" />
            </div>
            <div class="form-group">
                <label for="j_password">User Name:</label>
                <input type="password" class="form-control" id="j_password" />
            </div>

            <button type="submit" class="btn btn-primary">Log In</button>

        </form>

        <c:import url="jsp/bootstrap.jsp" />
    </body>

    <c:import url="jsp/footer.jsp" />
</html>