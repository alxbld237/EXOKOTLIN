fun main() {
    println("Move : ")
    val n = readln().toInt()
    println("Vous saisissez : $n")
    if (n == 1) {
        println("move up")
    }
    else if (n == 2) {
        println("move down")
    }
    else if (n == 3) {
        println("move left")
    }
    else if (n == 4) {
        println("move rigth")
    }
    else if (n == 0) {
        println("No move")
    }
    else {
        println("not valide")
    }
}
