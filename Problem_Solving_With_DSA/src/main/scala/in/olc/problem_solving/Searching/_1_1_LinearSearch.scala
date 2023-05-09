package in.olc.problem_solving.Searching

object _1_1_LinearSearch {
  def search(arr: Array[Int], elem: Int): String = {
    for(i <- arr.indices){
      if(arr(i) == elem)
        return s"Element Found at index: $i and  position: ${i+1}"
    }
    "Element Not Found"
  }
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](15,5,20,35,2,42,67,17)
    println(search(arr,42))
    println(search(arr,25))
  }
}
