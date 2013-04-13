package week2

object example27Rationals {
  val x = new Rational27(1,3)                     //> x  : week2.Rational27 = 1/3
  val y = new Rational27(5,7)                     //> y  : week2.Rational27 = 5/7
  val z = new Rational27(3,2)                     //> z  : week2.Rational27 = 3/2
  
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  x - y - z                                       //> res2: week2.Rational27 = -79/42
  y + y                                           //> res3: week2.Rational27 = 10/7
  x < y                                           //> res4: Boolean = true
  x max y                                         //> res5: week2.Rational27 = 5/7

	new Rational27(1)                         //> res6: week2.Rational27 = 1/1
}

class Rational27 (x: Int, y: Int) {
	
	//INFO There is a default constructor in objects. This constructor, executes the body, so, all the "require"ments and all the
	//	existing "val"ues when a new object of this type is built
	
	// INFO For enforce precondition on the caller (IlegallArgumentException)
	require(x != 0, "Nominator must be nonzero")
	require(y != 0, "Denominator must be nonzero")
	
	def this(x: Int) = this(x, 1)
	
	//INFO gcd = greatestCommonDivisor
	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

	//INFO declaring numer and denom as "val", does thqt their values is computed only once for the
	//	object suing them. Useful when they are ofently called
	def numer = x
	def denom = y
	
	def < (that: Rational27) = numer * that.denom < that.numer * denom
	
	def max(that: Rational27) = if (this < that) that else this
	
	def + (that: Rational27): Rational27 =
		new Rational27(numer * that.denom + that.numer * denom, denom * that.denom)
		
	def - (that: Rational27): Rational27 = this + -that //was neg
	
	//INFO the &nbsp; between - and : is needed. Otherwise, if you glue them (-:) the : is understood as part of the identifier
	//INFO the unary_ is used to detect wich is the real neg value (the unary one)
	def unary_- : Rational27 = new Rational27(-numer, denom) // was sub
	
	override def toString = {
		val g = gcd (numer, denom)
		numer/g + "/" + denom/g
	}
}