package remoteassignmentweek1


fun flag(name: String, mana: Int) {
    if(mana>0) {println("$name can use skill !")}else{println("$name need support!")}
}

fun main() {
    var human = Human("Dante", 100)

    human.flag()
}