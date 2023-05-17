package in.olc.problem_solving.Searching

object _1_1_BinarySearch {
  def binSearch(arr: Array[Int], data: Int): Option[Int] = { // arr = 71,89 | data = 71
    var left = 0
    var right = arr.length - 1 // 9
    while (left < right) { //midVal = 63
      val mid = (left + right) / 2 // 4
      if (data > arr(mid)) {
        left = mid + 1 // 8
      }
      else if (data < arr(mid)) {
        right = mid - 1
      }
      else
        return Some(mid)
    }
    None
  }

  def main(args: Array[String]): Unit = {
    //    val arr = Array(5,9,17,23,25,45,59,63,71,89)
    val arr = Array[Int](15, 5, 20, 35, 2, 42, 67, 17)
    binSearch(arr, 42) match {
      case Some(num) => println(s"Element found at position: ${num + 1}")
      case None => println("Element NOT Found.")
    }
  }
}