import org.scalatest.{FlatSpec, Matchers}

class Tutorial_08_Private_Method_Test extends FlatSpec with Matchers {

  "Example of testing private method" should "be valid" in {
    val donutStore = new DonutStore()
    val priceWithDiscount = donutStore.donutPrice("vanilla donut")
    priceWithDiscount shouldEqual Some(1.6)

    // test the private method discountByDonut()
    import org.scalatest.PrivateMethodTester._
    val discountByDonutMethod = PrivateMethod[Double]('discountByDonut)
    val vanillaDonutDiscount = donutStore invokePrivate discountByDonutMethod("vanilla donut")
    vanillaDonutDiscount shouldEqual 0.2
  }

}
