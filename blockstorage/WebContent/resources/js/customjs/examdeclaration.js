$(document).ready(function(){
	
	$(".displayresult").on("click",function(){
		var examid = $(this).attr("id");
		$("#examId").val(examid);
		$("#myModal").modal("show");
	});
	
	$("#modalbtn").on("click",function(){
		$("#publishexamform").submit();
	});
	
	
	
	$(".displayattendance").on("click",function(){
		var examid = $(this).attr("id");
		$("#examId1").val(examid);
		$("#attendexamform").submit();
	});
}); 