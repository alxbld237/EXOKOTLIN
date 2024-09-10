fun main() {
    val number = 6
    for (i in 2..number){
        if(number % i == 0){
           println("Divided by $i")
        }
    }
}