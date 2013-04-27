package week4.lists

object List {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(154); 
  def isort(xs: List[Int]): List[Int] = xs match {
  	case List() => List()
  	case y :: ys => insert(y, isort(ys))
  };System.out.println("""isort: (xs: List[Int])List[Int]""");$skip(136); 
  
  def insert(x: Int, xs: List[Int]) = xs match {
  	case List() => List(x)
  	case y::ys => if (x <= y) x::xs else insert(y, ys)
  };System.out.println("""insert: (x: Int, xs: List[Int])<error>""")}
  
}
