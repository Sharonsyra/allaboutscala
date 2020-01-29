import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Millis, Seconds, Span}
import org.scalatest.{FlatSpec, Matchers}

class Tutorial_09_Future_Test extends FlatSpec with Matchers with ScalaFutures {

  implicit override val patienceConfig: PatienceConfig =
    PatienceConfig(timeout = Span(5, Seconds), interval = Span(500, Millis))

  "Example of testing asychronous futures" should "be valid" in {
    val donutStore = new DonutStore()
//    val donutSalesTaxFuture = donutStore.donutSalesTax("vanilla donut")
//
//    whenReady(donutSalesTaxFuture) { salesTaxForVanillaDonut  =>
//      salesTaxForVanillaDonut shouldEqual 0.15
//    }
  }

}