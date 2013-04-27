package week4.pattern_matching

trait Expr 
case class Number(n: Int) extends Expr
case class Sum(e1: Int, e2: Int) extends Expr