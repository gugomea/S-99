import F09.pack

object F10 {
  def encode[T](l: List[T]): List[(Int, T)] = {
    val lista = pack(l)

    lista.map( I => (I.size, I(0)))
  }
}

object P10 extends App {

    val l1 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val l2 = List()

    val value_1 = F10 encode(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F10 encode (l2)
    println("" + l2 + " => " + value_2)

}
