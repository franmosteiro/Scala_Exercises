package week4.pattern_matching

object exprs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(140); 
	
	def eval (e: Expr): Int = e match {
		case Number(n) => n
		case Sum(e1, e2) => e1 + e2
	};System.out.println("""eval: (e: week4.pattern_matching.Expr)Int""")}

  /*def show (e: Expr): String = e match {
  	case Number(n) => n.toString
  	case Sum(l, r) => show(l) + "+" + show(r)
  }
  
  show(Sum(Number(1), Number(44)))*/
}
