package week3

object overrides {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); val res$0 = 
  new Sub().foo;System.out.println("""res0: Int = """ + $show(res$0));$skip(16); val res$1 = 
  new Sub().bar;System.out.println("""res1: Int = """ + $show(res$1))}
  
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
