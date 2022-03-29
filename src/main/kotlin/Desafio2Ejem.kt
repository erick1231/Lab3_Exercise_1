data class pelicula(var personaje: String, var pelicula: String, var actor: String, var anio: Int)
{
    override fun toString(): String {
        return "Pelicula: $pelicula, Actor: $actor, Año: $anio"
    }
}
fun main()
{
    println("Bienvenido al programa de peliculas")
    println("Ingrese el nombre del actor")
    var nombre = readLine()
    println("Ingrese el nombre de la pelicula")
    var pelicula = readLine()
    println("Ingrese el año de la pelicula")
    var anio = readLine()
    var actor = pelicula(nombre.toString(), pelicula.toString(),nombre.toString(), anio.toString().toInt())
    println(actor)
}