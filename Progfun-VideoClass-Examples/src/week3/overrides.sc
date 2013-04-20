package week3

object overrides {
  new Sub().foo                                   //> res0: Int = 2
  new Sub().bar                                   //> res1: Int = 3
  
  // 15''19s
}

abstract class Base {
	def foo = 1
	def bar: Int
}

class Sub extends Base {
	//Scala forces the use of override for protecting overridable functions. Also does the oposite protection when you try to override
		// any not existing overridable funtion (ex: override def foo2  -> does not exist !)
	override def foo = 2
	//If it's not defined in abstract class, there is no need of override
	def bar = 3
}