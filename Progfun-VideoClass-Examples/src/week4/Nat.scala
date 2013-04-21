package week4
//Peano numbers
abstract class Nat {
	def isZero: Boolean
	def predecessor: Nat
	def succesor = new Succesor(this)
	def + (that: Nat): Nat
	def - (that: Nat): Nat
}

object Zero extends Nat {
    def isZero = true
	def predecessor = throw new NoSuchElementException("0.predecessor is negative")
	def + (that: Nat) = that
	def - (that: Nat) = if (that.isZero) this else throw new NoSuchElementException("0.- is negative")
}

class Succesor(n: Nat) extends Nat {
    def isZero = false
	def predecessor = n
	def + (that: Nat) = new Succesor(n + that)
	def - (that: Nat) = if (that.isZero) this else  n - that.predecessor
}