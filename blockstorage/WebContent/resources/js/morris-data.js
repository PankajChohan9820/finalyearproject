var donutData;
$(document).ready(function() {
	
	/*$.ajax({
		
		url:"http://localhost:8080/MetlifeTracker-service-Module/graphdata/donutdata",
		type:"post",
		//data: JSONObject,
		contentType: "application/json",
		datatype: "json",
		success:function(data){
			console.log(data);
			
			 Morris.Donut({
			    	element: 'morris-donut-chart',
			        data:data ,
			        resize: true
			    });
			//alert("inside success"+data[0].fname);
		}
	});*/
	
	Morris.Bar({
        element: 'morris-bar-chart',
        data: [{
            y: '2006',
           
            b: 90
        }, {
            y: '2007',
           
            b: 65
        }, {
            y: '2008',
           
            b: 40
        }, {
            y: '2009',
            
            b: 65
        }, {
            y: '2010',
          
            b: 40
        }, {
            y: '2011',
           
            b: 65
        }, {
            y: '2012',
           
            b: 90
        }],
        xkey: 'y',
        ykeys: ['b'],
        labels: ['Series A'],
        hideHover: 'auto',
        resize: true
    });
	
/*$.ajax({
		
		url:"bargraph",
		type:"post",
		//data: JSONObject,
		contentType: "application/json",
		datatype: "json",
		success:function(data){
			console.log(data);
			
			Morris.Bar({
		        element: 'morris-bar-chart',
		        data: data,
		        xkey: 'y',
		        ykeys: ['a'],
		        labels: ['Open'],
		        hideHover: 'auto',
		        resize: true
		    });
			//alert("inside success"+data[0].fname);
		}
	});*/
	//console.log("Inside"+donutData);
/*var datastring =[{
    period: '2010 Q1',
    iphone: 2666,
    ipad: null,
    itouch: 2647
}, {
    period: '2010 Q2',
    iphone: 2778,
    ipad: 2294,
    itouch: 2441
}, {
    period: '2010 Q3',
    iphone: 4912,
    ipad: 1969,
    itouch: 2501
}, {
    period: '2010 Q4',
    iphone: 3767,
    ipad: 3597,
    itouch: 5689
}, {
    period: '2011 Q1',
    iphone: 6810,
    ipad: 1914,
    itouch: 2293
}, {
    period: '2011 Q2',
    iphone: 5670,
    ipad: 4293,
    itouch: 1881
}, {
    period: '2011 Q3',
    iphone: 4820,
    ipad: 3795,
    itouch: 1588
}, {
    period: '2011 Q4',
    iphone: 15073,
    ipad: 5967,
    itouch: 5175
}, {
    period: '2012 Q1',
    iphone: 10687,
    ipad: 4460,
    itouch: 2028
}, {
    period: '2012 Q2',
    iphone: 8432,
    ipad: 5713,
    itouch: 1791
}];*/
   /* Morris.Area({
        element: 'morris-area-chart',
        data:datastring ,
        xkey: 'period',
        ykeys: ['iphone', 'ipad', 'itouch'],
        labels: ['iPhone', 'iPad', 'Mehul'],
        pointSize: 2,
        hideHover: 'auto',
        resize: true
    });*/

   

    

});
