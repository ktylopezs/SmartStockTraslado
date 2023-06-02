#Autor: Katiuska Lopez S
#language: es

@AbrirAplicacion
Característica: Abrir SmartStock e ingresar a traslados

  @Login
  Escenario: Abrir SmartStock e ingresar a traslados
    Dado que el usuario ingresa a la pagina SmartStock
    Cuando ingrese a traslados
    Entonces se crea un traslado de productos
    Y se cierra la pagina de SmartStock
