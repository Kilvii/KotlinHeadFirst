fun main(){
    val animals = arrayOf(Hippo(),Wolf(),Fox(),Lion(),Cheetah(),Lynx())
    for(item in animals){
        item.roam()
        item.eat()
        item.makeNoise()
    }

    /*val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)*/
}