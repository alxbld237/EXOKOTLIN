fun checkSpeed(speed: Int, limit : Int=60) {
   val voiture : Int
   if(speed >limit){
       voiture = speed -limit
       return println("exces de vittesse de $voiture de kilometre par heure")
   }else{
       return println("dans les limit")
   }
}

fun main() {
    checkSpeed(100, 60)
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}