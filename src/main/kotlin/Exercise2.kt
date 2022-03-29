fun main ()
{
    radio();
}
fun radio ()
{
    val nul=0;
    val pi=3.1416;
    println("Ingresa el valor del Radio: ")
    val rad = readLine()?.toIntOrNull()!!
    if ( nul >= rad ?: 0) //comparamos que no nos metan un valor menor a 0
    {
        return radio()
    }
else
    {
        val resultado= pi*rad
        println("El resultado es: $resultado")
    }
}