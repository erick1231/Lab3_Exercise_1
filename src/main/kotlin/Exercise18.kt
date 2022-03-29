fun main()
{
    val array= arrayOf(1, 2, 3, 1, 1, 2, 3, 4, 2, 4,5,5,7,5)
    val map= mutableMapOf<Int, Int>()
    println(array.groupBy { it })
    for (i in array)
    {
        if (map.containsKey(i))
        {
            map[i] = map[i]!! + 1
        }
        else
        {
            map[i] = 1
        }
    }
    println(map)
}