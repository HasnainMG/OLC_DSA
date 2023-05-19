package in.olc.problem_solving.Scala99

import scala.annotation.tailrec

object _4_Length_of_List {

  def length(li: List[Int]): Int = {
    @tailrec
    def tailReclength(len: Int, li: List[Int]): Int = li match {
      case Nil => len
      case _::t => tailReclength(len + 1, t)
    }
    tailReclength(0,li)
  }
  def main(args: Array[String]): Unit = {
    val li = List(1, 1, 2, 3, 5, 8)
    println(length(li))
  }
}
