package in.olc.problem_solving.Sorting

object _1_1_InsertionSorting {
  def main(args: Array[String]): Unit = {
    val arr = Array(5,4,10,1,6,2)
    for(i <- 1 until arr.length){
      val temp = arr(i)
      var j = i-1
      while(j >= 0 && arr(j) > temp){
        arr(j+1) = arr(j)
        j -= 1
      }
      arr(j+1) = temp
    }
    println(arr.mkString(", "))
  }
}
