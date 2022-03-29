data class SuperHeroe(var personaje: String, var pelicula:String, var nombre_real:String, var year:Int)
{
    object SuperHeroes
    {
        val superHeroes = arrayOf(
            SuperHeroe("Spiderman", "Spiderman", "Peter Parker", 2002),
            SuperHeroe("Superman", "Superman", "Clark Kent", 1938),
            SuperHeroe("Batman", "Batman", "Bruce Wayne", 1939),
            SuperHeroe("Wonder)", "Wonder", "Clark Kent", 1941),
            SuperHeroe("Flash", "Flash", "Barry Allen", 1940))
    }
}
fun main()
{
    for (superHeroe in SuperHeroe.SuperHeroes.superHeroes)
    {
        println("${superHeroe.personaje} ${superHeroe.pelicula} ${superHeroe.nombre_real} ${superHeroe.year}")
    }
    }
