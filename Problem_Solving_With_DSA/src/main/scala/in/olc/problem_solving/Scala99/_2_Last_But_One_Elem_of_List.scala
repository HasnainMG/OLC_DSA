package in.olc.problem_solving.Scala99

import scala.annotation.tailrec

object _2_Last_But_One_Elem_of_List {

  @tailrec
  def lastButOne(acc: Int, li: List[Int]): Int = li match {
    case _ if li.head == li.last => acc
    case h::t => lastButOne(h,t)
  }

  def main(args: Array[String]): Unit = {
    val li = List(1,1,2,3,5,8)
    println(lastButOne(0,li))

  }
}
