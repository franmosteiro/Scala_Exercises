package week4.decomposition

class Number(n: Int) extends Expr {
	def isNumber: Boolean = true
	def isSum: Boolean = false
	def numValue: Int = n
	def leftOp: Expr = throw new Error("leftOp")
	def rightOp: Expr = throw new Error("rightOp")
	def eval: Int = n
}