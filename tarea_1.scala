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
