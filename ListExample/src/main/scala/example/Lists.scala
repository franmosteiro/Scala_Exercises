package example

import common._
import scala.annotation.tailrec

object Lists {
  /**
   * This method computes the sum of all elements in the list xs. There are
   * multiple techniques that can be used for implementing this method, and
   * you will learn during the class.
   *
   * For this example assignment you can use the following methods in class
   * `List`:
   *
   *  - `xs.isEmpty: Boolean` returns `true` if the list `xs` is empty
   *  - `xs.head: Int` returns the head element of the list `xs`. If the list
   *    is empty an exception is thrown
   *  - `xs.tail: List[Int]` returns the tail of the list `xs`, i.e. the
   *    list `xs` without its `head` element
   *
   *  ''Hint:'' instead of writing a `for` or `while` loop, think of a recursive
   *  solution.
   *
   * @param xs A list of natural numbers
   * @return The sum of all elements in `xs`
   */
  def sum(xs: List[Int]): Int = {
    
    /*if (xs.isEmpty) 0
    else if (xs.tail.isEmpty) xs.head
    else xs.head + sum(xs.tail)*/
    
    /* Tailrec */
    
    @tailrec
    def recursiveSum(xs: List[Int], sum: Int): Int = {
    		xs match {
				case tmp :: tail => recursiveSum(tail, sum + tmp)
				case Nil => sum
    		}
	}
	recursiveSum(xs, 0)
    
    /* Using fold 
    if (xs.isEmpty) 0
    else xs.fold(0) (_ + _)
    */
    
    /* Using reduceLeft 
    if (xs.isEmpty) 0
    else xs.reduceLeft ( _ + _ )
    */
    
    /* With pattern matching
     xs match {
    	case x :: tail => x + sum(tail)
    	case Nil => 0
    }*/
  }

  /**
   * This method returns the largest element in a list of integers. If the
   * list `xs` is empty it throws a `java.util.NoSuchElementException`.
   *
   * You can use the same methods of the class `List` as mentioned above.
   *
   * ''Hint:'' Again, think of a recursive solution instead of using looping
   * constructs. You might need to define an auxiliary method.
   *
   * @param xs A list of natural numbers
   * @return The largest element in `xs`
   * @throws java.util.NoSuchElementException if `xs` is an empty list
   */
  def max(xs: List[Int]): Int = {
    /*if (xs.isEmpty) 0 //throw new java.util.NoSuchElementException("`xs` is an empty list") 
    else {
      if( xs.head >= max(xs.tail) ) xs.head
      else max(xs.tail)
    } */
    
    /* Using List.max function
    if (xs.isEmpty) 0
    else xs.max*/
    
    /* Using fold 
    if (xs.isEmpty) 0
    else xs.fold(0) (_ max _)
    */ 
    
    /* Using reduceLeft 
    if (xs.isEmpty) 0
    else xs.reduceLeft ( _ max _ )
    */
    if (xs.isEmpty)  throw new java.util.NoSuchElementException("`xs` is an empty list") 
    else { 
	    @tailrec 
	    def recursiveMax(soFar: Int, leftList: List[Int]): Int = 
	    	if (leftList.isEmpty) soFar
	    	else recursiveMax(soFar max leftList.head, leftList.tail)
	  
	    recursiveMax(xs.head, xs.tail)
    } 
  }
}
