$(document).ready(function(){
	
	$(".launchexambtn").on("click",function(){
		var examid = $(this).attr("id");
		console.log("exam id"+examid);
		$("#examId").val(examid);
		$("#myModal").modal("show");
	});
	
	$("#instructionbox").change(function(){
		if($(this).is(":checked")){
			console.log("chcked")
			$("#modalbtn").removeClass('disabled');
			$("#modalbtn").prop("disabled",false);
		}
		else{
			console.log("unchecked");
			$("#modalbtn").addClass('disabled');
			$("#modalbtn").prop("disabled",true);
		}
	});
	
	$("#modalbtn").on("click",function(){
		$("#luanchexamform").submit();
	});
	
	
});