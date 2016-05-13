<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../views/header.jsp" %>
<c:set var="URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course</title>

    </head>

    <body>

        <div class="container" id="AllCourse">
            <form>
                <input type="text" id="SearchCourse" name="searchC" placeholder="search"/>
                <a href="${URL}/searchCourse" class="btn btn-success" id="searchCourseBtn">go</a>

            </form>
            <h3>TOTAL COURSE INFORMATION</h3>
            <table class="table table-bordered table-striped table-hover">
                <tr>
                    <th>ID</th>
                    <th>COURSE NAME</th>
                    <th>COURSE DESCRIPTION</th>
                    <th>DURATION TYPE</th>
                    <th>FEES </th>
                    <th>DURATION </th>
                    <th>ADDED DATE</th>
                    <th>MODIFIED DATE</th>
                    <th>STATUS </th>
                    <th>ACTION</th>

                </tr>
                <c:forEach var="c" items="${course}">
                    <tr>
                        <td>${c.id}</td>
                        <td>${c.courseName}</td>
                        <td>${c.courseDescription}</td>
                        <td>${c.durationType}</td>
                        <td>${c.fees}</td>
                        <td>${c.duration}</td>
                        <td>${c.addedDate}</td>
                        <td>${c.modifiedDate}</td>
                        <td>${c.status}</td>
                        <td><a href="edit?id=${c.id}" class="btn btn-success"><span class="glyphicon glyphicon-edit"/></a>&nbsp;
                            <a href="delete?id=${c.id}" class="btn btn-danger"><span class="glyphicon glyphicon-remove"/></a></td>
                    </tr>
                </c:forEach>
            </table> 
        </div>


        <div class="container" id="SearchById">
            <h3>COURSE INFORMATION BY ID</h3>
            <table class="table table-bordered table-striped table-hover">
                <tr>
                    <th>ID</th>
                    <th>COURSE NAME</th>
                    <th>COURSE DESCRIPTION</th>
                    <th>DURATION TYPE</th>
                    <th>FEES </th>
                    <th>DURATION </th>
                    <th>ADDED DATE</th>
                    <th>MODIFIED DATE</th>
                    <th>STATUS </th>
                    <th>ACTION</th>
                </tr>

                <tr>
                    <td>${c.id}</td>
                    <td>${c.courseName}</td>
                    <td>${c.courseDescription}</td>
                    <td>${c.durationType}</td>
                    <td>${c.fees}</td>
                    <td>${c.duration}</td>
                    <td>${c.addedDate}</td>
                    <td>${c.modifiedDate}</td>
                    <td>${c.status}</td>
                    <td><a href="edit?id=${c.id}" class="btn btn-success"><span class="glyphicon glyphicon-edit"/></a>&nbsp;
                        <a href="delete?id=${c.id}" class="btn btn-danger"><span class="glyphicon glyphicon-remove"/></a></td>
                </tr>

            </table> 
        </div>
        <div class="container" id="searchByName">
            <h3>Searched By Course Name</h3>
            <table class="table table-bordered table-striped table-hover">
                <tr>
                    <th>ID</th>
                    <th>COURSE NAME</th>
                    <th>COURSE DESCRIPTION</th>
                    <th>DURATION TYPE</th>
                    <th>FEES </th>
                    <th>DURATION </th>
                    <th>ADDED DATE</th>
                    <th>MODIFIED DATE</th>
                    <th>STATUS </th>

                </tr>

                <tr>
                    <td>${s.id}</td>
                    <td>${s.courseName}</td>
                    <td>${s.courseDescription}</td>
                    <td>${s.durationType}</td>
                    <td>${s.fees}</td>
                    <td>${s.duration}</td>
                    <td>${s.addedDate}</td>
                    <td>${s.modifiedDate}</td>
                    <td>${s.status}</td>
                </tr>
            </table>
        </div>
        <script>
            $(document).ready(function () {

                $("#SearchByName").hide();
                $("#searchCourseBtn").click(function () {
                    $("#SearchById").hide();
                    $("#AllCourse").hide();
                });
            });
        </script>
    </body>
</html>
