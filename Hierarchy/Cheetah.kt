class Cheetah : Feline() {
    override val image = "cheetah.jpg"
    override val food = "meat"
    override val habitat = "savannah"

    override fun makeNoise() {
        println("Purr!")
    }

    override fun eat() {
        println("The Cheetah is eating $food")
    }
}