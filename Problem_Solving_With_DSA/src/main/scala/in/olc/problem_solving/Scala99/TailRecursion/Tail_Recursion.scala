package in.olc.problem_solving.Scala99.TailRecursion

import scala.annotation.tailrec

object Tail_Recursion {
  def factorial(num:BigInt):BigInt = {
    @tailrec
    def tailRecFactorial(acc: BigInt, num: BigInt): BigInt = {
      if (num == 1)
        acc
      else
        tailRecFactorial(acc * num, num - 1)
    }
    tailRecFactorial(1,num)
  }

  @tailrec
  def summation(acc: BigInt, li: List[Int]):BigInt = li match {
    case Nil => acc
    case head::tail => summation(acc+head, tail)
  }

  def fibonacci(num: Int): BigInt = {
    @annotation.tailrec
    def fibTailRec(n: Int, a: BigInt, b: BigInt): BigInt = {
      if (n <= 0) a
      else fibTailRec(n - 1, b, a + b)
    }

    fibTailRec(num, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10)
      print(fibonacci(i) + ", ")
  }
}
