object F26 {

  val rnd = new scala.util.Random

  def combinations[T](n, l: List[T]): List[List[T]] = {
    List(l)
  }
}

object P26 extends App {

    val l1 = List('a', 'b', 'c', 'd', 'e', 'f')
    val l1 = List('a', 'b', 'c', 'd', 'e', 'f')

    val value_1 = F26 combinations (3, l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F26 combinations (4, l2)
    println("" + l2 + " => " + value_2)
}
