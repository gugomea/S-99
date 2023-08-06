object P05 extends App {

    def reverse(l: List[Int]): List[Int] = {
      l match {
        case Nil => Nil
        case x :: xs => reverse(xs) ++ (x :: Nil)
      }
    }

    val l1 = List(1, 1, 2, 3, 5, 8)
    val l2 = List()

    val value_1 = reverse(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = reverse(l2)
    println("" + l2 + " => " + value_2)
}
