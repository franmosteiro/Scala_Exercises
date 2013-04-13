package week2

object example26Rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  val x = new Rational(1,3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(13); val res$0 = 
  
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(18); val res$2 = 
  x.sub(y).sub(z);System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(11); val res$3 = 
  y.add(y);System.out.println("""res3: week2.Rational = """ + $show(res$3));$skip(12); val res$4 = 
  x.less(y);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(11); val res$5 = 
  x.max(y);System.out.println("""res5: week2.Rational = """ + $show(res$5));$skip(18); val res$6 = 

	new Rational(1);System.out.println("""res6: week2.Rational = """ + $show(res$6))}
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
