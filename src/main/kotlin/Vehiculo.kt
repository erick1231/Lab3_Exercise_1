enum class EstadoVehiculo(val estado:Int)
{
    ENCENDIDO(1),
    APAGADO(2);
}
enum class TipoVehiculo(val tipo:String)
{
    AUTOMOVIL("Automovil"),
    CAMIONETA("Camioneta"),
    Bus("Bus");
}
class vehiculo(marca:String,capacidad:Int,tipo:TipoVehiculo,color:String)
{
    var marca = marca
    var capacidad = capacidad
    var tipo = tipo
    var color = color
    private var estado:EstadoVehiculo = EstadoVehiculo.APAGADO
    fun apagar()
    {
        estado = EstadoVehiculo.APAGADO
    }
    fun encender()
    {
        estado = EstadoVehiculo.ENCENDIDO
    }
    fun getEstado():EstadoVehiculo
    {
        return estado
    }
    fun setEstadoVehiculo():String
    {
        return estado.estado.toString()
    }
}
fun main()
{
    println("Ingrese la marca del vehiculo: ")
    var marca = readLine()!!
    println("Ingrese la capacidad del vehiculo: ")
    var capacidad = readLine()!!.toInt()
    println("Ingrese el tipo del vehiculo: ")
    var tipo = readLine()!!
    println("Ingrese el color del vehiculo: ")
    var color = readLine()!!
    var vehiculo = vehiculo(marca,capacidad,TipoVehiculo.valueOf(tipo),color)
    println("El estado del vehiculo es: ${vehiculo.getEstado()}")
    println("Ingrese el estado del vehiculo: ")
    var estado = readLine()!!
    if(estado == "encender")
    {
        vehiculo.encender()
    }
    else
    {
        vehiculo.apagar()
    }
    println("El estado del vehiculo es: ${vehiculo.getEstado()}")
}