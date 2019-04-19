<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/css/modern-business.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
     <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/customjs/jquery.validate.min.js"></script>
	<title><tiles:insertAttribute name="title" ignore="true" /></title>
	<style type="text/css">
		.menu
		    {
		    	background-color: #337ab7;
		    	border-color: #337ab7;
		    	color: #fff
		    }
	</style>
</head>  
<body>  
        <tiles:insertAttribute name="header" />
        
  <div class="container">
        
        <tiles:insertAttribute name="body" />
        
       
        <footer>
        <div class="row">
        <div class="col-md-12">
        	<hr>
        	<p>Copyright &copy; Your Website 2019</p>
        	
        </div>
        </div>
		</footer>        	

    </div>    
        
          
  
</body>  
</html>  