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
