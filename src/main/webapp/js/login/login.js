$(document).ready(function(){
	$('#login').on("click", function(){
		$.ajax({
			url: "login/check",
			method:'post',
			data: $('#login_form').serialize(),
			success: function(result){
				
			}
		});
	});
});