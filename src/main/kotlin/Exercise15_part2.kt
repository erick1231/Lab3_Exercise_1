fun main()
{
    val list = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println("La lista es: ${list.contentToString()}");
    var sum=0;
    var prom=0;
    for (i in list)
    {
        sum+=i;
    }
    val average=sum/list.size;
    println("El promedio es $average");
    println("El mayor es ${list.maxOrNull()}");
    println("El menor es ${list.minOrNull()}");
    println("La suma es $sum");
}