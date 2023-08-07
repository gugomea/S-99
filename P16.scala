object F16 {

  def drop[T](nth: Int, l: List[T]): List[T] = {
    def dropInm[T](n: Int, list: List[T]): List[T] = {
      if(list.isEmpty) Nil

      else if (n == 1) dropInm(nth, list.tail)
      else list.head :: dropInm(n - 1, list.tail)
    }

    dropInm(nth, l)
  }
}

object P16 extends App {

    val l1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val l2 = List()

    val value_1 = F16 drop (3, l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F16 drop (0, l1)
    println("" + l1 + " => " + value_2)

}
