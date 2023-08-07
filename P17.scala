object F17 {

  def split[T](nth: Int, l: List[T]): (List[T], List[T]) = {
    (l.take(nth), l.drop(nth))
  }
}

object P17 extends App {

    val l1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val l2 = List()

    val value_1 = F17 split (3, l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F17 split (0, l1)
    println("" + l1 + " => " + value_2)

}
