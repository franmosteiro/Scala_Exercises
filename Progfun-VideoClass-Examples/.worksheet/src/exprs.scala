import week4.pattern_matching

object exprs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(152); 
	
	def eval (e: Expr): Int = e maatch {
		case Number(n) => n
		case Sum(e1, e2) => eval(e1) + eval(e2)
	};System.out.println("""eval: (e: <error>)Int""");$skip(123); 

  def show (e: Expr): String = e match {
  	case Number(n) => x.toString
  	case Sum(l, r) => show(l) + "+" + show(r)
  };System.out.println("""show: (e: <error>)String""")}
}
