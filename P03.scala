object P03 extends App {

    def nth(l: List[Int], index: Int): Option[Int] = {
      if (index < 0 || index >= l.size) None
      else if (index == 0) Some(l(0))
      else l match {
        case primero :: resto => nth(resto, index - 1)
        case _ => throw new RuntimeException("cannot reach here")
      }
    }

    val l1 = List(1, 1, 2, 3, 5, 8)
    val l2 = List()

    val value_1 = nth(l1, 5)
    println("" + l1 + " => " + value_1)

    val value_2 = nth(l2, 1)
    println("" + l2 + " => " + value_2)
}
