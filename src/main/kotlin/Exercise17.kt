import java.util.*

fun main(args: Array<String>) {
    var i: Int
    var suma = 0
    val n1: Int
    val n2: Int
    val sc = Scanner(System.`in`)
    print("Introduce primer número: ")
    n1 = sc.nextInt()
    print("Introduce segundo número: ")
    n2 = sc.nextInt()
    i = 1
    while (i < n1) {
        // for para sumar todos los divisores propios de n1
        if (n1 % i == 0) {
            suma = suma + i
        }
        i++
    }

    // si la suma de los divisores de n1 es igual a n2
    if (suma == n2) {
        suma = 0
        i = 1
        while (i < n2) {
            // sumo los divisores propios de n2
            if (n2 % i == 0) {
                suma = suma + i
            }
            i++
        }
        //si la suma de los divisores de n2 es igual a n1
        if (suma == n1) {
            println("Son Amigos")
        } else {
            println("No son amigos")
        }
    } else {
        println("No son amigos")
    }
}
