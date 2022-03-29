import java.time.Year

data class Exercise19(val name: String, val apellido: String, val sexo: String, val year: Year, val cedu: Long)
{
    @JvmName("getName1")
    fun getName(): String {
        return name
    }
    @JvmName("getApellido1")
    fun getApellido(): String {
        return apellido
    }
    @JvmName("getSexo1")
    fun getSexo(): String {
        return sexo
    }
    @JvmName("getYear1")
    fun getYear(): Year {
        return year
    }
    @JvmName("getCedu1")
    fun getCedu(): Long {
        return cedu
    }
}
fun main()
{
    println("ingrese el nombre")
    val name = readLine()!!
    println("ingrese el apellido")
    val apellido = readLine()!!
    println("ingrese el sexo")
    val sexo = readLine()!!
    println("ingrese el año")
    val year = readLine()!!.toInt()
    println("ingrese la cedula")
    val cedu = readLine()!!.toLong()
    val exercise19 = Exercise19(name,apellido,sexo,Year.of(year),cedu)
    println("nombre: ${exercise19.getName()}")
    println("apellido: ${exercise19.getApellido()}")
    println("sexo: ${exercise19.getSexo()}")
    println("año: ${exercise19.getYear()}")
    println("cedula: ${exercise19.getCedu()}")
}