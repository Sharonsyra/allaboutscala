import org.scalatest.{FlatSpec, Matchers}

class Tutorial_06_Type_Test extends FlatSpec with Matchers {

  "Examples of type assertions" should "be valid" in {
    val donutStore = new DonutStore()
    donutStore shouldBe a [DonutStore]
    donutStore.favouriteDonut() shouldBe a [String]
    donutStore.donuts() shouldBe a [Seq[_]]
  }

}
