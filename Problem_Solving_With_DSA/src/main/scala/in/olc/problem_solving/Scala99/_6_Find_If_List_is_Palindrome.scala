package in.olc.problem_solving.Scala99

import scala.annotation.tailrec

object _6_Find_If_List_is_Palindrome {
  def find(li:List[Int]): Boolean = {
    var returnValue = false
    if (li.size % 2 == 0)
      return false
    else {
      var idx = 0
      while(idx != li.size/2){
        if(li.head == li.last) {
          println(s"${li.head} -> ${li.last}")
          returnValue = if(li.tail.head==li.init.last) true else false
        }
        idx += 1
      }
    }
    returnValue
  }
  def palindrome(li: List[Int]): Boolean = {
    @tailrec
    def palindromeHelper(rightList: List[Int], leftList: List[Int]): Boolean = rightList match { // li = 4, 5, 10
      case _ if rightList.size == 1 => true
      case _ if rightList.head == leftList.last => palindromeHelper(rightList.tail, leftList.init)
      case _ => false
    }
    palindromeHelper(li,li)
  }
  def main(args: Array[String]): Unit = {
    val li = List(1, 2, 3, 4, 5, 10, 3, 2, 1)
    println(palindrome(li))
//    val checkList = List(5)
//    if(checkList.head == checkList.last) println("True") else println("false")
  }
}
