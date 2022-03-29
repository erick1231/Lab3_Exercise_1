fun main()
{
    var multiplo = 0;

    for (i in 1..100)
    {
        if (i % 5 == 0)
        {
            multiplo = multiplo + i;
            println(i);
        }
    }
}

