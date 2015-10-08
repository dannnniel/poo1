var continuar = 'S'
do{
println("Programas del examen de POO1")
println("Seleccione un programa por favor")
println("1.- Puntos contaminantes.")
println("2.- Siembra de pinos.")
val opcion = readInt()
opcion match {
	case 1 => PuntosContaminantes()
	case 2 => SiembraPinos()
	case default => println("Numero erroneo.") 
}

def PuntosContaminantes(){
	var maximo = -1
    var minimo = 100
    var promedio = 0
    var puntosContaminantes = 0
    var suma = 0

    for( i <- 1 to 25) {
	print("Ingresa los puntos contaminantes : ")
	puntosContaminantes = readInt()
	if(puntosContaminantes < minimo){
		minimo = puntosContaminantes
	}
	if(puntosContaminantes > maximo){
		maximo = puntosContaminantes
	}
	suma = suma + puntosContaminantes
    }
    promedio = suma/25

    println("El promedio es : " + promedio)
    println("El mas contaminante es : " + maximo)
    println("El menos contaminante es : " + minimo)
}


def SiembraPinos(){
	print("Ingrese la equivalencia de una hectarea : ")
    val equiHectarea = readFloat()
    val total = equiHectarea * equiHectarea
    print("La equivalencia total del terreno es de : " + total + " m2")
    println("")
    if(total <= 1000000){
	val pinopor = total * 50 / 100
	val oyamelpor = total * 30 / 100
	val cedropor = total * 20 / 100
	val pino = pinopor / 100
	val oyamel = oyamelpor / 225
	val cedro = cedropor / 276
	val numpino = pino *.8
	val numoyamel = oyamel *.15
	val numcedro = cedro *.10
	println("El numero de pinos a sembrar es : " + numpino)
	println("El numero de oyameles a sembrar es : " + numoyamel)
	println("El numero de cedros a sembrar es : " + numcedro)
    } else if(total > 1000000){
		val pinopor = total * 70 / 100
		val oyamelpor = total * 20 / 100
		val cedropor = total * 10 / 100
		val pino = pinopor / 100
		val oyamel = oyamelpor / 225
		val cedro = cedropor / 276
	    val numpino = pino * .8
		val numoyamel = oyamel *.15
		val numcedro = cedro *.10
		println("El numero de pinos a sembrar es : " + numpino)
		println("El numero de oyameles a sembrar es : " + numoyamel)
		println("El numero de cedros a sembrar es : " + numcedro)
	}
	    println("El programa ha finalizado")
}
}while(continuar == 'S')