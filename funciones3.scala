var continuar = 'S'
do{
println("Programas de la tarea #3")
println("Que programa desea revisar?")
println("1.- Promocion de una tienda")
println("2.- Jubilacion del IMSS")
val Opcion = readInt()
Opcion match {
	case 1 => PromocionTienda()
	case 2 => Jubilacion()
	case default => println("Numeo erroneo")   
}


def PromocionTienda(){
	println("Ingrese el valor de su compra:")
    val total_compra = readFloat()
    println("Su total es:$"+ total_compra)
    println("Teclee un numero del 1 al 5, puede obtener un descuento")
    val opcion = readInt()
    println("Su opcion fue:"+opcion)
    if(opcion == 1)
    {
    println("El color que le toco fue: Color BLANCO")
    println("Usted no tiene descuento alguno")
    println("Su total a pagar es:$"+ total_compra)
    }
    if(opcion == 2)
    {
    println("El color que le toco fue: Color VERDE")
    println("Usted gano un 10% de descuento en su compra")
    val descuento = (total_compra*10)/100
    val total = total_compra - descuento
    println("Su total a pagar es:$"+ total)
    }
    if(opcion == 3)
    {
    println("El color que le toco fue: Color AMARILLO")
    println("Usted gano un 25% de descuento en su compra")
    val descuento = (total_compra*25/100)
    val total = total_compra - descuento
    println("Su total a pagar es:$"+ total)
    }
    if(opcion == 4)
    {
    println("El color que le toco fue: Color AZUL")
    println("Usted gano un 50% de descuento en su compra")
    val descuento = (total_compra*50/100)
    val total = total_compra - descuento
    println("Su total a pagar es:$"+ total)
    }
    if(opcion == 5)
    {
    println("El color que le toco fue: Color ROJO")
    println("Usted gano un 100% de descuento en su compra")
    val descuento = (total_compra*100/100)
    val total = total_compra - descuento
    println("Su total a pagar es:$"+ total)
    }
    println("Gracias por su compra")
    println("El programa ha terminado")
}


def Jubilacion(){
	println("Ingrese su edad")
    val edad = readInt()
    println("Ingrese el tiempo que ha trabajado en la institucion")
    val tiempo = readInt()
    println("Su edad es:"+ edad +"anos")
    println("El tiempo que ha trabajado es:"+ tiempo +"anos")
    if(edad >= 60 && tiempo < 25)
    {
    println("Usted tendra la jubilacion por edad")
    }
    if(edad < 60 && tiempo >= 25)
    {
    println("Usted tendra la jubilacion por Antiguedad Joven")
    }
    if(edad >=60 && tiempo >=25)
    {
    println("Usted tendra la jubilacion por Antiguedad Adulta")
    }
    println("El programa ha terminado")
}

}while(continuar == 'S')