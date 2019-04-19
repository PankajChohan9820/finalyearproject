$(document).ready(function() {
	
	 $.ajax({
         type: "get",
         url: "testajax",
         contentType: "application/json",
 		  
         success: function (data)
        	 {
       	
               //$("#displayrecord")[0].reset();
              
               var data2 = JSON.parse(data);
               console.log("THe data is"+data);
   			   $("#tabledata").dataTable({
   	             responsive: true,
   	             destroy: true,
   	             data: data2,
   	             columns: [
   	                        { data: 'id' },
   	                        {data:'title'},
   	                        {data:'pubDate'}
   	                   	]
   	             
   	        		});
       
     		}
   	});
	 
	 

		    $(".table-striped").on("click",'tbody tr', function() {
		       
		    	 var userId= $(this).children('td:first').text();
		    	 var updateNotificationUrl = "/cmp/updatenotification.html?id="+userId;
		    	 var deleteNotificationrUrl="/cmp/deletenotification.html?id="+userId;
		    	 $('.editnotification').attr('href',updateNotificationUrl);
		    	 $('.deletenotification').attr('href',deleteNotificationrUrl);
		        //do all your operation populate the modal and open the modal now. DOnt need to use show event of modal again
		    		console.log("1");
		        
		        $('#myModal').modal('show');
		       



		    });

		});


    
    
 /* $("#tabledata").on("click",'tbody tr', function() {
   	 
	 
	 var userId= $(this).children('td:first').text();
	 
	 var updateNotificationUrl = "/cmp/updatenotification.html?id="+userId;
	 var deleteNotificationrUrl="/cmp/deletenotification.html?id="+userId;
	 
	 $('.deleteNotification').attr('href',deleteNotificationrUrl);  
	 $('.editnotification').attr('href',updateNotificationUrl);
	 
	 $( "#dialogContent" ).dialog( "open" );
	 



    	} );
  $( "#dialogContent" ).dialog({
	   autoOpen: false,
	   modal: true,
	   buttons: {
	      
	       Cancel: function() {
	          
	           $( this ).dialog( "close" );
	       }
	   }
	});
*/
  
  
 /* $("#edit").click(function(){
	 
  });
 
   
    
   
} );



function make_delete_link(oObj) {  
    // I'm relying on id being in column 0, but I could just as well used
    //  oObj.aData[oObj.iDataColumn]; // since this column also has the ID value
	

         
return "<a href='/cmptest/viewalluser.html'> delete</a>";
 
}*/
