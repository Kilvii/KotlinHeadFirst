fun main(args: Array<String>) {
    /*var z:Short = 6
    var f = 2.0

    var x = 5
    var r:Long = x.toLong()

    var b:Byte = 2
    var smallNum = b.toShort()

    var myArray = arrayOf(1, 2, 3)
    println(myArray[0])
    myArray.size*/

    var x = 0
    var y = 20
    for(outer in 1..3) {
        for (inner in 4 downTo 2) {
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")

}