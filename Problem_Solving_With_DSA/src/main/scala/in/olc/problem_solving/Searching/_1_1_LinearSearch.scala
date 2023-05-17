package in.olc.problem_solving.Searching

object _1_1_LinearSearch {
  def findElem(arr: Array[Int], data: Int): Option[Int] = {
    for(i <- arr){
      if(i == data)
        return Some(arr.indexOf(i))
    }
    None
  }
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,43,34,23)
    val data = 43
    findElem(arr,data) match {
      case Some(num) => println(s"Element $data found at position: ${num + 1}")
      case None => println("Element not found.")
    }
  }
}
