object P04 extends App {

    def length(l: List[Int]): Int = {
      l match {
        case Nil => 0
        case _ :: xs => 1 + length(xs)
      }
    }

    val l1 = List(1, 1, 2, 3, 5, 8)
    val l2 = List()

    val value_1 = length(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = length(l2)
    println("" + l2 + " => " + value_2)
}
