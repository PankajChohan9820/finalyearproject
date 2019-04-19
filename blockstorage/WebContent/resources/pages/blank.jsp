<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Modern Business - Start Bootstrap Template</title>

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

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
    
    .menu
    {
    	background-color: #337ab7;
    	border-color: #337ab7;
    	color: #fff
    }
    </style>
   
</head>



    
    
    <!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Welcome
                    <small>Aditya Dhanraj</small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="index.html">Home</a>
                    </li>
                    <li class="active">Dashboard</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
            <!-- Sidebar Column -->
            <div class="col-md-3">
                <div class="list-group">
                    <a href="index.html" class="list-group-item active menu">Home</a>
                    <a href="about.html" class="list-group-item active menu">About</a>
                    <a href="services.html" class="list-group-item active menu ">Services</a>
                    <a href="contact.html" class="list-group-item active menu">Contact</a>
                    <a href="portfolio-1-col.html" class="list-group-item active menu">1 Column Portfolio</a>
                    <a href="portfolio-2-col.html" class="list-group-item active menu">2 Column Portfolio</a>
                    <a href="portfolio-3-col.html" class="list-group-item active menu">3 Column Portfolio</a>
                    <a href="portfolio-4-col.html" class="list-group-item active menu">4 Column Portfolio</a>
                    <a href="portfolio-item.html" class="list-group-item active menu">Single Portfolio Item</a>
                    <a href="blog-home-1.html" class="list-group-item active menu">Blog Home 1</a>
                    <a href="blog-home-2.html" class="list-group-item active menu">Blog Home 2</a>
                    <a href="blog-post.html" class="list-group-item active menu">Blog Post</a>
                    <a href="full-width.html" class="list-group-item active menu">Full Width Page</a>
                    <a href="sidebar.html" class="list-group-item active  menu">Sidebar Page</a>
                    <a href="faq.html" class="list-group-item menu active">FAQ</a>
                    <a href="404.html" class="list-group-item menu active">404</a>
                    <a href="pricing.html" class="list-group-item menu active">Pricing Table</a>
                </div>
            </div>
            <!-- Content Column -->
            <div class="col-md-9">
                
            </div>
        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

   

    <!-- Script to Activate the Carousel -->
    <script>
    $('.carousel').carousel({
        interval: 5000 //changes the speed
    })
    </script>


</html>

