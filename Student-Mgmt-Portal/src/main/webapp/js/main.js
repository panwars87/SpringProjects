$(function(){

	$("#loginForm").submit(function(e){
		// Stop form from submitting normally
		e.preventDefault();

		$.ajax({
			async : false,
			contentType : "application/json",
			type:'POST',
			url: $(this).attr('action'),
			data: JSON.stringify(convertFormToJSON($(this))),
			dataType: 'json',
			success: function(data) {
				alert("scuccess");
				window.location = "home.html";
			},
			error: function(data) {
				alert("error");
				window.location = "login";
			}
		});
	});
});

function convertFormToJSON($form){
	var unindexed_array = $form.serializeArray();
	var indexed_array = {};

	$.map(unindexed_array, function(n, i){
		indexed_array[n['name']] = n['value'];
	});

	return indexed_array;
};