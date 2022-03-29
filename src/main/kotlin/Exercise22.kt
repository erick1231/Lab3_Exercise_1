data class Exercise22(val profesor: String, val materia: String, val laboratorio: String, val conference: String)
{
    fun getInfo(): String
    {
        return "Profesor: $profesor\nMateria: $materia\nLaboratorio: $laboratorio\nConferencia: $conference"
    }
}
fun main() {
    val e22 = Exercise22("Juan", "Matematicas", "A1", "B-ll-1")
    println(e22.getInfo())
}