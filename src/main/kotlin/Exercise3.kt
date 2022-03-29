fun main()
{
    work()
}
fun work()
{
    val nul=0;
    val hour = 12 //$12 hora
//    val week = 7 // 7 dias de la semana
    println("Ingresa la cantidad de horas trabajadas: ");
    val payment = readLine()?.toIntOrNull()!!
    if (nul >= payment ?: 0) //comparamos que no nos metan un valor menor a 0
    {
        return work()
    }
    else
    {
        val resultado= payment*hour
        println("El resultado es: $resultado")
    }
}