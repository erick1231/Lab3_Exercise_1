fun main()
{
    println("Ingrese la cantidad de horas semanales trabajadas: ");
    var horas = readLine()!!.toInt();
    if (horas > 40)
    {
        println("El salario es de: " + (horas * 12) + " Cordobas");
    }
    else
    {
        println("El salario es de: " + (horas * 16) + " Cordobas");
    }

}