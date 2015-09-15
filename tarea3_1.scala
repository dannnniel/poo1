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
