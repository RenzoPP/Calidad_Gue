$("#btnsalir").click(function(){
    swal.fire({
        title: "¿Estás seguro que deseas salir?",
        text: "¡No podrás revertir esto!",
        icon: 'warning',
        showCancelButton: true,
        type: 'error',
        cancelButtonColor: '#d33',
        cancelButtonText: 'Cancelar',
        confirmButtonText: 'Salir'
    })
        .then((res) => {
            if(res.value){
                console.log('confirmed');
                    window.location = "/";
            }else if(res.dismiss == 'cancel'){
                console.log('cancel');
            }
            else if(res.dismiss == 'esc'){
                console.log('cancle-esc**strong text**');
            }
        });
});


$("#btneliminar").click(function(){

const swalWithBootstrapButtons = Swal.mixin({
    customClass: {
      confirmButton: 'btn btn-success',
      cancelButton: 'btn btn-danger'
    },
    buttonsStyling: false
  })
  
  swalWithBootstrapButtons.fire({
    title: '¿Estás seguro?',
    text: "¡No podrás revertir esto!",
    icon: 'warning',
    showCancelButton: true,
    confirmButtonText: '¡Si, eliminar!',
    cancelButtonText: '¡No, cancelar!',
    reverseButtons: true
  }).then((result) => {
    if (result.isConfirmed) {
      swalWithBootstrapButtons.fire(
        '¡Eliminado!',
        'Su archivo ha sido eliminado.',
        'success'
      )
    } else if (
      /* Read more about handling dismissals below */
      result.dismiss === Swal.DismissReason.cancel
    ) {
      swalWithBootstrapButtons.fire(
        'Cancelado',
        'Tú archivo esta seguro :)',
        'error'
      )
    }
  })
});
 

$("#btnguardar").click(function(){
Swal.fire({
    position: 'top-center',
    icon: 'success',
    title: '¡Éxito!',
    text: 'Datos guardados con éxito',
    showConfirmButton: false,
    timer: 1500
  })
});

$("#btnguarda").click(function(){
  Swal.fire({
      position: 'top-center',
      icon: 'success',
      title: '¡Éxito!',
      text: 'Datos guardados con éxito',
      showConfirmButton: false,
      timer: 1500
    })
  });