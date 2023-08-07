object F20 {

  def removeAt[T](t: Int, l: List[T]): (List[T], T) = {
    if (t < 0 || t > l.size) throw new RuntimeException("quease")

    (l.take(t) ::: l.drop(t + 1), l(t))
  }
}

object P20 extends App {
    val l1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

    val value_1 = F20 removeAt (0, l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F20 removeAt (10, l2)
    println("" + l2 + " => " + value_2)
}
