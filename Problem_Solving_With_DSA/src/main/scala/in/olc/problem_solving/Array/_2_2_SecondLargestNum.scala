package in.olc.problem_solving.Array

object _2_2_SecondLargestNum {
  def main(args: Array[String]): Unit = {
    var arr = Array[Int](12, 45, 1, -1, 45, 54, 23, 5, 0, -10)
    if(arr.length < 2 && arr.max == arr.min)
      println("Invalid Output")
    else {
      arr = arr.sorted(Ordering[Int].reverse)
      println(s"Second Largest number is: ${arr(1)}")
    }
  }// main
}
