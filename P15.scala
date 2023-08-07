object F15 {

  def duplicateN[T](veces: Int, l: List[T]): List[T] = {
    l.flatMap(List.fill(veces)(_))
  }
}

object P15 extends App {

    val l1 = List('a', 'b', 'c', 'c', 'd')
    val l2 = List()

    val value_1 = F15 duplicateN (3, l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F15 duplicateN (3, l2)
    println("" + l2 + " => " + value_2)

}
