<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="context" value="<%=request.getContextPath()%>" />
<c:set var="img" value="${context}/resources/img" />
<c:set var="css" value="${context}/resources/css" />
<c:set var="js" value="${context}/resources/js"/>
<!doctype html>
<html lang="en">
<head>
	<title><tiles:getAsString name="title"/></title>
	<link rel="stylesheet" href="${css}/application.css" type="text/css"/>
</head>
<body>

	<header>
		<div id="pub_header">
			<tiles:insertAttribute name="header" /> 	
		</div>
	</header>
	<section>
		<article id="pub_article">
			<tiles:insertAttribute name="body" /> 
		</article>
	</section>
	<footer>
		 <div id="pub_footer">
		 	<tiles:insertAttribute name="footer" /> 
		 </div>
	</footer>
</body>
<script src="${js}/application.js"></script>
<script>
	app.init('${pageContext.request.contextPath}');
</script>
</html>