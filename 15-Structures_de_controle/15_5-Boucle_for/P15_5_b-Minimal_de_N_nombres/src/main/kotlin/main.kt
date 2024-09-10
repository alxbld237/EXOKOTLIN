fun main() {
    println("saisir un nombre : ")
    val N = readln()!!.toInt()
    println("Entrez la valeur $N nombres :")
    var minValue=Int.MAX_VALUE
    for (i in 1..N){
        val num = readln() !!.toInt()
        if(num<minValue){
            minValue = num
        }
    }
    println("La valeur minimal est: $minValue")
}
