package in.olc.problem_solving.Array

import scala.collection.mutable.ArrayBuffer

object _5_1_EvenFirstOddAfter {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](2, 4, 1, 3, 7, 6, 9, 10)
    val newArr = ArrayBuffer[Int]()
    var ind = 0
    for (i <- arr.indices){
      if(arr(i) % 2 == 0) {
        newArr.insert(ind, arr(i))
        ind += 1
      } else
        newArr.append(arr(i))
    }
    println(s"arr -> ${arr.mkString(",")}")
    println(s"newArr -> ${newArr.mkString(",")}")
  }
}