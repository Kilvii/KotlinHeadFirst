class Contest<T: Pet> (var vet:Vet<in T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val winners: MutableSet<T> = mutableSetOf()
        val Scores = scores.values
        var highScore = Scores.toList()
        for ((t, score) in scores) {
            if (score == getMax(highScore))
                winners.add(t)
        }

        return winners
    }

    fun getMax(list: List<Int>) : Int{
        var max = 0
        for (x in 0 until list.size){
            if(list.get(x) > max){
                max = list.get(x)
            }
        }

        return max
    }
}