fun main(args: Array<String>) {
    println("Ingrese un numeros: ");
    val num = readLine()!!.toInt();

    for (i in 1..12) {
        val product = num * i
        println("$num * $i = $product")
    }
}