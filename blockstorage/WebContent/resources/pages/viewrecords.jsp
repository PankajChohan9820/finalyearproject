<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- DataTables CSS -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">

 <script src="${pageContext.request.contextPath}/resources/js/customjs/myresult.js"></script>
 <script src="${pageContext.request.contextPath}/resources/bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
 <script src="${pageContext.request.contextPath}/resources/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>
 
<br/><br/>

<div class="row">
            <div class="col-lg-12">
              <ol class="breadcrumb">
                    <li><a href="viewrecords.html">Home</a>
                    </li>
                    <li class="active">My Device Records</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->
        
     <div class="row">
     		<div class="col-md-12">
     			<div class="panel panel-primary well">
     					<div class="panel-body ">
     							<div class="row">
     								<div class="dataTable_wrapper">
			                			<table class="table table-striped table-bordered table-hover" id="parkingtable">
			                				<thead>
			                                        <tr>
			                                            <th>Number</th>
			                                            <th>Agent </th>
			                                            <th>Port</th>
			                                            <th>Creator</th>
			                                            <th>Block Chain</th>
			                                        </tr>
			                                    </thead>
			                                    <tbody>
			                                    <c:forEach items="${minorList }" var="p" varStatus="i">
			                                    	<tr>
			                                    			<td>${i.index + 1}</td>
			                                    			<td>${p.agentName }</td>
			                                    			<td>${p.port }</td>
			                                    			<td>${p.creaor }</td>
			                                    			<td>${p.blockchain }</td>
			                                    	</tr>
			                                    </c:forEach>
			                                    </tbody>
			                			</table>
			                	</div>
     							</div>
     					</div>
     			</div>
     		</div>
     </div>
 <script>
        $('#parkingtable').DataTable({
                responsive: true
        });
    </script>