fun main()
{
    val nombre: String
    val direccion : String
    val telefono : Int
    println("Ingrese su nombre");
    nombre = readLine()!!
    println("Ingrese su direccion");
    direccion = readLine()!!
    println("Ingrese su telefono");
    telefono = readLine()!!.toInt()
    println("$nombre, $direccion, $telefono");
}