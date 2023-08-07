object F22 {

  def range(a: Int, b: Int): List[Int] = {
    if (a > b) List()
    else a :: range(a + 1, b)
  }
}

object P22 extends App {
    val value_1 = F22 range (4, 9)
    println(value_1)

    val value_2 = F22 range (0, -1)
    println(value_2)
}
