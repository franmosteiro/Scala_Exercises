package week3.Lists

import java.util.NoSuchElementException

trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
	//def singleton[T](elem: T)
}

class Cons[T] (val head: T, val tail: List[T]) extends List[T] {
  //def: is a val each time is referenced
  //val (field and classes): is a val is evaluated when a class is initialized
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
  //def singleton: Nothing = throw new NoSuchElementException("Nil.singleton")
}