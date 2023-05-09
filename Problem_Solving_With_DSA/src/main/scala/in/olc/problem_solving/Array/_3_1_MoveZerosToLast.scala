package in.olc.problem_solving.Array

object _3_1_MoveZerosToLast {
  def main(args: Array[String]): Unit = {
    var arr = Array[Int](1,9,8,4,0,0,2,7,0,6,0,9) //
    var swapIndex = 0
    for(i <- arr.indices){
      if(arr(i) != 0){
        val t = arr(i)
        arr(i) = arr(swapIndex)
        arr(swapIndex) = t
        swapIndex += 1
      }
    }
    println(arr.mkString(","))
  }// main
}
