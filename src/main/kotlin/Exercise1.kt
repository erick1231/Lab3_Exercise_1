fun main()
{
    calculate()
}

fun calculate()
{
    println("Ingresa el valor de la base: ")
    val base=readLine()?.toFloat()
    println("Ingresa el valor de la altura: ")
    val altura= readLine()?.toFloat()
    val area = (base!!*altura!!) /2  // !! significa que no devolvera nulos
    println("El valor del area es: $area")
}
