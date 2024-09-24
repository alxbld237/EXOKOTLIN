fun total(defense:Int, type:Int, qualité:Int):Int{
    val score = defense+type+qualité
    return(score)
}

fun main(){
    println(total(3,2,1))
    assert( total(3,2,1)==6){
        "erreur de la valeur est de ${total(3,2,1)}"
    }
}
