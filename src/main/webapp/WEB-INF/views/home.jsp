<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8" />
<title>About</title>
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/resources/style.css"
	type="text/css" />
<link href="http://fonts.googleapis.com/css?family=Copse:regular"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
	<nav>
		<label class="logo">Casey Jo Fleck</label>
		<ul>
			<li><a href="${pageContext.request.contextPath}">About</a></li>
			<li><a href="${pageContext.request.contextPath}/content/code_example">Code Example</a></li>
			<li><a href="${pageContext.request.contextPath}/content/resources/resume.pdf" target="_blank">Resume</a></li>
		</ul>		
	</nav>	
	<div class="box">
		<img src="${pageContext.servletContext.contextPath}/resources/images/Fleck-005_SS.jpg"  style="width:45%;height:45%;" alt="" class="box-img">
		<h1>Casey Jo Fleck</h1>
		<h5>Java Developer - Software Engineer</h5>
		<p> Software Engineer and Java Developer bringing along 3+ years of experience 
		in performing software engineering tasks and working with large amounts of data on a granular level.
		 Skillful in designing, developing and testing software applications based on user requirements and 
		 design documents along with reviewing technical design process to ensure high quality technical designs. 
		 Go-getter who can see the big picture, and prioritize work to make the largest impact on the businesses’ 
		 and customers’ vision and requirements. Ability to quickly learn new concepts and handle complex 
		 coding assignments along with effective communication and team leadership skills.</p>
		<ul>
			<li><a href="http://linkedin.com/in/CaseyJoFleck" target="_blank"><i class="fa fa-linkedin-square fa_custom fa-4x" aria-hidden="true"></i></a></li>
			<li><a href="http://github.com/CaseyJoFleck" target="_blank"><i class="fa fa-github-square fa_custom fa-4x" aria-hidden="true"></i></a></li>
			<li><a href="mailto:casejofleck@gmail.com" target="_blank"><i class="fa fa-envelope-square fa_custom fa-4x" aria-hidden="true"></i></a></li>
		</ul>
	</div>
</body>
</html>
