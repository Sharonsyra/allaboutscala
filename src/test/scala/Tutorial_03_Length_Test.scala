import org.scalatest.{FlatSpec, Matchers}


class Tutorial_03_Length_Test extends FlatSpec with Matchers {

  "Length and size of donuts" should "be equal to 3" in {
    val donutStore = new DonutStore()
    val donuts = donutStore.donuts()
    donuts should have size 3
    donuts should have length 3
  }
}
