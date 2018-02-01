<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

    <c:import url="jsp/head.jsp" />

    <body>

        <form method="post" action="j_security_check">
            <div class="form-group">
                <label for="username">User Name:</label>
                <input type="text" class="form-control" id="username" name="j_username" />
            </div>
            <div class="form-group">
                <label for="password">User Name:</label>
                <input type="password" class="form-control" id="password" name="j_password" />
            </div>

            <input type="submit" class="btn btn-primary" value="Login" />

        </form>

        <c:import url="jsp/bootstrap.jsp" />
    </body>

    <c:import url="jsp/footer.jsp" />
</html>