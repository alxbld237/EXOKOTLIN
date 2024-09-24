class Kitty {
    var color: String = ""
    var age: Int = 0

    constructor(color: String, age: Int) {
        this.color = color
        this.age = age
    }

    constructor(age: Int, color: String) {
        this.age = age
        this.color = color
    }

    constructor(color: String) {
        this.color = color

        this.age = 0
    }


    constructor(age: Int) {
        this.age = age

        this.color = "Unknown"
    }
}


fun main() {
    val garfield = Kitty("orange", 7)
    val tom = Kitty(8, "grey")
    val grominet = Kitty("black")
    val kitty = Kitty(3)
}