object F18 {

  def slice[T](i: Int, k: Int, l: List[T]): List[T] = {
    if(l.isEmpty) return Nil;
    (i, k) match {
      case (0, 0) => Nil
      case(0, k) => l.head :: slice(i, k -1, l.tail)
      case(i, k) => slice(i - 1, k - 1, l.tail)
    }
  }
}

object P18 extends App {
    val l1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

    val value_1 = F18 slice (3, 7, l1)
    println("" + l1 + " => " + value_1)
}
