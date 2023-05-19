package in.olc.problem_solving.Scala99

import scala.annotation.tailrec

object _3_Kth_Elem_of_List {

  @tailrec
  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val li = List(1, 1, 2, 3, 5, 8)


  }
}
