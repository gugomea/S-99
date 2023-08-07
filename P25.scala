import F23.randomSelect
object F25 {

  val rnd = new scala.util.Random

  def randomPermute[T](l: List[T]): List[T] = {
    randomSelect(l.size, l)
  }
}

object P25 extends App {

    val l1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

    val value_1 = F25 randomPermute (l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F25 randomPermute (l2)
    println("" + l2 + " => " + value_2)
}
