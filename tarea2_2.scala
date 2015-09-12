println("Programa de una empresa")
println("Costo de la pieza:$50")
println("Cuatas piezas desea comprar")
val piezas = readFloat()
println("Su compra tiene un total de:$")
val total_piezas = piezas*50
println(piezas + "=" + total_piezas)
if(total_piezas >= 500000)
{
println("La inversion de la empresa:")
val in_empresa = total_piezas*.55
println(+ in_empresa)
println("El prestamo del banco:")
val banco = total_piezas*.30
println(+ banco)
println("Credito del fabricante:")
val fabri = (total_piezas*.15)
println(" "+ fabri)
println("El credito del fabricante tiene un interes del 20%:")
val in_fabri= fabri + (fabri*.20)
println(""+ in_fabri)
println("Valor de la compra:")
val total_compra = in_empresa + banco + in_fabri
println(+ total_compra)
}
else
{
println("La inversion de la empresa:")
val in_empresa = total_piezas*.70
println(+ in_empresa)
println("El credito del fabricante:")
val fabri=(total_piezas*.30)
println(""+ fabri)
println("Credito del fabricante con un interes del 20%:")
val in_fabri = fabri + (fabri *.20)
println(+ in_fabri)
println("El valor de la compra es:$")
val total_compra=in_empresa+in_fabri
println(+ total_compra)
}

println("")
println("El programa ha terminado")
