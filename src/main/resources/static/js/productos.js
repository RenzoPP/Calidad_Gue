$(document).ready(function() {
	  $('body').on('click','.editarProducto',function(){
			$('#id').val($(this).attr('id'));
			$('#txtCodigo').val($(this).attr('param1'));
		 $('#txtNombre').val($(this).attr('param2'));
		  $('#txtCategoria').val($(this).attr('param3'));
		  $('#txtPcom').val($(this).attr('param4'));
		  $('#txtPven').val($(this).attr('param5'));
	})
	
	
	
});