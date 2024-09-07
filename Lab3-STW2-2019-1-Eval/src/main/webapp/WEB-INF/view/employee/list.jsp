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
              href='<spring:url value="/resources/open-iconic/css/open-iconic-bootstrap.css" />'>
       
        <title>Lista de Empleados</title>
    </head>
    <body>
        <h1>Lista de Empleados</h1>
        
        <c:if test="${msg != null}" >
                <div class="alert alert-${tipo_alert} alert-dismissible fade show" role="alert">
                    ${msg}
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>            
        </c:if>
        <table class="table table-striped">
              <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Apellido y Nombre</th>
                    <th scope="col"></th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody>
                    <tr>
                        <td>1</td>
                        <td>Higgins, Shelley</td>
                        <td>shiggins@company.com</td>
                        <td>
                            <h5><span class="badge badge-dark">
                            Accounting
                                </span></h5>
                        </td>
                        <td>Seattle</td>
                        <td><a class="btn btn-outline-info" href="/Lab3-STW2-2019-1/employee/info/205" data-toggle="tooltip" data-placement="bottom" title="Editar"><span class="oi oi-pencil"></span></a></td>
                        <td><a class="btn btn-outline-danger" href="/Lab3-STW2-2019-1/employee/delete/205" data-toggle="tooltip" data-placement="bottom" title="Borrar"><span class="oi oi-trash"></span></a></td>
                    </tr>
                
                    <tr>
                        <td>2</td>
                        <td>Whalen, Jennifer</td>
                        <td>jwhalen@company.com</td>
                        <td>
                            <h5><span class="badge badge-dark">
                            Administration
                                </span></h5>
                        </td>
                        <td>Seattle</td>
                        <td><a class="btn btn-outline-info" href="/Lab3-STW2-2019-1/employee/info/200" data-toggle="tooltip" data-placement="bottom" title="Editar"><span class="oi oi-pencil"></span></a></td>
                        <td><a class="btn btn-outline-danger" href="/Lab3-STW2-2019-1/employee/delete/200" data-toggle="tooltip" data-placement="bottom" title="Borrar"><span class="oi oi-trash"></span></a></td>
                    </tr>
            </tbody>
        </table>
        <script src="<spring:url value="/resources/jquery/jquery-3.3.1.min.js" />"></script>
        <script src="<spring:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
    </body>
</html>
