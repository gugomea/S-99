object P01 extends App {

    def last(l: List[Int]): Option[Int] = {
      l match {
        case Nil => None
        case List(n) => Some(n)
        case x :: xs => last(xs)
      }
    }
    val l1 = List(1, 1, 2, 3, 5, 8)
    val l2 = List()

    val value_1 = last(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = last(l2)
    println("" + l2 + " => " + value_2)
}
