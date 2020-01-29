import org.scalatest.{FlatSpec, Matchers}

class Tutorial_07_Exception_Test extends FlatSpec with Matchers {

  "Method DonutStore.printName()" should "throw IllegalStateException" in {
    val donutStore = new DonutStore()
    intercept[java.lang.IllegalStateException] {
      donutStore.printName()
    }
  }

  "Exception thrown by method printName()" should "contain message Some Error" in {
    val donutStore = new DonutStore()
    val exception = the [java.lang.IllegalStateException] thrownBy {
      donutStore.printName()
    }
    // here we verify that the exception class and the internal message
    exception.getClass shouldEqual classOf[java.lang.IllegalStateException]
    exception.getMessage should include ("Some Error")
  }

  "Exception thrown by method printName()" should "contain message Some Error using ScalaTest should have message methods" in {
    val donutStore = new DonutStore()
    the [java.lang.IllegalStateException] thrownBy {
      donutStore.printName()
    } should have message "Some Error"
  }

}
