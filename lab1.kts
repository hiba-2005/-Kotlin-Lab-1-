/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
   println(123 + 456 * 789)
   println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
   println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
   println(13530.0 / 1.23)

 /**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
      
   val scoreLevel1 = 79
   val scoreLevel2 = 92
   val scoreLevel3 = 86
    
   val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    
   val averageScoreInt = totalScore / 3
       println(totalScore)
       
       
   val averageScoreDouble = totalScore / 3.0
       println("Total score = $totalScore")
       println("Average (Int) = $averageScoreInt")
       println("Average score = %.2f".format(averageScoreDouble))
     
     val boostMultiplier = 4
     val scoreBoost = totalScore * boostMultiplier
     val finalBoostedScore = totalScore + scoreBoost
    
    println("Score boost = $scoreBoost")
    println("Final boosted score = $finalBoostedScore")
  
    
}

}