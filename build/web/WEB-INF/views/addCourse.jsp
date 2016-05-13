<%-- 
    Document   : addUser
    Created on : May 12, 2016, 5:52:09 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../views/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="color: teal; font-size: 30px">Course   
   Registration Form</div>  
  
  
  
  <c:url var="courseRegistration" value="saveCourse" />  
  <form:form id="registerForm" modelAttribute="course" method="POST"  >  
 
            <table width="400px" height="150px" class="table table-bordered">  
                <tr>  
                    <td><form:label path="courseName">Course Name</form:label></td>  
                    <td><form:input path="courseName" /></td>  
                </tr>  
                <tr>  
                    <td><form:label path="courseDescription">Course Description </form:label></td>  
                    <td><form:input path="courseDescription" /></td>  
                </tr> 
                <tr>  
                    <td><form:label path="durationType">Duration Type(day/month/year)</form:label></td>  
                    <td><form:input path="durationType" /></td> 
                </tr> 
                <tr>  
                    <td><form:label path="fees">Fees </form:label></td>  
                    <td><form:input path="fees" /></td>  
                </tr> 
                <tr>  
                    <td><form:label path="duration">Duration</form:label></td>  
                    <td><form:input path="duration" /></td>  
                </tr>  
                
               
                <tr>  
                    <td><form:label path="status"> Status</form:label></td>  
                    <td><form:input path="status" /></td>  
                </tr> 
                <tr>  
                    <td></td>  
                    <td> <a href="${URL}/saveCourse" class="btn btn-success" >submit</a>  
                    </td>  
                </tr>  
            </table>  
        </form:form>  
  
    </body>
</html>
