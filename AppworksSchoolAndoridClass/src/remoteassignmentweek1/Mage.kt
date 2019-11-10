package remoteassignmentweek1

class Mage(name: String): Human(name){

    override fun attack() {
        println("$name use Fireball!")
    }
}

fun main(){

    var mage = Mage("Dante")

    mage.attack()
}