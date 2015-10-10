var continuar = 'S'
do {
println("Programas de la Tarea #2")
println("Que programa desea revisar?")
println("1.- Salario de un obrero")
println("2.- Compra de piezas")
val opcion = readInt()

opcion match {
	case 1 => SalarioSemanal()
	case 2 =>Piezas()
	case default => println("Numero erroneo") 
}


def SalarioSemanal(){
	println("Cual fue el numero de horas trabajadas en la semana?")
    println("Sin contar las horas extra")
    val horas = readInt()
    println("El numero de horas trabajadas son:"+horas)
    println("Cuantas horas extra trabajo en la semana?")
    val horas_extra = readInt()
    println("El numero de horas extra son:"+horas_extra)
    if(horas >= 40){
    val sueldo = 160
    println("Su sueldo es:$"+sueldo*horas)
    if(horas_extra > 0){
    val sueldo_extra = 200
    println("Su sueldo de horas extra es de:$"+horas_extra*sueldo_extra)
    println("Su sueldo total es:$"+(horas_extra*sueldo_extra + sueldo*horas))
    }
    }
    if(horas < 40){
    val sueldo = 160
    println("Su sueldo total es:$"+(sueldo*horas))

    }
    println("El programa ha terminado")
}


def Piezas(){
	println("Programa de una empresa")
    println("Costo de la pieza:$50")
    print("Cuatas piezas desea comprar : ")
    val piezas = readFloat()
    print("Su compra tiene un total de : $")
    val total_piezas = piezas*50
    println(piezas + "=" + total_piezas)
    if(total_piezas >= 500000)
    {
    print("La inversion de la empresa : ")
    val in_empresa = total_piezas*.55
    println(+ in_empresa)
    print("El prestamo del banco : ")
    val banco = total_piezas*.30
    println(+ banco)
    print("Credito del fabricante : ")
    val fabri = (total_piezas*.15)
    println(" "+ fabri)
    print("El credito del fabricante tiene un interes del 20% : ")
    val in_fabri= fabri + (fabri*.20)
    println(""+ in_fabri)
    print("Valor de la compra : ")
    val total_compra = in_empresa + banco + in_fabri
    println(+ total_compra)
    }
    else
    {
    print("La inversion de la empresa : ")
    val in_empresa = total_piezas*.70
    println(+ in_empresa)
    print("El credito del fabricante : ")
    val fabri=(total_piezas*.30)
    println(""+ fabri)
    print("Credito del fabricante con un interes del 20% : ")
    val in_fabri = fabri + (fabri *.20)
    println(+ in_fabri)
    print("El valor de la compra es : $")
    val total_compra=in_empresa+in_fabri
    println(+ total_compra)
    }

    println("")
    println("El programa ha terminado")
}
}while(continuar == 'S')

