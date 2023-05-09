package in.olc.problem_solving.Searching

object _1_1_BinarySearch {
  def binSearch(arr: Array[Int], elem: Int): String = {
    var left = 0
    var right = arr.length - 1
    while(left<right){
      val mid = (left + right)/2
      if(elem == arr(mid))
        return s"Element Found at index: $mid"
      else if(elem < arr(mid))
        right = mid-1
      else
        left = mid+1
    }
    "Element Not Found"
  }
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](15,5,20,35,2,42,67,17)
    println(binSearch(arr,5))
    println(binSearch(arr,25))
  }
}
