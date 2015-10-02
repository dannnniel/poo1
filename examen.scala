var repetir = 'S'
do{
println("Pragramas del 1er. examen parcial de POO1")
println("Que programa desea revisar?")
println("1.- 20 Numeros")
println("2.- Calificacion mas baja")
println("3.- Reloj digital")
println("4.- Expendio de naranjas")
val opcion = readInt()
opcion match {
	case 1 => Numeros() 
	case 2 => CalificacionBaja()
	case 3 => ReloDigital()
	case 4 => ExpendioNaranjas()
	case default => println(" Numero erroneo ")
}




def Numeros(){
	var numero = 0.0
    var cantidadPositivos = 0
    var cantidadNegativos = 0
    var cantidadNeutros = 0
    for( i <- 1 to 20) {
	println("Ingresa un numero")
	numero = readFloat()
	if(numero > 0){
	cantidadPositivos += 1
	} else if (numero < 0){
		cantidadNegativos += 1
	}else{
		cantidadNeutros += 1
	}
	
}
println("Ingresaste " + cantidadPositivos + " numeros positivos")
println("Ingresaste " + cantidadNegativos + " numeros negativos")
println("Ingresaste " + cantidadNeutros + " numeros neutros")

}


def CalificacionBaja(){
	var menor = 11.0
    var calificacion = 0.0
    for( i <- 1 to 40) {
	print("Ingresa tu calificacion : ")
	calificacion = readFloat()

	if(calificacion < menor){
		menor = calificacion
	}
}
println("La calificacion menor es : " + menor)
}


def ReloDigital(){
	for( horas <- 0 to 23) {
	   for( minutos <- 0 to 59) {
		  for( segundos <- 0 to 59) {
			println(horas + ":" + minutos + ":" + segundos)
			
		}
		
	}
	
}
}


def ExpendioNaranjas(){
	var kilos = 0.0
    var totalCliente = 0.0
    var totalTienda = 0.0

    println("Cuanto cuesta el kilo?")
    val precioKilo = readFloat()

    for( i <- 1 to 15) {
	println("Cuantos kilo compraste?")
	kilos = readFloat()
	totalCliente = precioKilo * kilos
	if(kilos > 10){
		totalCliente = totalCliente * 0.85
	
	}
	totalTienda += totalCliente
	println("Su total es :$" + totalCliente)
	
}
println("La tienda va a recibir : $" + totalTienda)
}
}while (repetir == 'S')