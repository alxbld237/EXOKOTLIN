fun main() {
    val N = readln()!!.toInt()
    val numbers = List(N) {readln()!!.toInt()}

        val P = readln()!!.toInt()
        val count = numbers.count{it == P}
        println(count)
}
