package in.olc.problem_solving.Array

object _4_1_EvenPosition_GT_OddPosition {
  def main(args: Array[String]): Unit = {
    var arr = Array[Int](1, 3, 2, 2, 5)
    for(i <- 0 to arr.length-2){
      if(i % 2==0 && arr(i) < arr(i+1)){
        val temp = arr(i)
        arr(i) = arr(i+1)
        arr(i+1) = temp
      }
    }
    println(arr.mkString(","))
  }// main
}
