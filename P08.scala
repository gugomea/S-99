object P08 extends App {

    def compress[T](l: List[T]): List[T] = {
      l match {
        case Nil => Nil
        case a :: b :: xs if a == b => compress(b :: xs)
        case a :: xs => a :: compress(xs)
      }
    }

    val l1 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val l2 = List(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 5)

    val value_1 = compress(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = compress(l2)
    println("" + l2 + " => " + value_2)

}
