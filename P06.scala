object P06 extends App {

    def isPalindrome(l: List[Int]): Boolean = {
      l match {
        case Nil => true
        case List(n) => true
        case p :: (m :+ u) => p == u && isPalindrome(m)
        case _ => throw new RuntimeException("don't understand why this case is necessary")
      }
    }

    val l1 = List(1, 2)
    val l2 = List(1, 2, 3, 2, 3, 2, 1)

    val value_1 = isPalindrome(l1)
    println("" + l1 + " => " + value_1)

    val value_2 = isPalindrome(l2)
    println("" + l2 + " => " + value_2)
}
