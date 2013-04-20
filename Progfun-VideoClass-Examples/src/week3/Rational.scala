package week3

class Rational (x: Int, y: Int) {
	
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
	
	def < (that: Rational) = numer * that.denom < that.numer * denom
	
	def max(that: Rational) = if (this < that) that else this
	
	def + (that: Rational): Rational =
		new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
		
	def - (that: Rational): Rational = this + -that //was neg
	
	//INFO the &nbsp; between - and : is needed. Otherwise, if you glue them (-:) the : is understood as part of the identifier
	//INFO the unary_ is used to detect wich is the real neg value (the unary one)
	def unary_- : Rational = new Rational(-numer, denom) // was sub
	
	override def toString = {
		val g = gcd (numer, denom)
		numer/g + "/" + denom/g
	}
}