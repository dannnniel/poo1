println("Programa del Zoologico")
println("Seleccione al tipo de animal que quiere estudiar")
println("1.- Elefantes")
println("2.- Jirafas")
println("3.- Chimpances")
val eleccion = readInt()
eleccion match
{
case 1 =>{
println("Usted selecciono a los Elefantes")
println("Se cuenta con 20 ejemplares")
println("Ingrese cuantos elefantes tienen menos de 1 año")
val edad_1 = readInt()
val porcentaje1 = (edad_1*100)/20
println("Ingrese cuantos elefantes tienen mas de 1 año pero menos de 3 años")
val edad_2 = readInt()
val porcentaje2 = (edad_2*100)/20
println("Ingrese cuantos elefantes tienen mas de 3 años")
val edad_3 = readInt()
val porcentaje3 = (edad_3*100)/20
println("Los porcentajes son:")
println("De 0-1 ano:" + porcentaje1 + "%")
println("De 1-3 ano:" + porcentaje2 + "%")
println("De 3 anos o mas:" + porcentaje3 + "%")
}
case 2 =>{
println("Usted selecciono a las Jirafas")
println("Se cuenta con 15 ejemplares")
println("Ingrese cuantas jirafas tienen menos de 1 año")
val edad_1 = readInt()
val porcentaje1 = (edad_1*100)/15
println("Ingrese cuantas jirafas tienen mas de 1 año pero menos de 3 años")
val edad_2 = readInt()
val porcentaje2 = (edad_2*100)/15
println("Ingrese cuantos elefantes tienen mas de 3 años")
val edad_3 = readInt()
val porcentaje3 = (edad_3*100)/15
println("Los porcentajes son:")
println("De 0-1 ano:" + porcentaje1 + "%")
println("De 1-3 ano:" + porcentaje2 + "%")
println("De 3 anos o mas:" + porcentaje3 + "%")
}
case 3 =>{
println("Usted selecciono a los Chimpances")
println("Se cuenta con 40 ejemplares")
println("Ingrese cuantos chimpances tienen menos de 1 año")
val edad_1 = readInt()
val porcentaje1 = (edad_1*100)/40
println("Ingrese cuantos chimpances tienen mas de 1 año pero menos de 3 años")
val edad_2 = readInt()
val porcentaje2 = (edad_2*100)/40
println("Ingrese cuantos chimpances tienen mas de 3 años")
val edad_3 = readInt()
val porcentaje3 = (edad_3*100)/40
println("Los porcentajes son:")
println("De 0-1 ano:" + porcentaje1 + "%")
println("De 1-3 ano:" + porcentaje2 + "%")
println("De 3 anos o mas:" + porcentaje3 + "%")
}
case default => println("Numeor erroneo")
}