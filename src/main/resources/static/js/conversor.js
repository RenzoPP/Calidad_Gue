function moneda() {
    this.nombre;
    this.tipoDeCambio;
    this.mensajes = [
      "¿Eres Millonario?",
      "Monto ingresado no valido"
    ];
  
    this.convercion = function (monto) {
      resultadoConvertido = monto * this.tipoDeCambio;
      var mensajeHTML;
      if (resultadoConvertido >= 2000) {
        mensajeHTML = this.mensajes[0];
      } else if (resultadoConvertido <= 0.0) {
        mensajeHTML = this.mensajes[1];
      } else {
        mensajeHTML = resultadoConvertido;
      }
      document.getElementById("resultado").innerHTML = mensajeHTML;
    };
  }
 
  function convertirM(divisa) {
    var monedadolar = document.getElementById("monedadolar").value;
    
   
    }

  var sol = new moneda();
  
  sol.nombre = "Soles";
  sol.tipoDeCambio = 4.11;
  
  var euro = new moneda();
  euro.nombre = "Euro";
  euro.tipoDeCambio = 4.5;
  
  function convertirMoneda(divisa) {
    var monedaAconvertir = document.getElementById("monedaAconvertir").value;
    
    if (divisa == "sol") {
      sol.convercion(monedaAconvertir);
    } else if (divisa == "euro") {
      euro.convercion(monedaAconvertir);
    }
  }
  