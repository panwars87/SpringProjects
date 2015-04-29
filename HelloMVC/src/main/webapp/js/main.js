//var finalValString = null;
//var finalValObject = null;

$(document).ready(function(){
	$("#page2").hide();
	$("#final").hide();
	
	$("#personForm").submit(function(e){
		//alert("submit clicked");
		//alert("Data : "+$(this).serialize());
		$(".formFieldError").remove();
		$.ajax({
			url: $(this).attr("action"),
			type: 'post',
			data:$(this).serialize()
		}).done(function(res) {
			if(res.status==="ERROR"){
				//alert("Res is : "+ JSON.stringify(res));
				$("#msg").html("<span class=\"formFieldError\">Error while submitting form</span>");
				//alert("Error Map is : "+ JSON.stringify(res.errorMap)) 
				$.map( res.errorMap, function( val, key) {
                     var err="<span class=\"formFieldError\" id=\""+key+"Id\">"+val+"</span>";
                     //alert("Error made is : "+err);
                     $("[name^='"+key+"']").after(err);
                 });
			}else{   
				//alert("Res is : "+ JSON.stringify(res));
				$("#msg").html("Form submitted for : "+ res.result);
				$("#page1").hide();
				$("#page2").show();
				
			}
		}).fail(function(data){
			$("#msg").html("<span class=\"formFieldError\">Server failed to process request</span>");
		});
		return false;
	});
	
	$("#addressForm").submit(function(e){
		$(".formFieldError").remove();
		$.ajax({
			url: $(this).attr("action"),
			type: 'post',
			data:$(this).serialize()
		}).done(function(res) {
			if(res.status==="ERROR"){
				//alert("Res is : "+ JSON.stringify(res));
				$("#page2-msg").html("<span class=\"formFieldError\">Error while submitting form</span>");
				//alert("Error Map is : "+ JSON.stringify(res.errorMap)) 
				$.map( res.errorMap, function( val, key) {
                     var err="<span class=\"formFieldError\" id=\""+key+"Id\">"+val+"</span>";
                     //alert("Error made is : "+err);
                     $("[name^='"+key+"']").after(err);
                 });
			}else{   
				//alert("Res is : "+ JSON.stringify(res));
				console.log(res);
				//finalValString = JSON.stringify(res);
				//finalValObject = res;
				//finalValObject.result["zip"];
				
				$("#page2").hide();
				$("#final").show();
				
				// jquery reference $("#finalFirstName").html(finalValObject.result["firstName"]);
				document.getElementById("finalFirstName").innerHTML=res.result["firstName"];
				document.getElementById("finalZip").innerHTML=res.result["address"]["zipcode"];
			}
		}).fail(function(data){
			$("#page2-msg").html("<span class=\"formFieldError\">Server failed to process request</span>");
		});
		return false;
	});
	
	//backFunction(divId);
});

function backFunction(divId){
    $('.toggleSection').hide();
    $('#' + divId).show();
    $(window).scrollTop(0);
}
