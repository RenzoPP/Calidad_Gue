$(document).ready(function() {
	  $('body').on('click','.editarpuesto',function(){
			$('#id').val($(this).attr('id'));
		 $('#txtNombre').val($(this).attr('param1'));
		  $('#txtDescripcion').val($(this).attr('param2'));
	})
	
	
	
});