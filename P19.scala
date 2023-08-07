object F19 {

  def rotate[T](t: Int, l: List[T]): List[T] = {
    if (l.isEmpty) return List()

    if (t >= 0) l.drop(t % l.size) ++ l.take(t % l.size)

    else rotate(-t, l.reverse).reverse
  }
}

object P19 extends App {
    val l1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

    val value_1 = F19 rotate (0, l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F19 rotate (-2, l2)
    println("" + l2 + " => " + value_2)
}
