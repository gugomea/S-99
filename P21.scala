object F21 {

  def insertAt[T](element: T, idx: Int, l: List[T]): List[T] = {
    if (idx < 0 || idx > l.size) throw new RuntimeException("quease")

    l.take(idx) ::: (element :: l.drop(idx))
  }
}

object P21 extends App {
    val l1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

    val value_1 = F21 insertAt ('Ñ', 0, l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F21 insertAt ('Ñ', 10, l2)
    println("" + l2 + " => " + value_2)
}
