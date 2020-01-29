import org.scalatest.{FlatSpec, Matchers}

class Tutorial_02_Equality_Test extends FlatSpec with Matchers {
  behavior of "DonutStore class"

  "favourite donut" should "match vanilla donut" in {
    val donutStore = new DonutStore()
    donutStore.favouriteDonut() shouldEqual "vanilla donut"
    donutStore.favouriteDonut() === "vanilla donut"
    donutStore.favouriteDonut() should not equal "plain donut"
    donutStore.favouriteDonut() should not be "plain donut"
    donutStore.favouriteDonut() !== "Plain donut"
  }
}

// The DonutStore class which we are testing using ScalaTest
class DonutStore {
  def favouriteDonut(): String = "vanilla donut"

  def donuts(): Seq[String] = Seq("vanilla donut", "plain donut", "glazed donut")

  def printName(): Unit = {
    throw new IllegalStateException("Some Error")
  }

  def donutPrice(donut: String): Option[Double] = {
    val prices = Map(
      "vanilla donut" -> 2.0,
      "plain donut"   -> 1.0,
      "glazed donut"  -> 3.0
    )
    val priceOfDonut = prices.get(donut)
    priceOfDonut.map{ price => price * (1 - discountByDonut(donut)) }
  }

  private def discountByDonut(donut: String): Double = {
    val discounts = Map(
      "vanilla donut" -> 0.2,
      "plain donut"   -> 0.1,
      "glazed donut"  -> 0.3
    )
    discounts.getOrElse(donut, 0)
  }

}
