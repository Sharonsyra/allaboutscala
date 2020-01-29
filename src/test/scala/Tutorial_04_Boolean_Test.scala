import org.scalatest.{FlatSpec, Matchers}

class Tutorial_04_Boolean_Test extends FlatSpec with Matchers{

  "Examples of boolean assertions" should "be valid" in {
    val donutStore = new DonutStore()
    val donuts = donutStore.donuts()
    donuts.nonEmpty shouldEqual true
    donuts.size === 3
    donuts.contains("chocolate donut") shouldEqual false
    donuts should not be empty
    donutStore.favouriteDonut() should not be empty
  }

}
