<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet"
              href='<spring:url value="/resources/bootstrap/css/bootstrap.css"/>' />
        <!-- OPENICONIC CSS -->
        <link rel="stylesheet" 
              href='<spring:url value="/resources/open-iconic/css/open-iconic-bootstrap.css" />'>        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>
                Información
            </h1>
            <div class="form-group">
                <label for="firstName">Nombre</label>
                <input type="text" class="form-control disabled" disabled="true" name="firstName" value="Steven">
            </div>
            <div class="form-group">
                <label for="firstName">Apellido</label>
                <input type="text" class="form-control disabled" disabled="true"  name="lastName" value="King">
            </div>
            <!-- COMPLETAR -->
            <div class="form-group">
                <label for="jobTitle">Trabajo</label>
                <select class="form-control" id="jobTitle">
                    <!-- COMPLETAR -->
                </select>
            </div>   
            <div class="form-group">
                <div class="controls">
                    <a class="btn btn-primary" href="<spring:url value="/employee"/>">Regresar</a>&nbsp;&nbsp;&nbsp;                            
                </div>
            </div>            
        </div>
    </body>
</html>
