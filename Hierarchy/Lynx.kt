class Lynx : Feline() {
    override val image = "lynx.jpg"
    override val food = "meat"
    override val habitat = "savannah"

    override fun makeNoise() {
        println("Purr!")
    }

    override fun eat() {
        println("The Lynx is eating $food")
    }
}