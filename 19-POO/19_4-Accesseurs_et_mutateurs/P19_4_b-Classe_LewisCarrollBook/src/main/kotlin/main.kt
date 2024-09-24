class LewisCarrollBook {
    var name: String = ""
        set(value) {
            println("Now, a book called $value")
            field = value
        }
        get() {
            println("The name of the book is $field")
            return field
        }

    var author: String = "Lewis Carroll"
        get() {
            println("The author of the book is $field")
            return field
        }

    var price: Int = 0
        set(value) {
            println("Putting a new price...")
            field = value
            println("The new price is ${field / 10}")
        }
}


fun main() {
    val alicesAdventuresInWonderland = LewisCarrollBook()
    alicesAdventuresInWonderland.name = "Alice's Adventures in Wonderland"

    println(alicesAdventuresInWonderland.author)
    alicesAdventuresInWonderland.price = 15000
}