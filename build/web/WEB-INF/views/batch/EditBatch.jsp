<%-- 
    Document   : EditBatch
    Created on : May 12, 2016, 10:51:17 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../batch/batchHeader.jsp" %>
<div class="container">
    <h1>Edit Batch</h1>
    <c:url var="userRegistration" value="saveUser.html" />
    <form:form id="registerForm" modelAttribute="batch" method="post"
               action="update">
        <table width="400px" height="150px" class="table table-bordered">  
            <tr>  
                <td><form:label path="name"> Name</form:label></td>  
                <td><form:input path="name" value="${batchObj.name}" /></td>  
            </tr>  
            <tr>  
                <td><form:label path="code">Code </form:label></td>  
                <td><form:input path="code" value="${batchObj.code}"/></td>  
            </tr> 
            <tr>  
                <td><form:label path="addedDate">Added Date</form:label></td>  
                <td><form:input path="addedDate" value="${batchObj.addedDate}"/></td> 
            </tr> 
            <tr>  
                <td><form:label path="modifiedDate">Modified Date</form:label></td>  
                <td><form:input path="modifiedDate" value="${batchObj.modifiedDate}"/></td>  
            </tr> 
            <tr>  
                <td><form:label path="status">Status</form:label></td>  
                <td><form:input path="status" value="${batchObj.status}"/></td>  
            </tr>  

            <tr>  
                <td></td>  
                <td><input type="submit" value="Update" class="btn btn-success"/>  
                </td>  
            </tr>  
        </table>  
    </form:form>  
</div>
</html>
