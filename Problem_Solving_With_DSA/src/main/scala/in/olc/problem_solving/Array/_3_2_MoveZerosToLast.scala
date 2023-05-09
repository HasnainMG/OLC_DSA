package in.olc.problem_solving.Array

import scala.collection.mutable.ArrayBuffer

object _3_2_MoveZerosToLast {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](1, 2, 0, 0, 0, 3, 6)
    val arrB = ArrayBuffer[Int]()
    var count = 0

    for(i <- arr) {
      if (i != 0)
        arrB.append(i)
      else
        count += 1
    }

    for(_ <- 0 to count)
      arrB.append(0)

    println(arrB.mkString(","))
  }// main
}
