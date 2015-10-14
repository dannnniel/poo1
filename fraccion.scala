class Racional(n: Int, d: Int) {
  val numerador = n
  val denominador = d

  def Sumar(b: Racional): Racional = {
    new Racional(
      numerador * b.denominador + denominador * b.numerador,
      denominador * b.denominador
    )
  }

  def Restar(b: Racional): Racional = {
  	new Racional(
  		numerador * b.denominador - denominador * b.numerador,
  		denominador * b.denominador
  		)
  }

 def Multiplicacion(b: Racional): Racional = {
 	new Racional(
 		numerador * b.numerador,
 		denominador * b.denominador
 		)
 }

 def Division(b: Racional): Racional = {
 	new Racional(
 		numerador * b.denominador,
 		denominador * b.numerador
 		)
 }
}
var continuar = 'S'
do{
println("Que operacion desea realizar")
println(" 1.- Suma")
println(" 2.- Resta")
println(" 3.- Multiplicacion")
println(" 4.- Division")
val opcion = readInt()
opcion match {
	case 1 => {
		print("Numerador de la primera fraccion: ")
        val n1 = readInt()
        print("Denominador de la primera fraccion: ")
        val d1 = readInt()
        val fraccion1 = new Racional(n1, d1)
        print("Numerador de la primera fraccion: ")
        val n2 = readInt()
        print("Denominador de la primera fraccion: ")
        val d2 = readInt()
        val fraccion2 = new Racional(n2, d2)
        val totalSuma = fraccion1.Sumar(fraccion2)
		println("El resultado es : " + totalSuma.numerador + "/" + totalSuma.denominador)
	}
	case 2 => {
		print("Numerador de la primera fraccion: ")
        val n1 = readInt()
        print("Denominador de la primera fraccion: ")
        val d1 = readInt()
        val fraccion1 = new Racional(n1, d1)
        print("Numerador de la primera fraccion: ")
        val n2 = readInt()
        print("Denominador de la primera fraccion: ")
        val d2 = readInt()
        val fraccion2 = new Racional(n2, d2)
        val totalResta = fraccion1.Restar(fraccion2)
		println("El resultado es : " + totalResta.numerador + "/" + totalResta.denominador)
	}
	case 3 => {
		print("Numerador de la primera fraccion: ")
		val n1 = readInt()
        print("Denominador de la primera fraccion: ")
        val d1 = readInt()
        val fraccion1 = new Racional(n1, d1)
        print("Numerador de la primera fraccion: ")
        val n2 = readInt()
        print("Denominador de la primera fraccion: ")
        val d2 = readInt()
        val fraccion2 = new Racional(n2, d2)
        val totalMultiplicacion = fraccion1.Multiplicacion(fraccion2)
		println("El resultado es : " + totalMultiplicacion.numerador + "/" + totalMultiplicacion.denominador)
	}
	case 4 => {
		print("Numerador de la primera fraccion: ")
        val n1 = readInt()
        print("Denominador de la primera fraccion: ")
        val d1 = readInt()
        val fraccion1 = new Racional(n1, d1)
        print("Numerador de la primera fraccion: ")
        val n2 = readInt()
        print("Denominador de la primera fraccion: ")
        val d2 = readInt()
        val fraccion2 = new Racional(n2, d2)
        val totalDivision = fraccion1.Division(fraccion2)
		println("El resultado es : " + totalDivision.numerador + "/" + totalDivision.denominador)
	}
	case 5 => println("Numero desconocido.")
}
println("Desea regresar?(S/N)")
continuar = readChar()
}while(continuar == 'S')

