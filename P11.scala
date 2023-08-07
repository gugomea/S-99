import F09.pack

object F11 {
  def encode[T](l: List[T]): List[Any] = {
    val lista = pack(l)

    def apply(list: List[T]): Any = {
      if (list.size == 1) list.head
      else (list.size, list.head)
    }

    lista.map(apply)
  }
}

object P11 extends App {

    val l1 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val l2 = List()

    val value_1 = F11 encode(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F11 encode (l2)
    println("" + l2 + " => " + value_2)

}
