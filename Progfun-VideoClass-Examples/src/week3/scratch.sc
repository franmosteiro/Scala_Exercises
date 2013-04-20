import week3.Rational

// Automatically imported
// scala._
// java.lang._
// scala.predef._

//scala.AnyRef === java.lang.Object == All reference types
//scala.AnyVal == base of all primitive types
//scala.Any === base of all types, implements == != equals

object scratch {
  new Rational(3,4)                               //> res0: week3.Rational = 3/4
  
  //scala.Nothing === abnormal termination of an app === as an element type of empty collections
	// ex: throw Exc === Nothing
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
	//error("test")
	
	//scala.Null === value for all types
	val x = null                              //> x  : Null = null
	//x: Null
	val y: String = x                         //> y  : String = null
	//y: String
	//ERROR -> val z: Int = null
}