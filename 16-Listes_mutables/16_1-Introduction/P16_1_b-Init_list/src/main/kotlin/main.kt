fun main() {
    val O = 0
    val numbers = MutableList(100){O}
    numbers [0] = 1
    numbers [9] = 10
    numbers [99] = 100
    numbers [99] = 100
        println(numbers.joinToString())
}
