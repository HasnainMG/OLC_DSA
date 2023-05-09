package in.olc.problem_solving.Array

import scala.collection.mutable.ArrayBuffer

object _4_1_TwoPointerTechnique {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](1,2,3,4,5,6,7,8)
    val newArr = ArrayBuffer[Int]()
    var i = 0
    var j = arr.length - 1
    for (_ <- i until j if i < j) {
      newArr.append(arr(j))
      newArr.append(arr(i)) // i = 3 j = 4 newArr = {7,1,6,2,5,3}
      i += 1
      j -= 1
    }
    if(arr.length % 2 != 0)
      newArr.append(arr(i))

    println(s"arr -> ${arr.mkString(",")}")
    println(s"newArr -> ${newArr.mkString(",")}")
  }
}