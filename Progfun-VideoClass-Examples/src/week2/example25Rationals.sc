package week2

object example25Rationals {
  val x1 = new Rational1(1,2)                     //> x1  : week2.Rational1 = 1/2
  x1.numer                                        //> res0: Int = 1
  x1.denom                                        //> res1: Int = 2
  
  val y1 = new Rational1(2,3)                     //> y1  : week2.Rational1 = 2/3
  y1.numer                                        //> res2: Int = 2
  y1.denom                                        //> res3: Int = 3
  
  x1.add(y1)                                      //> res4: week2.Rational1 = 7/6
  
  //
  val x = new Rational1(1,3)                      //> x  : week2.Rational1 = 1/3
  val y = new Rational1(5,7)                      //> y  : week2.Rational1 = 5/7
  val z = new Rational1(3,2)                      //> z  : week2.Rational1 = 3/2
  
  x.sub(y).sub(z)                                 //> res5: week2.Rational1 = -79/42
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