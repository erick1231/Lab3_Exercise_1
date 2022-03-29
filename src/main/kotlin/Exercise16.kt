fun main()
{
    val suma = { x: Int, y: Int, z: Int -> x + y + z }
    val mult = { x: Int, y: Int, z: Int -> x * y * z }
    val prom = { x: Int, y: Int, z: Int -> (x + y + z) / 3 }
    val nums = arrayOf(1, 2, 3)
    println(suma(nums[0], nums[1], nums[2]))
    println(mult(nums[0], nums[1], nums[2]))
    println(prom(nums[0], nums[1], nums[2]))
}