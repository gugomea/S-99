object F24 {

  val rnd = new scala.util.Random

  def lotto(n: Int, m: Int): List[Int] = {
    if (n <= 0) List()
    else 1 + rnd.nextInt(m) :: lotto(n - 1, m)
  }
}

object P24 extends App {
    val value_1 = F24 lotto (6, 49)
    println(value_1)

    val value_2 = F24 lotto (4, 1)
    println(value_2)
    val rnd = new scala.util.Random
}
