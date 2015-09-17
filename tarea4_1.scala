println("Programa del atleta")
var prom = 0
for(i <- 1 to 10)
{
println("Ingrese el tiempo del recorrido "+ i)
val tiempo = readInt()
if(tiempo < 16)
{
println("Usted tiene un buen tiempo")
}
else
{
println("Usted se ha pasado del tiempo")
}
prom = prom + tiempo
}
val promedio = prom/10
println("Su promedio es:"+promedio)
if(promedio <= 15)
{
println("Usted es apto para la prueba")
}
else
{
println("Usted no es apto para la prueba")
}