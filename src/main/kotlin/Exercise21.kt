class Insecto(val longitud:Float, val alas : Boolean, val color:String, val antenas:Int, val patas:Int, val tipo: String)
{

    private var _alas = alas
    private var _color = color
    private var _longitud = longitud
    private var _antenas = antenas
    private var _patas = patas
    private var _tipo = tipo
}
fun main()
{
    println("Ingresa la longitud del insecto")
    val longitud = readLine()!!.toFloat()
    println("Ingresa si tiene alas")
    val alas = readLine()!!.toBoolean()
    println("Ingresa el color del insecto")
    val color = readLine()!!
    println("Ingresa la cantidad de antenas")
    val antenas = readLine()!!.toInt()
    println("Ingresa la cantidad de patas")
    val patas = readLine()!!.toInt()
    println("Ingresa el tipo de insecto")
    val tipo = readLine()!!
    val insecto = Insecto(longitud, alas, color, antenas, patas, tipo)
    println("El insecto tiene $antenas antenas")
    println("El insecto tiene $patas patas")
    println("El insecto tiene $longitud cm de longitud")
    println("El insecto tiene $color de color")
    println("El insecto es de tipo $tipo")
    println("El insecto tiene alas? $alas")

}