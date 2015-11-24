class Profesor(n: String){
	val nombre = n
	var categoria: String = ""
	var precioHora: Double = 0.0
	var horasAsesoria: Double = 0.0

	def categorizar(c: String){
		categoria = c
		categoria match{
			case "HC" =>{
				precioHora = 75
				horasAsesoria = 75 * 3
			}
			case "MT" =>{
				precioHora = 120
				horasAsesoria = 120 * 2
			}
			case "TC" =>{
				precioHora = 180
				horasAsesoria = 180 * 2
			}
		}
	}
}

class Nomina(){
	val profesores = new Array[ProfesoresAPagar](50)
	var profesoresAPagar = 0

	def pagar(profesor: Profesor, horasC: Int, horasA: Int){
		profesores(profesoresAPagar) = new ProfesoresAPagar(profesor, horasC, horasA)
		profesoresAPagar += 1
	}

	def totalAPagar(): Double ={
		var total = 0.0
		for(i <-0 to profesoresAPagar - 1){
			total += profesores(i).pago()
		}
		return total
	}
}

class ProfesoresAPagar(p: Profesor, hc:Int, ha: Int){
	val profesor = p
	val horasPagarC = hc
	val horasPagarA = ha

	def pago(): Double = {
		var pago = profesor.precioHora * horasPagarC
		return pago + (profesor.horasAsesoria*horasPagarA)
	}
}

var respuesta = 'N'
val nomina = new Nomina()

do{
	val profesor = new Profesor("")
	print("Nombre del profesor: ")
	var nombre = readLine()
	println("A que categoria pertenece el profesor: ")
	println("*** HC *** MT *** TC ***")
	var categoria = readLine()
	print("Horas clase: ")
	var horasC = readInt()
	print("Horas asesoria: ")
	var horasA = readInt()
	println("")
	println("")
	println("Los datos son: ")
	println("Nombre del Profesor: " + nombre)
	println("La categoria es: " + categoria)
	println("Horas de clase: " + horasC)
	println("Horas de asesoria: " + horasA)
	println("")

	profesor.categorizar(categoria)
	nomina.pagar(profesor, horasC, horasA)
	println("Desea realizar la nomina de otro profesor? (S/N) ")
	respuesta=readChar()
}while(respuesta != 'N')
println("El pago correspondiente es de : $" + nomina.totalAPagar()) 
