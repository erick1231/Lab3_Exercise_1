enum class TipoPlaneta(val tipo: String) {
    TERRESTRE("Terrestre"),
    GASEOSO("GASEOSO"),
    ENANO("ENANO")
}
class planeta(var planeta: String, var satelites:Int, var masaKg:Double, var volumenKm3:Double,var distanciaMedia:Double, var tipo:TipoPlaneta)
{
    init {
        println("Nombre del planeta: $planeta")
        println("Satelites: $satelites")
        println("Masa en Kg: $masaKg")
        println("Volumen en Km3: $volumenKm3")
        println("Distancia media en Km: $distanciaMedia")
        println("Tipo de planeta: $tipo")
    }
    fun densidad() {
        println("Densidad del planeta: ${masaKg/volumenKm3}")
    }
    fun esExterior():Boolean {
        if (distanciaMedia > 150000.00)
            return true
        else
            return false
        }
    }
fun main()
{
    println("Ingrese el nombre del planeta: ")
    var planeta = readLine()!!
    println("Ingrese el numero de satelites: ")
    var satelites = readLine()!!.toInt()
    println("Ingrese la masa en Kg: ")
    var masaKg = readLine()!!.toDouble()
    println("Ingrese el volumen en Km3: ")
    var volumenKm3 = readLine()!!.toDouble()
    println("Ingrese la distancia media en Km: ")
    var distanciaMedia = readLine()!!.toDouble()
    println("Ingrese el tipo de planeta: ")
    var tipo = readLine()!!
    var tipoPlaneta = TipoPlaneta.valueOf(tipo)
    var planeta1 = planeta(planeta,satelites,masaKg,volumenKm3,distanciaMedia,tipoPlaneta)
    planeta1.densidad()
    planeta1.esExterior()

}
