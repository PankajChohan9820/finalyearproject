$(document).ready(function(){
	$(".viewexamresult").on("click",function(){
		var examid = $(this).attr("id");
		//alert("examId"+examid);
		$("#examId").val(examid);
		$("#viewresultform").submit();
	});
});