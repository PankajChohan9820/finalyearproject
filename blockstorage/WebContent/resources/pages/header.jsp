<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<head>
<style type="text/css">

#banner{
width:100%;
padding-right: 0px;
padding-left: 0px;
}

#bannerimage{
width:100%;
height: 110px;
}

#navigation{
    margin-bottom: 0px;
    background-color: #337ab7;
    border-color: #337ab7;
}

.linkcolor {
    color: #fffefe;
}
</style>


</head>

<nav class="navbar navbar-inverse  navigation" role="navigation" id="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="userhome.html"><i>Block Storage</i></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                   
                   
                                    
                    
                    <li class="dropdown" >
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: #fffefe">Setting <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                           
                            <li>
                                <a href="login.html">Logout</a>
                            </li>
                       </ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    