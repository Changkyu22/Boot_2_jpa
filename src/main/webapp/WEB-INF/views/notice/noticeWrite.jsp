<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/boot.jsp" />
<!-- include summernote css/js -->
<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote.js"></script>
</head>
<body>
	<c:import url="../template/nav.jsp" />
	<div class="container">
	  <h2>Notice Write Page</h2>
	  <form:form action="./noticeWrite" method="post" id="frm" enctype="multipart/form-data" modelAttribute="noticeVO">
	  
	    <div class="form-group">
	      <label for="title">TITLE</label>
	      <form:input path="title" placeholder="Enter title" class="form-control" id="title"/>
	      <form:errors path="title" cssStyle="color:red"/>
	    </div>
	    
	    <div class="form-group">
	      <label for="writer">WRITER</label>
	      <form:input path="writer" placeholder="Enter writer" class="form-control" id="writer"/>
	      <form:errors path="writer" cssStyle="color:red"/>
	    </div>
	    
	    <div class="form-group">
      		<label for="comment">Contents:</label>
      		<form:textarea path="contents" placeholder="Enter contents" class="form-control" id="contents"/>
	      	<form:errors path="contents"/>
   		</div>
   		
   		<div class="row">
	    	<input type="button"  class="btn btn-info col-sm-3" id="add" value="ADD FILE">
	    	<div id="files" class="col-sm-12"></div>
	    </div>
	    <div class="row"></div>
	    <div class="row" style="margin-top: 50px;">
	    	<input type="button" id="write" class="btn btn-danger col-sm-3" value="Write">
	   	</div> 
   		
	  </form:form>
	  
	</div>

	<script type="text/javascript" src="../js/summernote.js"></script>	
	<script type="text/javascript" src="../js/fileCount.js"></script>	
</body>
</html>