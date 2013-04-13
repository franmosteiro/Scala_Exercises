package week2

object example26Rationals {
  val x = new Rational(1,3)                       //> x  : week2.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : week2.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : week2.Rational = 3/2
  
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  x.sub(y).sub(z)                                 //> res2: week2.Rational = -79/42
  y.add(y)                                        //> res3: week2.Rational = 10/7
  x.less(y)                                       //> res4: Boolean = true
  x.max(y)                                        //> res5: week2.Rational = 5/7

	new Rational(1)                           //> res6: week2.Rational = 1/1
}

class Rational (x: Int, y: Int) {
	
	//INFO There is a default constructor in objects. This constructor, executes the body, so, all the "require"ments and all the
	//	existing "val"ues when a new object of this type is built
	
	// INFO For enforce precondition on the caller (IlegallArgumentException)
	require(x != 0, "Denominator must be nonzero")
	require(y != 0, "Denominator must be nonzero")
	
	def this(x: Int) = this(x, 1)
	
	//INFO gcd = greatestCommonDivisor
	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
	//INFO
	private val g = gcd (x, y)
	//INFO declaring numer and denom as "val", does thqt their values is computed only once for the
	//	object suing them. Useful when they are ofently called
	def numer = x / g
	def denom = y / g
	
	def less(that: Rational) = numer * that.denom < that.numer * denom
	
	def max(that: Rational) = if (this.less(that)) that else this
	
	def add (that: Rational): Rational =
		new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
		
	def sub (that: Rational): Rational = add(that.neg) //O.O DRY -> new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
		
	def neg: Rational = new Rational(-numer, denom)
	
	override def toString = numer + "/" + denom
}