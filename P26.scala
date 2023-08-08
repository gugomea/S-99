object F26 {

  def combinations[T](n: Int, l: List[T]): List[List[T]] = {
    def combinationsInm(nI: Int, acc: List[T], list: List[T]): List[T] = {
      (nI, list.size) match {
        case (_, a) if a < nI => Nil
        case (0, _) => acc
        case _ => combinationsInm(nI, acc, list.tail) ++
                  combinationsInm(nI - 1, list.head :: acc, list.tail)
      }
    }
    combinationsInm(n, List(), l).grouped(n).toList
  }
}

object P26 extends App {

    val l1 = List('a', 'b', 'c', 'd', 'e', 'f')
    val l2 = List('a', 'b', 'c', 'd')

    val value_1 = F26 combinations (3, l1)
    println("" + l1 + " => " + value_1)

    val value_2 = F26 combinations (2, l2)
    println("" + l2 + " => " + value_2)
}
