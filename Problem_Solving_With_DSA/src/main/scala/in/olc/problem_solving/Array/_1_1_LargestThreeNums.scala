package in.olc.problem_solving.Array

object _1_1_LargestThreeNums {
  def main(args: Array[String]): Unit = {
    var (first,second,third) = Tuple3(Int.MinValue, Int.MinValue, Int.MinValue) //12,10,min
    val arr = Array[Int](12, 10, 12, 11, 11, 9)
    /* corner cases
    * if the length of array is less than 4
    * or the minimum and maximum of the arr is same
    */
    if (arr.length < 4 || arr.max == arr.min)
      println("Invalid Input")
    else {
      for (i <- arr) {
        if (i > first) {
          third = second
          second = first
          first = i
        }
        else if (i > second && i < first) { // adding second condition for repeated elements in arr
          third = second
          second = i
        }
        else if (i > third && i < second) // adding second condition for repeated elements in arr
          third = i
      }
      println(s"The Largest Three Numbers are: $first, $second, $third")
    }
  } //main
}
