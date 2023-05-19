package in.olc.problem_solving.Scala99

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object _5_Reverse_List {
  def reverse(li: List[Int]): List[Int] = {
    @tailrec
    def recReverse(resultList: List[Int], li: List[Int]): List[Int] = li match {
      case Nil => resultList
      case head::tail => recReverse(head :: resultList, tail)
    }
    recReverse(Nil, li)
  }
  def main(args: Array[String]): Unit = {
    val li = List(1, 1, 2, 3, 5, 8)
    println(reverse(li))
  }
}
