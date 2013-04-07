package week2

object exercise22 {
	def product (f: Int => Int) (a: Int, b: Int): Int =
		if (a > b) 1
		else f(a) * product (f) ( a + 1, b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
		product(x => x * x)(3, 4)         //> res0: Int = 144
		
		def factorial (n: Int) =  product(x => x)(1,n)
                                                  //> factorial: (n: Int)Int
    factorial(5)                                  //> res1: Int = 120
    
    def mapReduce (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int

}