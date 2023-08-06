object P07 extends App {

    def flatten(l: List[Any]): List[Any] = {
      l match {
        case Nil => Nil
        case x :: xs => x match {
          case l @ List(_*) => flatten(l) ++ flatten(xs)
          case x => x :: flatten(xs)
        }
      }
    }

    val l1 = List(List(List(1), 1), 2, List(3, List(5, 8)))
    val l2 = List(List(1, 2, 3), List(), List(2, 3, 2, 1))

    val value_1 = flatten(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = flatten(l2)
    println("" + l2 + " => " + value_2)

}
