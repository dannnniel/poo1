println("Que programa desea elegir?")
println("1.- Calificacion")
println("2.- Hospital")
println("3.- Inversion")
val opcion = readInt()
opcion match
{
case 1 => calificacion()
case 2 => hospital()
case 3 => inversion()
case default => println("Numero erroneo")
}
def calificacion()
{
println("Primera Calificacion")
val calif1 = readFloat()
println("Segunda Calificacion")
val calif2 = readFloat()
println("Tercera Calificacion")
val calif3 = readFloat()
println("Examen Final")
val califexamenfinal = readFloat()
println("Trabajo Final")
val trabajofinal = readFloat()
val promedio = (calif1 + calif2 + calif3)/3
val Final = promedio *.55 + califexamenfinal *.3 + trabajofinal *.15
println("Calificaion" +Final)
}
def hospital()
{
println("Programa el Hospital")
println("Ingrese la cantidad del presupuesto anual:$")
val presupuesto = readFloat()
println("El presupuesto es :$"+presupuesto)
println("")
val pres_gin = presupuesto*40/100
println("El area de Ginecologia recibira:$"+ pres_gin)
val pres_tra = presupuesto*30/100
println("El area de Traumatologia recibira:$"+ pres_tra)
val pres_ped = presupuesto*30/100
println("El area de Pediatria recibira:$"+pres_ped)
println("El programa ha terminado")
}
def inversion()
{
println("Ejercicio 3")
println("Programa de tres personas que invierten su dinero")
println("Cantidad1")
val Cantidad1 = readFloat()
println("Cantidad2")
val Cantidad2 = readFloat()
println("Cantidad3")
val Cantidad3 = readFloat()
val total = Cantidad1 + Cantidad2 + Cantidad3
println("Porcentaje1")
val porcentaje1 = Cantidad1 * 100/total
print(porcentaje1)
println("Porcentaje2")
val porcentaje2 = Cantidad2 * 100/total
print(porcentaje2)
println("Porcentaje3")
val porcentaje3 = Cantidad3 * 100/total
print(porcentaje3)
println("El programa ha terminado")
}