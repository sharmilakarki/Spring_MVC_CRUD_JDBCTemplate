<%-- 
    Document   : EditPage
    Created on : May 12, 2016, 12:50:29 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../views/header.jsp" %>
 
<title>Edit Course</title>
<body>
    <div class="container">
        <h1>Edit Course</h1>
       <c:url var="courseEdit" value="/editCourse" />
       <form:form id="registerForm" modelAttribute="course" method="put" action="/editCourse">
            <table width="400px" height="150px" class="table table-bordered">  
                <tr>  
                    <td><form:label path="courseName">Course Name</form:label></td>  
                    <td><form:input path="courseName" value="${courseObj.courseName}" /></td>  
                </tr>  
                <tr>  
                    <td><form:label path="courseDescription">Course Description </form:label></td>  
                    <td><form:input path="courseDescription" value="${courseObj.courseDescription}"/></td>  
                </tr> 
                <tr>  
                    <td><form:label path="durationType">Duration Type(day/month/year)</form:label></td>  
                    <td><form:input path="durationType" value="${courseObj.durationType}"/></td> 
                </tr> 
                <tr>  
                    <td><form:label path="fees">Fees </form:label></td>  
                    <td><form:input path="fees" value="${courseObj.fees}"/></td>  
                </tr> 
                <tr>  
                    <td><form:label path="duration">Duration</form:label></td>  
                    <td><form:input path="duration" value="${courseObj.duration}"/></td>  
                </tr>  
                <tr>  
                    <td><form:label path="addedDate"> Added Date</form:label></td>  
                    <td><form:input path="addedDate" value="${courseObj.addedDate}"/></td>  
                </tr> 
                <tr>  
                    <td><form:label path="modifiedDate"> Modified Date</form:label></td>  
                    <td><form:input path="modifiedDate" value="${courseObj.modifiedDate}"/></td>  
                </tr> 
                <tr>  
                    <td><form:label path="status"> Added Date</form:label></td>  
                    <td><form:input path="status" value="${courseObj.status}"/></td>  
                </tr> 
                <tr>  
                    <td></td>  
                    <td><button type="submit" class="btn btn-success">save</button> 
                    </td>  
                </tr>  
            </table>  
        </form:form>  
    </div>
</body>
</html>
