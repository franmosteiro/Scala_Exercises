package week4
 
abstract class IntSet {
	def incl(x: Int): IntSet
	def contains(x: Int): Boolean
	def union(other: IntSet): IntSet
	override def toString(): String
}

//Just one Empty object for all the class
class Empty extends IntSet {
	def contains(x: Int): Boolean = false
	def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
	def union(other: IntSet): IntSet = other
	override def toString = "e"
}

class NonEmpty (elem: Int, left: IntSet, right: IntSet) extends IntSet {
	
	def contains(x: Int): Boolean = {
		if (x < elem) left contains x
		else if (x > elem) right contains x
		else true
	}
	
	def incl(x: Int): IntSet = {
		if (x < elem) new NonEmpty(elem, left incl x, right)
		else if (x > elem) new NonEmpty(elem, left, right incl x)
		else this
	}
	//it really endsw because the left part always is smaller than the right one.
		//So sometime, left would be zero and terminate with Empty
	def union(other: IntSet): IntSet =
		((left union right) union other) incl elem
	
	override def toString = {
		"{" + left + elem + right + "}"
	}
}