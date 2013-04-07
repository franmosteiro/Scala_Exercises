package week2

object exercise22b {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(212); 
		
		def mapReduce (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a+1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(95); 
		
		def product (f: Int => Int) (a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(31); val res$0 = 
    product(x => x * x)( 3, 4);System.out.println("""res0: Int = """ + $show(res$0))}
}
