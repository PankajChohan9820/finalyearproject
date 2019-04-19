$(document).ready(function(){
	
	$(".addquestion").on("click",function(){
		var examId = $(this).attr("id");
		$("#exid").val(examId);
		$("#addquestionform").submit();
	});
	
	$(".activateexam").on("click",function(){
		var examId = $(this).attr("id");
		$("#exid").val(examId);
		$("#activateexam").submit();
	});
	
	
});