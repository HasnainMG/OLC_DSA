package in.olc.problem_solving.Array

import scala.collection.mutable.ArrayBuffer

object _3_3_MoveZerosToLast {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](1, 2, 0, 0, 0, 3, 6)
    var arrB = ArrayBuffer[Int]()
    var count = 0

    for(i <- arr.length-1 to 0 by -1){
      if(arr(i) != 0)
        arrB +:= arr(i)
      else
        arrB :+= 0
    }

    println(s"The old array: ${arr.mkString(",")}")
    println(s"The new array: ${arrB.mkString(",")}")
  }
}
