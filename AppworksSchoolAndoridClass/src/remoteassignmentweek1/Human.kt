package remoteassignmentweek1

open class Human(var name: String){

   open fun attack() {
        println("$name use Fist Attack!")
    }
}

fun main(args: Array<String>){

    var human = Human("George")

    human.attack()
}