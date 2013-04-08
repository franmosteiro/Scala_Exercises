package week2

object example25Rationals {
  val x1 = new Rational(1,2)                      //> x1  : week2.Rational = 1/2
  x1.numer                                        //> res0: Int = 1
  x1.denom                                        //> res1: Int = 2
  
  val y1 = new Rational(2,3)                      //> y1  : week2.Rational = 2/3
  y1.numer                                        //> res2: Int = 2
  y1.denom                                        //> res3: Int = 3
  
  x1.add(y1)                                      //> res4: week2.Rational = 7/6
  
  //
  val x = new Rational(1,3)                       //> x  : week2.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : week2.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : week2.Rational = 3/2
  
  x.sub(y).sub(z)                                 //> res5: week2.Rational = -79/42
}

class Rational (x: Int, y: Int) {
	def numer = x
	def denom = y
	
	def add (that: Rational): Rational =
		new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
		
	def sub (that: Rational): Rational = add(that.neg) //O.O DRY -> new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
		
	def neg: Rational = new Rational(-numer, denom)
	
	override def toString = numer + "/" + denom
}