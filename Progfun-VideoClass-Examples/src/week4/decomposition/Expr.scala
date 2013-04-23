package week4.decomposition

trait Expr {
	def isNumber: Boolean
	def isSum: Boolean
	def numValue: Int
	def leftOp: Expr
	def rightOp: Expr
	/*def eval_old(e: Expr): Int = 
	  	if (e.isNumber) e.numValue
	  	else if (e.isSum) eval(e.leftOp) + eval(e.rightOp)
	  	else throw new Error("Unknown expression " + e) 
	  	
	def eval_old2(e: Expr): Int =
	  if (e.isInstanceOf[Number])
		  e.asInstanceOf[Number].numValue
		  else if (e.isInstanceOf[Sum])
			  eval(e.asInstanceOf[Sum].leftOp) + eval(e.asInstanceOf[Sum].rightOp)
			  else throw new Error("Unknown expression " + e)
	 */
	def eval: Int
}