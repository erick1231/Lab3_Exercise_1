fun main()
{
    println("Ingresa el primer numero: ");
    var num1 = readLine()!!.toInt();
    println("Ingresa el segundo numero: ");
    var num2 = readLine()!!.toInt();
    println("Ingresa el tercer numero: ");
    var num3 = readLine()!!.toInt();
    val i = 0;
    //algoritmo de sort
    intArrayOf(num1, num2, num3).sortedArray().forEach {
        println(it);
    }
}