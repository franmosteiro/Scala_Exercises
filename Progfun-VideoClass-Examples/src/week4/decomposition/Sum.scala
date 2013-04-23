package week4.decomposition

class Sum(e1: Expr, e2: Expr) extends Expr {
	def isNumber: Boolean = false
	def isSum: Boolean = true
	def numValue: Int = throw new Error("Sum.numValue")
	def leftOp: Expr = e1
	def rightOp: Expr = e2
	def eval: Int = e1.eval + e2.eval
}