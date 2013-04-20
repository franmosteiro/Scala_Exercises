import week3.Rational

// Automatically imported
// scala._
// java.lang._
// scala.predef._

//scala.AnyRef === java.lang.Object == All reference types
//scala.AnyVal == base of all primitive types
//scala.Any === base of all types, implements == != equals

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(295); val res$0 = 
  new Rational(3,4);System.out.println("""res0: week3.Rational = """ + $show(res$0));$skip(178); 
  
  //scala.Nothing === abnormal termination of an app === as an element type of empty collections
	// ex: throw Exc === Nothing
  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(71); 
	//error("test")
	
	//scala.Null === value for all types
	val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(30); 
	//x: Null
	val y: String = x;System.out.println("""y  : String = """ + $show(y ))}
	//y: String
	//ERROR -> val z: Int = null
}
