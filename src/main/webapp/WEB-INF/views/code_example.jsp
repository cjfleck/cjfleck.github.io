<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">

<head>
	<meta charset="utf-8" />
	<title>About</title>
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/code_example_style.css" type="text/css" />
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/jquery-ui.css" type="text/css" />
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/dataTables.jqueryui.min.css" type="text/css" />
	<style type="text/css">
	button {
		background-color: black;
		border: none;
		color: white;
		padding: 15px 32px;
		text-align: center;
		text-decoration: none;
		display: inline-block;
		font-size: 16px;
		margin: 4px 2px;
	cursor: pointer;
	}
	</style>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/scripts/jquery.dataTables.min.js"></script>
	<script src="${pageContext.servletContext.contextPath}/resources/scripts/dataTables.jqueryui.min.js"></script>
	
	<script>
	$(document).ready(function() {
	    $('#example').DataTable();
	    $.ajax({
	        url: '${pageContext.request.contextPath}/content/code_example/address_table',
	        type: 'GET',
	        success: function (response) {
	            $.each(response, function (i, item) {
	            	$('#example').DataTable().row.add([item.street, item.city, item.zip, item.country]);
	            });
	            $('#example').DataTable().draw();
	        }
	    });
	} );
	</script>
</head>

<body>
	<nav>
		<label class="logo">Casey Jo Fleck</label>
		<ul>
			<li><a href="${pageContext.request.contextPath}">About</a></li>
			<li><a href="${pageContext.request.contextPath}/content/code_example">Code Example</a></li>
			<li><a href="${pageContext.request.contextPath}/content/code_example">Resume</a></li>
		</ul>		
	</nav>	
	<table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                <th>Street</th>
                <th>City</th>
                <th>Zip</th>
                <th>Country</th>
            </tr>
        </thead>
        <tbody class="tableBody"></tbody>
	        <tfoot>
	            <tr>
                <th>Street</th>
                <th>City</th>
                <th>Zip</th>
                <th>Country</th>
	            </tr>
	        </tfoot>
    </table>
    <div id="dialog" title="Dialog Form"></div>
</body>
</html>
