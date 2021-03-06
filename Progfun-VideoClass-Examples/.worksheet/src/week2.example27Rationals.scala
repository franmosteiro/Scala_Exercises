package week2

object example27Rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  val x = new Rational27(1,3);System.out.println("""x  : week2.Rational27 = """ + $show(x ));$skip(30); 
  val y = new Rational27(5,7);System.out.println("""y  : week2.Rational27 = """ + $show(y ));$skip(30); 
  val z = new Rational27(3,2);System.out.println("""z  : week2.Rational27 = """ + $show(z ));$skip(13); val res$0 = 
  
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(12); val res$2 = 
  x - y - z;System.out.println("""res2: week2.Rational27 = """ + $show(res$2));$skip(8); val res$3 = 
  y + y;System.out.println("""res3: week2.Rational27 = """ + $show(res$3));$skip(8); val res$4 = 
  x < y;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(10); val res$5 = 
  x max y;System.out.println("""res5: week2.Rational27 = """ + $show(res$5));$skip(20); val res$6 = 

	new Rational27(1);System.out.println("""res6: week2.Rational27 = """ + $show(res$6))}
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
