package in.olc.problem_solving.Array

object _1_2_LargestThreeNums {
  def main(args: Array[String]): Unit = {
    var arr = Array[Int](12, 45, 1, -1, 45, 54, 23, 5, 0, -10)
    /* corner cases
    * if the length of array is less than 4
    * or the minimum and maximum of the arr is same
    */
    if (arr.length < 4 || arr.max == arr.min)
      println("Invalid Output")
    else {
      arr = arr.sorted(Ordering[Int].reverse)
      println(s"Largest three numbers are: ${arr(0)}, ${arr(1)}, ${arr(2)}")
    }
  }// main
}
