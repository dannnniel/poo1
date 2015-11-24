class Pelicula(n: String){
	val nombre = n
	var clasificacion: String = ""
	var precioPorDia: Double = 0.0
	def clasificar(c: String){
		clasificacion = c
		clasificacion match{
			case "Ninos" => precioPorDia = 10
			case "Estrenos" => precioPorDia = 25
			case "Regular" => precioPorDia = 15
		}
	}
}

class Renta(){
	val peliculas = new Array[PeliculaRentada](50)
	var peliculasRentadas = 0

	def rentar(pelicula: Pelicula, dias: Int){
		peliculas(peliculasRentadas) = new PeliculaRentada(pelicula, dias)
		peliculasRentadas += 1
	}

	def totalAPagar(): Double = {
		var total = 0.0
		for(i <-0 to peliculasRentadas - 1){
			total += peliculas(i).precio()
		}
		return total
	}
}

class PeliculaRentada(p: Pelicula, d:Int){
	val pelicula = p
	val diasRentada = d
	
	def precio(): Double = {
		var descuento = 0.0
		pelicula.clasificacion match{
			case "Ninos" =>{
				if(diasRentada >= 3){
					descuento = .15
				}
			}
			case "Regular" =>{
				if(diasRentada >= 2){
					descuento = 0.1
				}
			}
			case default => descuento = 0.0
		}
		var precio = pelicula.precioPorDia * diasRentada
		return precio - precio*descuento
	}
}

var respuesta = 'N'
val renta = new Renta()

do{
	val pelicula = new Pelicula("")
	print("Titulo de la pelicula: ")
	var titulo = readLine()
	println("Clasificacion: Estrenos| Ninos | Regular ")
	var clasificacion = readLine()
	print("Dias a rentar: ")
	var dias = readInt()
	pelicula.clasificar(clasificacion)
	renta.rentar(pelicula, dias)
	println("Quieres rentar otra pelicula? (S/N) ")
	respuesta=readChar()
}while(respuesta != 'N')
println("Total a pagar: " + renta.totalAPagar())