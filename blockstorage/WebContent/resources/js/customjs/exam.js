$(document).ready(function(){
	
	var noofquestion;
	var currentquestion=1;
	var examduration=$("#examduration").val();
	$(".questionset").hide();
	$("#question1").show();
	
	$(".questionbtn").on("click",function(){
		var idname = $(this).attr("name");
		var btntext = $(this).text();
		currentquestion=btntext;
		$(".questionset").hide();
		$("#"+idname).show();
	});
	
	$("body").bind("contextmenu",function(){
		return false;
		}); 

	
	$("body").keypress(function(e){
		$("#examstatus").val("Submitted - Security Violation")
		$("#mymodal").modal("show");
		});
		$(window).blur(function(){
			console.log("blur events called");
			$("#examstatus").val("Submitted - Security Violation");
			$("#examlistform").submit();
			//$("#mymodal").modal("show");
			});
			/* $(window).focus(function(){
				console.log("focus events called");
			}); */
		
		
		 $(window).bind('resize', function() {
			console.log("resize1 called.")
			$("#examstatus").val("Submitted - Security Violation");
			$("#examlistform").submit();
			//$("#mymodal").modal("show");
			
		    });

	
	$(".radiobtn").change(function(){
		var idnumber = $(this).attr("flagvalue");
		$("#"+idnumber).css('background-color','#6eb78d');
	});
	
	$("#nextbtn").on("click",function(){
		if(noofquestion==undefined)
			{
				noofquestion=$("#questionlenght").text();
			}
			
				if(currentquestion==noofquestion)
					{
						currentquestion=1;
						$(".questionset").hide();
						$("#question"+currentquestion).show();
					}
				else{
					currentquestion=currentquestion+1;
					$(".questionset").hide();
					$("#question"+currentquestion).show();
				}
			
		
	});
	
	$("#prevbtn").on("click",function(){
		if(noofquestion==undefined)
			{
				noofquestion=$("#questionlenght").text();
			}
			
				if(currentquestion==1)
					{
						currentquestion=noofquestion;
						$(".questionset").hide();
						$("#question"+currentquestion).show();
					}
				else{
					currentquestion=currentquestion-1;
					$(".questionset").hide();
					$("#question"+currentquestion).show();
				}
			
		
	});
	
	$("#finishexam").on("click",function(){
		$("#examstatus").val("Submitted");
		$("#examlistform").submit();
	});
	
	$("#exam_date").countdowntimer({
		hours:0,
		minutes : examduration,
		size : "md",
		tickInterval : 1,
		timeUp:timeisUp
		});
	
	function timeisUp() {
		$("#examstatus").val("Submitted");
		$("#examlistform").submit();
		//$("#mymodal").modal("show");
		
	     }
	$("#modalbtn").on("click",function(){
		$("#examlistform").submit();
	});
	

});