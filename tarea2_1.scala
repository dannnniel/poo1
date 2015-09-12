println("Cual fue el numero de horas trabajadas en la semana?")
println("Sin contar las horas extra")
val horas = readInt()
println("El numero de horas trabajadas son:"+horas)
println("Cuantas horas extra trabajo en la semana?")
val horas_extra = readInt()
println("El numero de horas extra son:"+horas_extra)
if(horas >= 40)
{
val sueldo = 160
println("Su sueldo es:$"+sueldo*horas)
if(horas_extra > 0)
{
val sueldo_extra = 200
println("Su sueldo de horas extra es de:$"+horas_extra*sueldo_extra)
println("Su sueldo total es:$"+(horas_extra*sueldo_extra + sueldo*horas))
}
}
if(horas < 40)
{
val sueldo = 160
println("Su sueldo total es:$"+(sueldo*horas))

}
println("El programa ha terminado")
