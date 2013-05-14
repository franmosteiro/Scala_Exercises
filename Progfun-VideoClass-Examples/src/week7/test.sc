package week7

object test {

	val problem = new Pouring(Vector(4, 9, 19))
                                                  //> problem  : week7.Pouring = week7.Pouring@1901437
	problem.moves                             //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with we
                                                  //| ek7.test.problem.Move] = Vector(Empty(0), Empty(1), Empty(2), Fill(0), Fill(1
                                                  //| ), Fill(2), Pour(0,1), Pour(0,2), Pour(1,0), Pour(1,2), Pour(2,0), Pour(2,1))
                                                  //| 
	problem.pathSets.take(3).toList           //> res1: List[Set[week7.test.problem.Path]] = List(Set(), Set(Fill(0), Fill(1),
                                                  //|  Fill(2)), Set(Fill(0)  --> Vector(4, 9, 0)Fill(1), Fill(1)  --> Vector(0, 0
                                                  //| , 9)Pour(1,2), Fill(0)  --> Vector(0, 4, 0)Pour(0,1), Fill(2)  --> Vector(0,
                                                  //|  9, 19)Fill(1), Fill(2)  --> Vector(0, 9, 10)Pour(2,1), Fill(2)  --> Vector(
                                                  //| 4, 0, 19)Fill(0), Fill(0)  --> Vector(0, 0, 4)Pour(0,2), Fill(1)  --> Vector
                                                  //| (4, 9, 0)Fill(0), Fill(2)  --> Vector(4, 0, 15)Pour(2,0), Fill(1)  --> Vecto
                                                  //| r(0, 9, 19)Fill(2), Fill(1)  --> Vector(4, 5, 0)Pour(1,0), Fill(0)  --> Vect
                                                  //| or(4, 0, 19)Fill(2)))
	problem.solution(17)                      //> res2: Stream[week7.test.problem.Path] = Stream(Fill(0)  --> Vector(0, 0, 17)
                                                  //| Fill(1)  --> Vector(0, 0, 17)Pour(0,2)  --> Vector(0, 0, 17)Fill(0)  --> Vec
                                                  //| tor(0, 0, 17)Pour(1,2)  --> Vector(0, 0, 17)Pour(0,2), ?)
	

}