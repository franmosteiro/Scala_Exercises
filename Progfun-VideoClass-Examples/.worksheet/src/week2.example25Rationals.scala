package week2

object example25Rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  val x1 = new Rational1(1,2);System.out.println("""x1  : week2.Rational1 = """ + $show(x1 ));$skip(11); val res$0 = 
  x1.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
  x1.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(33); 
  
  val y1 = new Rational1(2,3);System.out.println("""y1  : week2.Rational1 = """ + $show(y1 ));$skip(11); val res$2 = 
  y1.numer;System.out.println("""res2: Int = """ + $show(res$2));$skip(11); val res$3 = 
  y1.denom;System.out.println("""res3: Int = """ + $show(res$3));$skip(16); val res$4 = 
  
  x1.add(y1);System.out.println("""res4: week2.Rational1 = """ + $show(res$4));$skip(37); 
  
  //
  val x = new Rational1(1,3);System.out.println("""x  : week2.Rational1 = """ + $show(x ));$skip(29); 
  val y = new Rational1(5,7);System.out.println("""y  : week2.Rational1 = """ + $show(y ));$skip(29); 
  val z = new Rational1(3,2);System.out.println("""z  : week2.Rational1 = """ + $show(z ));$skip(21); val res$5 = 
  
  x.sub(y).sub(z);System.out.println("""res5: week2.Rational1 = """ + $show(res$5))}
}

class Rational1 (x: Int, y: Int) {
	def numer = x
	def denom = y
	
	def add (that: Rational1): Rational1 =
		new Rational1(numer * that.denom + that.numer * denom, denom * that.denom)
		
	def sub (that: Rational1): Rational1 = add(that.neg) //O.O DRY -> new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
		
	def neg: Rational1 = new Rational1(-numer, denom)
	
	override def toString = numer + "/" + denom
}
