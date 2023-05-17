package in.olc.problem_solving.Sorting

object _1_1_BubbleSorting {
  def main(args: Array[String]): Unit = {
    val arr = Array(16,14,5,6,8)
    val n = arr.length - 1
    var swap = true
    for(i <- 0 until n if swap){
      swap = false
      for(j <- 0 until n-i){
        if(arr(j)>arr(j+1)){
          val temp = arr(j)
          arr(j) = arr(j+1)
          arr(j+1) = temp
          swap = true
        }
      }
    }
    print(arr.mkString(", "))
  }
}
