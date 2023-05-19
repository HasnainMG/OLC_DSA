package in.olc.problem_solving.Scala99

import scala.annotation.tailrec

object _1_Last_Elem_of_List {
  @tailrec
  def last[A](acc: A, li: List[A]): A = li match {
    case Nil =>  acc
    case head::tail => last(head,tail)
    case _ => throw new NoSuchElementException
  }
  def main(args: Array[String]): Unit = {
    val li = List(1,1,2,3,5,8)
    println(last(0,li))
  }
}
