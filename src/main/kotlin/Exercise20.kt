abstract class Figura
{
class Rectangle : Figura()
{
    var base: Float = 0.0f
    var height: Float = 0.0f //altura
    fun area() = base * height
}
}
class Circle : Figura()
{
    var radius: Float = 0.0f
    fun area() = 3.14f * radius * radius
}
class Triangle : Figura()
{
    var base: Float = 0.0f
    var height: Float = 0.0f //altura
    fun area() = base * height / 2
}
class cuadrado : Figura()
{
    var base: Float = 0.0f
    var height: Float = 0.0f //altura
    fun area() = base * height
}
fun main () {
    var rectangle = Figura.Rectangle()
    var circle = Circle()
    var triangle = Triangle()
    var cuadrado = cuadrado()

    println("Ingrese la base del rectangulo")
    rectangle.base = readLine()!!.toFloat()
    println("Ingrese la altura del rectangulo")
    rectangle.height = readLine()!!.toFloat()
    println("El area del rectangulo es: ${rectangle.area()}")

    println("Ingrese el radio del circulo")
    circle.radius = readLine()!!.toFloat()
    println("El area del circulo es: ${circle.area()}")

    println("Ingrese la base del triangulo")
    triangle.base = readLine()!!.toFloat()
    println("Ingrese la altura del triangulo")
    triangle.height = readLine()!!.toFloat()
    println("El area del triangulo es: ${triangle.area()}")

    println("Ingrese la base del cuadrado")
    cuadrado.base = readLine()!!.toFloat()
    println("Ingrese la altura del cuadrado")
    cuadrado.height = readLine()!!.toFloat()
    println("El area del cuadrado es: ${cuadrado.area()}")
}