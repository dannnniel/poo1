var nombres = new Array[String](50)
var precios = new Array[Float](50)
var codigos = new Array[String](50)
var opcion = 3
var i = 0

catalogo()

def catalogo(){
do{
mostrarMenuPrincipal()
opcion = readInt()
opcion match{
case 1 => agregarProductos()
case 2 => println("Aun no hay que hacerlo...")
case default => println("ADIOS")
}
}while(opcion != 3)
}

def mostrarMenuPrincipal(){
println("1.- Agregar Productos")
println("2.- Nota")
println("3.- Salir")
}

def agregarProductos(){
var continuar = 'N'
do{
i+=1
capturarDatosProducto()
mostrarCatalogoProductos()
println("Quieres agregar otro producto?(S/N)")
continuar = readChar()
}while(continuar == 'S')
}

def capturarDatosProducto(){
println("Ingrese los datos del producto")
println("Nombre")
nombres(i) = readLine()
println("Precio")
precios(i) = readFloat()
println("Codigo de barras")
codigos(i) = readLine()
}

def mostrarCatalogoProductos(){
println("Nombre | Precio | Codigo")
for(j <- 1 to i){
println(nombres(j) +" | "+  precios(j) +" | "+  codigos(j))
}
}





