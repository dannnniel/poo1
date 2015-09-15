println("Ingrese su edad")
val edad = readInt()
println("Ingrese el tiempo que ha trabajado en la institucion")
val tiempo = readInt()
println("Su edad es:"+ edad +"años")
println("El tiempo que ha trabajado es:"+ tiempo +"años")
if((edad > 60)&&(tiempo < 25))
{
println("Usted tendra la jubilacion por edad")
}
if((edad < 60)&&(tiempo >= 25))
{
println("Usted tendra la jubilacion por Antiguedad Joven")
}
if((edad > 60)&&(tiempo >=25))
{
println("Usted tendra la jubilacion por Antiguedad Adulta")
}
println("El programa ha terminado")