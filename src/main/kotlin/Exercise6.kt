fun main()
{
    println("Escribir un numero entre el 1 y el 7: ");
    val number = readLine()?.toInt()
    if (number == 1){
        println("LUNES")
    }
    if (number == 2){
        println("MARTES")
    }
    if (number == 3){
        println("MIERCOLES")
    }
    if (number == 4){
        println("JUEVES")
    }
    if (number == 5){
        println("VIERNES")
    }
    if (number == 6){
        println("SABADO")
    }
    if (number == 7){
        println("DOMINGO")
    }
    else
    {
        println("Seleccion incorrecta")
    }
}