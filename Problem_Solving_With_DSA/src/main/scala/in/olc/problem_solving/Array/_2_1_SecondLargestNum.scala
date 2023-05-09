package in.olc.problem_solving.Array

object _2_1_SecondLargestNum {
  def main(args: Array[String]): Unit = {
    var (first,second) = Tuple2(Int.MinValue, Int.MinValue)
    val arr = Array[Int](12, 45, 1, -1, 45, 54, 23, 5, 0, -10)
    /* corner cases
    * if the length of array is less than 3
    * or the minimum and maximum of the arr is same
    */
    if(arr.length < 3 || arr.max == arr.min)
      println("Invalid Output")
    else {
      for(i <- arr) {
        if(i > first) {
          second = first
          first = i
        }
        else if(i > second  && i < first) {
          second = i
        }
      }
      println(s"Second Largest number is: $second")
    }
  }// main
}
