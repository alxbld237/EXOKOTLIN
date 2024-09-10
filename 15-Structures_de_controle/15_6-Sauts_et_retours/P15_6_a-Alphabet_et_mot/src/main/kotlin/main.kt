fun main() {
    println("Entrez le mots : ")
    val mot = readln()!!
    val alpha = "abcdefghijklmnopqrstuvwxyz"
    for(letter in alpha){
        if(letter !in mot){
            println(letter)
        }
    }
    println("letters non use : ")
}
