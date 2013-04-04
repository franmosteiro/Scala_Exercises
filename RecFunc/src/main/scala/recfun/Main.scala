package recfun
import common._
import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    @tailrec
    def balancer(lChars: List[Char], numberOfBracers: Int): Boolean = {
      if (lChars.isEmpty) 
        /* This is the most important part for corner cases "(" && ")"
         * In the second rec iteration it migth return false in this statement
         * because lChars.isEmpty when lChars it's in real lchars.tail (it means "(".tail for ex)
         * So as numberOfBracers is = 1 then == returns FALSE
         */
        numberOfBracers == 0
      else {

        val first = lChars.head
        val numOcurr =
          if (first == '(')
            numberOfBracers + 1
          else if (first == ')')
            numberOfBracers - 1
          else numberOfBracers
        // In Scala, if else returns value (it's an expression). 
        //So, without the last 'else', "numOcurr" would be "AnyType" and we couldn't had done the secuent if >= 0   

        if (numOcurr >= 0)
          balancer(lChars.tail, numOcurr)
        else false

      }

    }
    balancer(chars, 0)

    /*@tailrec
    def balancer(chars: List[Char], count: Int): Boolean = {
      chars match {
        case Nil => true
        case '(' :: xs => balancer(xs, count + 1)
        case ')' :: xs => (count > 0) && balancer(xs, count - 1)
        case _ => balancer(chars.tail, count) // next!
      }
    }
    balancer(chars, 0)*/

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0) 0
    else if (coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}
